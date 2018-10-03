public class Animal {
    private String type;
    private double weight;
    private int age;
    private int number;
    private String[] continents = new String[number];

    //Accessors

    public String getType() {
        return type;
    }

    public String[] getContinents() {
        return continents;
    }

    public double getWeight(){
        return weight;
    }

    public int getAge() {
        return age;
    }

    //mutators


    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //ToString Method
    public String toString() {
        String allContinents = "";

        for (int i = 0; i < continents.length; i++){
            if(continents[i] != null){
                allContinents = continents[i] + ", ";
            }
        }

        return "Type: " + type + "Continents: " + allContinents + "Weight: "  + weight + "Age: " + age;
    }

    //Constructors
    public Animal(){
        this("No Type Specified", null, 0.0, 0);
    }

    public Animal(String t, String[] c, double w, int a){
        this.type = t;
        this.continents = c;
        this.weight = w;
        this.age = a;
    }

    //Populate Array
    public int numberOfContinents(String n){
        this.number = Integer.parseInt(n);
    }


}