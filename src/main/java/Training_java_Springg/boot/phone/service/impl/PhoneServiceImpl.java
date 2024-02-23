package Training_java_Springg.boot.phone.service.impl;

import Training_java_Springg.boot.phone.dto.request.PhoneRequest;
import Training_java_Springg.boot.phone.dto.response.PhoneResponse;
import Training_java_Springg.boot.phone.entity.PhoneEntity;
import Training_java_Springg.boot.phone.repository.PhoneRepository;
import Training_java_Springg.boot.phone.service.PhoneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static Training_java_Springg.boot.phone.service.mapping.PhoneMapping.convertDtoToEntity;
import static Training_java_Springg.boot.phone.service.mapping.PhoneMapping.convertEntityToPhoneResponse;

@Service
@Slf4j
public class PhoneServiceImpl implements PhoneService {
    private final PhoneRepository phoneRepository;

    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public PhoneResponse create(PhoneRequest request) {
        log.info(" === Start api create new phone === ");
        log.info(" === Request Body : {} === ", request);
        PhoneEntity entity = convertDtoToEntity(request);
        entity = phoneRepository.save(entity);
        PhoneResponse response = convertEntityToPhoneResponse(entity);
        log.info(" === Finish api create new phone, Phone Id : {} === ", response.getId());
        return response ;
    }

    @Override
    public PhoneResponse getById(String id) {
        log.info(" === Start api getById phone === ");
        log.info(" === String id : {} === ", id);
        Optional<PhoneEntity>optionalPhone = phoneRepository.findById(id);
        if (!optionalPhone.isPresent()){
            throw new RuntimeException();
        }
        PhoneEntity entity= optionalPhone.get();
        PhoneResponse response = convertEntityToPhoneResponse(entity);
        log.info(" Finish api getById phone, Phone Id : {} === ", response.getId());
        return response;
    }
    @Override
    public PhoneResponse update ( PhoneRequest request, String id){
        log.info(" === Start api update phone === ");
        log.info(" === Request Body : {}, String id : {} === ", request, id);
        Optional<PhoneEntity>optionalPhone = phoneRepository.findById(id);
        if (! optionalPhone.isPresent()){
            throw new RuntimeException();
        }
        PhoneEntity entity = optionalPhone.get();
        entity.setName(request.getName());
        entity.setBrand(request.getBrand());
        entity.setColor(request.getColor());
        entity.setModel(request.getModel());
        entity.setStorageCapacity(request.getStorageCapacity());
        entity = phoneRepository.save(entity);
        PhoneResponse response = convertEntityToPhoneResponse(entity);
        log.info(" === Finish api update phone, Phone Id : {} === ", response.getId());
        return response;
    }
}
