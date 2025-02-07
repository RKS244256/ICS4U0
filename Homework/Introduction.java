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
    public static void secondsToMinutes (int secs){
        int mins = Math.round(secs/60);
        int osecs = secs - (mins*60);
        System.out.printf("%d and %d/60\n", mins, osecs);
    }
    public static int lastNDigit (int num, int n){
        // char[] snum = String.valueOf(num).toCharArray();
        // int nnum = snum.length - n;
        // return Integer.parseInt((String.valueOf(snum[nnum])));
        return num % (int) Math.pow(10, n);

    }
    public static int randInt (int x, int y){
        return (int)(Math.random() * (Math.abs(y - x) + 1)) + Math.min(x, y);
    }
    public static int max (int x, int y, int z){
        return (Math.max(Math.max(x, y), z));
    }
    public static void main(String[] args) {
        Introduction.greeting("Ryan");
        System.out.println(yearsToDays(5));
        System.out.println(areaOfTriangle(1, 1));
        System.out.println(areaOfTriangle((float) Math.sqrt(2), 1, 1));
        secondsToMinutes(50);
        System.out.println(lastNDigit(123456, 2));
        System.out.println(randInt(123, 200));
        System.out.println(max(123, 200, 25));
    }
}