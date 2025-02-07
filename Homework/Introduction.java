package Homework;

public class Introduction {
    public static void greeting(String name) {
        System.out.printf("Welcome back to school %s!\n", name);
    }
    public static int yearsToDays(int years) {
        return years*365;
        //return years*365+Math.round(years/4); if you want to account for leap years
    }
    public static float areaOfTriangle(float base, float height) {
        return (base*height)/2;
    }
    public static float areaOfTriangle(float a, float b, float c){
        double s = (a+b+c)/2;
        return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String[] args) {
        Introduction.greeting("Ryan");
        System.out.println(yearsToDays(5));
        System.out.println(areaOfTriangle(1, 1));
        System.out.println(areaOfTriangle((float) Math.sqrt(2), 1, 1));
    }
}