package Homework;

public class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, Point center){
        this.radius = radius;
        this.center = center.clone();
    }

    double getRadius(){
        return radius;
    }

    Point getCenter(){
        return center;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    void setCenter(Point center){
        this.center = center;
    }

    double circumference(){
        return 2*Math.PI*radius;
    }

    double area(){
        return Math.PI*Math.pow(radius, 2);
    }

    public Circle clone(){
        return new Circle(radius, center);
    }

    boolean equals(Circle other){
        return radius == other.radius && center.equals(other.center);
    }

    boolean isOverlap(Circle other){
        return center.distance(other.center) < radius+other.radius && center.distance(other.center) > Math.abs(radius - other.radius);
    }


}