package Homework;

class ExtraPractice {
    // Write a method that takes in a radius and height and 
    //returns and volume of the cylinder
    // with that radius and height
    static int cylinderVolume(int radius, int height) {
        return (int) (3.14*Math.pow(radius, 2)*height);
    }
    // Write a method that takes in a radius and height and 
    //returns the surface area of the cylinder
    // with that radius and height
    static int cylinderSurfaceArea(int radius, int height) {
        return (int) (2*3.14*radius*height)+(int) (2*3.14*Math.pow(radius, 2));
    }

    // Write a method that takes in a number of seconds 
    // and prints the numbers of minutes and seconds in that time
    // for example if the input is 187 
    //-> the output will be 3 min and 7 seconds
    static void secondsToMinutes(int secs) {
        int mins = Math.round(secs/60);
        int osecs = secs - (mins*60);
        System.out.printf("%d min and %d seconds\n", mins, osecs);
    }

    // Write a method that takes in a number of seconds 
    //and prints the number of hours, minutes and seconds in that time
    // for example if the input is 4000 -> the output will be 1 hr 6 min and 40 seconds
    static void secondsToHours(int secs) {
        int hours = Math.round(secs/3600);
        secs = secs - (hours*3600);
        int mins = Math.round(secs/60);
        secs = secs - (mins*60);
        System.out.printf("%d hours, %d min, and %d seconds\n", hours, mins, secs);
    }
    // Write a method that takes in 3 numbers and prints them from smallest to largest
    // for example if the input is 60, 80, 30 -> the output will be 30, 60, 80
    static void sortNum(int a, int b, int c) {
        System.out.printf("%d, %d, %d\n", Math.min(Math.min(a, b), c), Math.max(Math.min(a, b), c), Math.max(Math.max(a, b), c));
    }

    public static void main(String[] args) {
        System.out.println(cylinderVolume(5, 10));
        System.out.println(cylinderSurfaceArea(5, 10));
        secondsToMinutes(120);
        secondsToHours(4000);
        sortNum(60, 80, 30);
    }
}
