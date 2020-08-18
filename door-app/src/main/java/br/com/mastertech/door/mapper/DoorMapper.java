package br.com.mastertech.door.mapper;

import br.com.mastertech.door.dto.DoorRequest;
import br.com.mastertech.door.entity.Door;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DoorMapper {
    DoorMapper INSTANCE = Mappers.getMapper(DoorMapper.class);

    DoorRequest doorToDoorRequest(Door door);

    Door doorRequestToDoor(DoorRequest doorRequest);
}
