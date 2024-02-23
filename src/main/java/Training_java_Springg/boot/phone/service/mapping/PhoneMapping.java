package Training_java_Springg.boot.phone.service.mapping;

import Training_java_Springg.boot.phone.dto.request.PhoneRequest;
import Training_java_Springg.boot.phone.dto.response.PhoneResponse;
import Training_java_Springg.boot.phone.entity.PhoneEntity;

public class PhoneMapping {
    public static PhoneEntity convertDtoToEntity(PhoneRequest dto){
        PhoneEntity entity = new PhoneEntity();
        entity.setName(dto.getName());
        entity.setBrand(dto.getBrand());
        entity.setColor(dto.getColor());
        entity.setModel(dto.getModel());
        entity.setStorageCapacity(dto.getStorageCapacity());
        return entity;
    }
    public static PhoneResponse convertEntityToPhoneResponse(PhoneEntity entity){
        PhoneResponse dto = new PhoneResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setBrand(entity.getBrand());
        dto.setColor(entity.getColor());
        dto.setModel(entity.getModel());
        dto.setStorageCapacity(entity.getStorageCapacity());
        return dto;
    }
}
