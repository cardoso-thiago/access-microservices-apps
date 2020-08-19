package br.com.mastertech.accessinfoapp.consumer;

import br.com.mastertech.access.model.AccessInfo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class AccessInfoConsumer {
    @KafkaListener(topics = "spec4-thiago-cardoso-1", groupId = "accessInfo")
    public void receiveAccessInfo(@Payload AccessInfo accessInfo) throws IOException {
        writeToCsvFile(accessInfo);
    }

    private void writeToCsvFile(AccessInfo accessInfo) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        String dateReport = LocalDate.now().format(formatter);
        File csvFile = new File("report/access_" + dateReport + ".csv");
        FileWriter out = new FileWriter(csvFile, true);
        if (csvFile.length() > 0) {
            try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT)) {
                printer.printRecord(accessInfo.getCustomer(), accessInfo.getDoor(), accessInfo.getHasAccess());
            }
        } else {
            String[] headers = {"customer", "door", "access"};
            try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withHeader(headers))) {
                printer.printRecord(accessInfo.getCustomer(), accessInfo.getDoor(), accessInfo.getHasAccess());
            }
        }
    }
}