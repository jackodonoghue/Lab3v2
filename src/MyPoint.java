public class MyPoint {
    private int xVal;
    private  int yVal;

    //Accessors

    public int getxVal() {
        return xVal;
    }

    public int getyVal() {
        return yVal;
    }

    //Mutators


    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }

    //Convert to String

    public String toString(){
        return "(" + xVal + "," + yVal + ")";
    }

    //Constructor

    public MyPoint(){
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.xVal = x;
        this.yVal = y;
    }

    //Move Point

    public int moveHorizontally(int x) {
        return this.xVal + x;
    }

    public int moveVertically(int y) {
        return this.yVal + y;
    }

    public void translate(int x, int y) {
        this.xVal += x;
        this.yVal += y;
    }

    public String distanceFromOrigin() {
        return String.format("%.2f",Math.sqrt((Math.pow(this.xVal,2) + Math.pow(this.yVal,2))));
    }
}
