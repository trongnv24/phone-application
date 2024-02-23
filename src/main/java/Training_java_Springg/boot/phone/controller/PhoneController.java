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
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PhoneResponse getById(@PathVariable("id") String id){
        log.info(" === Start api getById phone === ");
        log.info(" === String id : {} ===", id);
        PhoneResponse response = service.getById(id);
        log.info(" === Finish api getById phone, Phone Id : {} === ", response.getId());
        return response;
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PhoneResponse update(@RequestBody PhoneRequest request, @PathVariable("id") String id){
        log.info(" === Start api update phone === ");
        log.info(" === Request Body : {}, String id : {}  === ", request, id);
        PhoneResponse response = service.update(request, id);
        log.info(" === Finish api update phone, Phone Id : {} === ", response.getId());
        return response;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable("id") String id ){
        log.info(" ===  Start api deleteById phone === ");
        log.info(" === String id : {} === ", id);
        log.info(" === Finish api deleteById phone, Phone Id : {} === ");
        service.deleteById(id);
    }
}
