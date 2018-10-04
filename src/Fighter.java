public class Fighter {
    private String name;
    private int weight;
    private String record;

    //Accessors
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getRecord() {
        return record;
    }

    //Mutators

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    //Convert to String

    public String toString() {
        return "Name: " + name + "\nWeight: " + weight + "\nRecord: " + record;
    }

    //Constructors

    public Fighter() {
        this("No Name Specified", 0, "No Record Provided");
    }

    public Fighter(String n, int w, String r) {
        this.name = n;
        this.weight = w;
        this.record = r;
    }
}
