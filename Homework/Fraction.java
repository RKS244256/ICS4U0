package Homework;
public class Fraction {
    private int num;
    private int den;

    Fraction(int num, int den){
        if (num == 0 && den != 0){
            this.num = 0;
            this.den = 1;
        }
        else{
            int d = gcd(num, den);
            if (num * den < 0){
                num = -1 * Math.abs(num);
                den = Math.abs(den);
            }
            this.num = num / d; // save the simplified fraction /divide by gcd
            this.den = den / d;

        }


    }

    static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        // start to be smallest of a b
        int d = Math.min(a, b);
        while (!(a % d == 0 && b % d == 0)){
            d --;
        }
        return d;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }
    public void setDen(int den) {
        this.den = den;
    }
    public String toString(){

        // fix for whole
        if (den == 1){
            return String.valueOf(num);
        }

        return String.format("%d/%d", num, den);
    }
    public boolean equals(Fraction another){
        return num == another.num && den == another.den;
    }
    public Fraction clone(){
        return new Fraction(num, den);
    }

    // add
    Fraction add(Fraction another){
        // a/b + c/d

        // a * d + b * c / b *d

        return new Fraction(num * another.den + den * another.num, den * another.den);
    }

    // subtract
    Fraction subtract(Fraction another){
        return new Fraction(num * another.den - den * another.num, den * another.den);
    }

    // multiply
    Fraction multiply(Fraction another){
        return new Fraction(num * another.num, den * another.den);
    }

    // divide
    Fraction divide(Fraction another){
        return new Fraction(num * another.den, den * another.num);
    }
    // isPositive
    boolean isPositive(){
        return num > 0 && den > 0;
    }
    // isMixed
    boolean isMixed(){
        return num > den;
    }

    // turnIntoDecimal
    double turnIntoDecima(){
        return num / den;
    }

    // absoluteValue
    Fraction absoluteValue(){
        return new Fraction(Math.abs(num), Math.abs(den));
    }


    public static void main(String[] args) {
        Fraction f = new Fraction(5, -1);
        Fraction g = new Fraction(-2, 4);
        Fraction h = new Fraction(0 , 1);
        Fraction k = new Fraction(0, 5);

        System.out.println(f);
        System.out.println(g);
        System.out.println(f.equals(g));
        System.out.println(h.equals(k));
        System.out.println(f.add(g));
        System.out.println(new Fraction(0, 1));
    }
    
    
}


