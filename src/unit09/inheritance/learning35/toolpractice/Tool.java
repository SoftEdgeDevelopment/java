package unit09.inheritance.learning35.toolpractice;

//superclass
public class Tool {
    private String name;
    private String brand;

    //generate constructor
    public Tool(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    //getters and setters

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

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
