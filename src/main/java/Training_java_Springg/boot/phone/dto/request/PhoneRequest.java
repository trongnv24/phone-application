package Training_java_Springg.boot.phone.dto.request;

public class PhoneRequest {
    private String id ;
    private String name;
    private String brand;
    private String color;
    private String model;
    private String storageCapacity;

    public PhoneRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "PhoneRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", storageCapacity='" + storageCapacity + '\'' +
                '}';
    }
}
