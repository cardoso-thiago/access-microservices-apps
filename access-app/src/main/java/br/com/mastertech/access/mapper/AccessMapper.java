package br.com.mastertech.access.mapper;

import br.com.mastertech.access.dto.AccessRequest;
import br.com.mastertech.access.entity.Access;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccessMapper {
    AccessMapper INSTANCE = Mappers.getMapper(AccessMapper.class);

    AccessRequest accessToAccessRequest(Access access);

    Access accessRequestToAccess(AccessRequest accessRequest);
}
