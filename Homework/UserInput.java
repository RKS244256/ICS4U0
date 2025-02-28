package Homework;

import java.util.Scanner;

class UserInput {
    static void nameReversal(){
        Scanner userIn = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = userIn.nextLine();
        System.out.println("Last name: ");
        String lastName = userIn.nextLine();
        userIn.close();
        System.out.printf("%s, %s\n", lastName, firstName);
    }
    static void envelopeGen(){
        Scanner userIn = new Scanner(System.in);
        System.out.println("Name? ");
        String name = userIn.nextLine();
        System.out.println("Street Address? ");
        int hNum = userIn.nextInt();
        String street = userIn.next() + " " + userIn.next();
        System.out.println("City? ");
        String city = userIn.next();
        System.out.println("Postal Code? ");
        String postal = userIn.next();
        System.out.println("Province? ");
        String province = userIn.next();
        userIn.close();
        System.out.printf("%s\n%d %s\n%s, %s\n%s, Canada\n", name, hNum, street, city, postal, province);
    }
    static void readAddress(){
        Scanner userIn = new Scanner(System.in);
        
        System.out.printf("%s, %s %s %s, %s, %s, %s\n", userIn.next(), userIn.next(), userIn.next(), userIn.next(), userIn.next(), userIn.next(), userIn.next());

        userIn.close();
    }
    public static void main(String[] args) {
        // nameReversal();
        // envelopeGen();
        // readAddress();
    }
}
