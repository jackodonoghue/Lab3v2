public class VendingMachine {
    private int tokens;
    private int cans;

    //Accessors
    public int getCans() {
        return cans;
    }

    public int getTokens() {
        return tokens;
    }

    //Mutators
    public void setCans(int cans) {
        this.cans = cans;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    //Convert to String
    public String toString() {
        return "The number of cans is" + cans + "\nThe number of tokens is " + tokens;
    }

    //Constructors
    public VendingMachine() {
        this(0, 0);
    }

    public VendingMachine(int c, int t) {
        this.cans = c;

        this.tokens = t;
    }

    //Methods to perfom nesesary actions
    public void insertToken() {
        this.cans--;

        this.tokens++;
    }

    public void fillUp (int c){
        this.cans += c;
    }
}
