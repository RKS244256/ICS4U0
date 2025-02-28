package Homework;
import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        circleInfo(userIn);
        discount(userIn);
        volumeSphere(userIn);
        triangleArea(userIn);
        feetConversion(userIn);
        userIn.close();
    }
// 1. Write a program that reads the length and width of a rectangle from the user and 
// outputs and perimeter and area of the
// rectangle in a nicely formatted string. Round to 1 decimal place.
    static void rectInfo(Scanner userIn){
        System.out.println("Type length and width:");
        int l = userIn.nextInt();
        int w = userIn.nextInt();
        userIn.nextLine();
        System.out.printf("Area: %d\nPerimeter: %d\n", l*w, (2*l)+(2*w));
        
    }

// 2. Write a program that reads the radius of a circle from the user and outputs the 
// circumference and area of the circle in a nicely
// formatted string. Round to 1 decimal place.
    static void circleInfo(Scanner userIn){
        System.out.println("Enter radius: ");
        int r = userIn.nextInt();
        userIn.nextLine();
        System.out.printf("Area: %.1f\nCircumference: %.1f\n", Math.PI*Math.sqrt(r), 2*Math.PI*r);
    }

// 3. Write a program that reads the price of an item and discount in percent from 
// the user and outputs total price of the item
// including tax (13%). All values should be displayed using two decimal places.
    static void discount(Scanner userIn){
        System.out.println("Enter price (XX.XX) and discount (XX%):\n");
        float price = userIn.nextFloat();
        float discount = userIn.nextFloat() / 100;
        userIn.nextLine();
        System.out.printf("Price is %.2f\n", price*(1.00-discount)*1.13);
    }
// 4. Write a program that reads the radius of a circle from the user and outputs the 
// volume of a sphere. Use the pi constant in the
// math module in your calculations. Round to one decimal place.
    static void volumeSphere(Scanner userIn){
        System.out.println("Input radius:\n");
        int r = userIn.nextInt();
        userIn.nextLine();
        System.out.printf("Volume is %.1f\n", ((float) (4/3))*Math.PI*Math.pow(r, 3));
    }

// 5. Write a program that reads three inputs that represent the lengths of three sides (𝑠1, 𝑠2, 𝑠3) of a 
// triangle and outputs the area.
// Round to one decimal place.
    static void triangleArea(Scanner userIn){
        System.out.println("Input sides (x, y, z):\n");
        int a = userIn.nextInt();
        int b = userIn.nextInt();
        int c = userIn.nextInt();
        userIn.nextLine();
        System.out.printf("Area is %.1f\n", Math.sqrt((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }
// 𝐴𝑟𝑒𝑎 = √𝑠 × (𝑠 − 𝑠1) × (𝑠 − 𝑠2) × (𝑠 − 𝑠3) where 𝑠 is half of the perimeter: 
// 𝑠 = 𝑠1+𝑠2+𝑠3 / 2

// 6. Write a program that reads a measurement in feet from the user and outputs 3 lines: the number of miles, 
// yards and inches. All
// inputs will be whole numbers. All outputs should be whole numbers.
// 1 foot = 12 inches 1 yard = 3 feet 1 mile = 5290 feet

    static void feetConversion(Scanner userIn){
        System.out.println("Input feet: ");
        float n = userIn.nextFloat();
        userIn.nextLine();
        System.out.printf("Inches: %f, Yards: %f, Miles: %f\n", n*12, n/3, n/5290);
    }

// 7. Write a program that reads a measurement in centimetres from the user and outputs the measurement in 
// inches. Round to two
// decimal places. 1 inch = 2.54 cm
// Write a program that reads a measurement in inches and outputs the measurement in centimetres. Round to two decimal
// places. 1 inch = 2.54 cm
    static void inchToCm(Scanner userIn){
        System.out.println("Input inches: ");
        float n = userIn.nextFloat();
        System.out.printf("%.2fcm\n", n*2.54);
    }

// 8. Write a program that reads a height in metres from the user and outputs how quickly an object is 
// falling when it hits the ground
// if it dropped from that height. 
// Use 𝑣𝑓 = √𝑣𝑖 2 + 2𝑎𝑑. Hint: 𝑎 = 9.8 m
// s2 (acceleration due to gravity) and 𝑣𝑖 = 0 m
// because the
// s
// object is dropped. Round to one decimal place.
    static void objectDropVf(Scanner userIn){
        System.out.println("Input height: ");
        float d = userIn.nextFloat();
        System.out.printf("%.1fm/s[Down]\n", Math.sqrt(2*9.8*d));
    }

// 9. Write a program that reads a four digit integer and outputs the sum of the digits in the number.
    static void numberSum(Scanner userIn){
        System.out.println("Input number: ");
        int n = userIn.nextInt();
        System.out.println((n/1000)+((n%1000)/100)+((n%100)/10)+(n%10));
    }




























































// 10. Write a programs that reads 2 inputs from the user that represent feet and inches and outputs the equivalent measurement in
// inches.

// static void feetToInches(Scanner userIn){
//     int f = userIn.nextInt();
//     int i = userIn.nextInt();
// }
// Write a program that reads a number of inches from the user and outputs the equivalent number of feet and inches in the
// format: (feet)' (inches)''.
// Write a program that reads a number of hours from the user and outputs the equivalent number of days and hours in a nicely
// formatter string: 29 days 4 hours.
// Write a program that reads a duration of time from the user as a number of days, hours, minutes and seconds and outputs the
// total number of seconds represented by the duration.
// Write a program that reads a duration of time in seconds from the user and output the equivalent time in days, hours, minutes
// and seconds in a nicely formatted string: "The time duration is 3 days 5 hours 17 minutes and 3
// seconds."
    
}
