import java.util.Scanner;

public class Primer {   
        public static void main(String[] args) throws Exception {
        String name = "Ryan";
        int age = 18;
        boolean minor = true;
        char first_initial;
        double doublepi = 6.28;
        float pi = 3.14f;
        first_initial = 'R';
        System.out.println("Hello, my name is " + name + ", first initial " + first_initial);
        if (age >= 18 && minor) {
            System.out.println("He is " + String.valueOf(age) + " years old and is of age");
        } else if (age < 18 && !minor) {
            System.out.println("He is " + String.valueOf(age) + " years old and is underage");
        } else {
            System.out.println("Wait a minute...");
        }
        while (pi == (float) doublepi){
            System.out.println("THE WORLD IS GOING TO SHIT");
        }
        Scanner userIn = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = userIn.nextLine();
        System.out.println("Hello " + userName + "!");
        userIn.close();
    }
}
