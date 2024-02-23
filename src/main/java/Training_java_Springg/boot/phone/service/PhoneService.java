package Training_java_Springg.boot.phone.service;

import Training_java_Springg.boot.phone.dto.request.PhoneRequest;
import Training_java_Springg.boot.phone.dto.response.PhoneResponse;

public interface PhoneService {

    PhoneResponse create(PhoneRequest request);
}
