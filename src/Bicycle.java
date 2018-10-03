public class Bicycle {
    private String name;
    private double value;
    private String make;

    //Accessors

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMake(String make) {
        this.make = make;
    }

    //Convert to string

    public String toString() {
        return "Name of Owner: " + name + "Value: " + value + "Model: " + make;
    }

    //Constructors

    public Bicycle() {
        this("No Owner Name", 0.0, "No Make Specified");
    }

    public Bicycle(String n, double v, String m) {
        this.name = n;
        this.value = v;
        this.make = m;
    }
}
