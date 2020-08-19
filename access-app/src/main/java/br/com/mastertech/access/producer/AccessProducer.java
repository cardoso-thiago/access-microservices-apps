package br.com.mastertech.access.producer;

import br.com.mastertech.access.model.AccessInfo;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccessProducer {

    private final KafkaTemplate<String, AccessInfo> accessProducer;

    public AccessProducer(KafkaTemplate<String, AccessInfo> accessProducer) {
        this.accessProducer = accessProducer;
    }

    public void sendAccessInfo(AccessInfo accessInfo){
        accessProducer.send("spec4-thiago-cardoso-1", accessInfo);
    }
}
