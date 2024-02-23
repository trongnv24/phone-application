package Training_java_Springg.boot.phone.dto.response;

import Training_java_Springg.boot.phone.dto.request.PhoneRequest;

public class PhoneResponse extends PhoneRequest {
    private String id;

    public PhoneResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PhoneResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", model='" + getModel() + '\'' +
                ", storageCapacity='" + getStorageCapacity() + '\'' +
                '}';
    }
}
