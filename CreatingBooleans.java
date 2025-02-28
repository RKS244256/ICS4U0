import java.util.Scanner;

public class CreatingBooleans {
    static boolean isFourDigitNumber(String n){
        // return String.valueOf(Integer.parseInt(n)).length() == 4; Assumes input is number
        return n.length() == 4 && Character.isDigit(n.charAt(0)) && Character.isDigit(n.charAt(1)) && Character.isDigit(n.charAt(2)) && Character.isDigit(n.charAt(3)) && n.charAt(0) != '0';
    }
    static boolean isBinary(String n){
        // return !n.contains("2") && !n.contains("3") && !n.contains("4") && !n.contains("5") && !n.contains("6") && !n.contains("7") && !n.contains("8") && !n.contains("9"); 
        return n.replace("0", "").replace("1", "").length() == 0;
    }
    static void ofAge(Scanner userIn){
        System.out.println("What age are you?\n");
        int age = userIn.nextInt();
        if (age >= 18) {
            System.out.println("Go vote in the next provincial election!");
        }
        else {
            System.out.printf("Wait %d more year(s)\n", 18-age);
        }
    }
    static void gradeDeterminer(Scanner userIn){
        System.out.println("Input grade (0-100)");
        int grade = userIn.nextInt();
        if (grade > 79){
            System.out.println('A');
        } else if (grade < 80 && grade > 60){
            System.out.println('B');
        } else {
            System.out.println("Failure");
        }
    }
    static void spkmn(Scanner UserIn){
        System.out.println("Enter your type (fire, water, grass)");
        String t = UserIn.next().toLowerCase();
        if (t.equals("fire")){
            System.out.println("Charmander");
        } else if (t.equals("water")){
            System.out.println("Squirtle");
        } else if (t.equals("grass")){
            System.out.println("Bulbasaur");
        } else {
            System.out.println("No pokemon for you...");
        }
    }
    static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 != 0) {
                if (year % 400 != 0)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println(isFourDigitNumber("0234"));
        System.out.println(isFourDigitNumber("123"));
        System.out.println(isFourDigitNumber("1234"));
        System.out.println(isBinary("1010101010102"));
        // ofAge(userIn);
        // gradeDeterminer(userIn);
        // spkmn(userIn);
        System.out.println(isLeapYear(2048));
        userIn.close();
    }
}
