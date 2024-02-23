package Training_java_Springg.boot.phone.controller;

import Training_java_Springg.boot.phone.dto.request.PhoneRequest;
import Training_java_Springg.boot.phone.dto.response.PhoneResponse;
import Training_java_Springg.boot.phone.service.PhoneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/phones")
@Slf4j
public class PhoneController  {
    private final PhoneService service;

    public PhoneController(PhoneService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PhoneResponse create(@RequestBody PhoneRequest request){
        log.info(" === Start api create new phone === ");
        log.info(" === Request Body : {} === ", request);
        PhoneResponse response = service.create(request);
        log.info(" === Finish api create new phone, Phone Id : {} === ", response.getId());
        return response;
    }
}
