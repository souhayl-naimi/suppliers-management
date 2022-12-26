package entities;

public class Supplier {
    private static int count = 0;
    private int id;
    private String code;
    private String designation;
    private String city;

    public Supplier() {
    }

    public Supplier(String code, String designation, String city) {
        setId(count++);
        this.code = code;
        this.designation = designation;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", designation='" + designation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
