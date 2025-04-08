package Homework;

public class Triangle {
    double l;
    double w;
    Triangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    double perimeter(){
        return l + w + Math.sqrt(Math.pow(w, 2)+Math.pow(l, 2));
    }
    double area(){
        return (l*w)/2;
    }
    String classify(){
        double a = l;
        double b = w;
        double c = Math.sqrt(Math.pow(w, 2)+Math.pow(l, 2));
        if(a==b&&b==c){
            return "Equilateral";
        } else if(a==b || b==c || a==c){
            return "Isosceles";
        } else{
            return "Scalene";
        }
    }
    public Triangle clone(){
        return new Triangle(l, w);
    }
    boolean equals(Triangle other){
        return other.l == l && other.w == w;
    }
}
