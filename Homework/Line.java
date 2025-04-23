package Homework;
class Line {
    private Fraction slope;
    private Fraction yInt;

    public Line(Fraction slope, Fraction yInt){
        this.slope = slope;
        this.yInt = yInt;
    }

    public Fraction getSlope() {
        return slope;
    }

    public void setSlope(Fraction slope) {
        this.slope = slope;
    }

    public Fraction getyInt() {
        return yInt;
    }

    public void setyInt(Fraction yInt) {
        this.yInt = yInt;
    }

    public boolean equals(Line other){
        return slope.equals(other.slope) && yInt.equals(other.yInt);
    }

    public String toString(){
        return String.format("y = %sx + %s", slope.toString(), yInt.toString());
    }

   
    public static void main(String[] args) {
       Line l = new Line(new Fraction(1,2), new Fraction(-1, 5));
       Line g = new Line(new Fraction(4,8), new Fraction(10,2));
       System.out.println(l.equals(g));
       System.out.println(l);
       
    }

    
    
}
