package Homework;
import java.util.Scanner;

public class Decisions {
    static int realSolutions(double a, double b, double c){
        double d = Math.pow(b, 2) - (4*a*c);
        if (d==0){
            return 1;
        } else if (d>0){
            return 2;
        } else {
            return 0;
        }
    }
    static String militaryToStandard(String t){
        int h = Integer.parseInt(t.substring(0, 2));
        int m = Integer.parseInt(t.substring(t.indexOf(":")+1, t.length()));
        if (h>12){
            return String.format("%d:%d PM", h-12, m);
        } else {
            return String.format("%d:%d AM", h, m);
        }
    }
    static boolean isTriangle(double a, double b, double c){
        if (a + b > c || a + c > b || b + c > a){
            return true;
        }
        return false;
    }
    static String typeTriangle(double a, double b, double c){
        if (a + b > c || a + c > b || b + c > a){
            int es = 0;
            if (a == b){
                es++;
            }
            if (a == c){
                es++;
            }
            if (c == b){
                es++;
            }
            if (es == 3){
                return "Equilateral";
            } else if (es == 2){
                return "Isoceles";
            } else {
                return "Scalene";
            }
        }
        return "NAT";
    }
    static double areaOfTriangle(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    static double perimeterOfTriangle(double a, double b, double c){
        return a+b+c;
    }
    static void triangleInfo(java.util.Scanner userIn){
        System.out.println("What info about a triangle do you need?");
        System.out.println("1: Type");
        System.out.println("2: Area");
        System.out.println("3: Perimeter");
        String s = userIn.nextLine();
        System.out.println("Enter sides (a b c)");
        double a = userIn.nextDouble();
        double b = userIn.nextDouble();
        double c = userIn.nextDouble();
        if (s.toLowerCase().equals("type") || s.equals("1")){
            System.out.println(typeTriangle(a, b, c));
        } else if(s.toLowerCase().equals("area") || s.equals("2")){
            System.out.println(areaOfTriangle(a, b, c));
        } else if(s.toLowerCase().equals("perimeter") || s.equals("3")){
            System.out.println(perimeterOfTriangle(a, b, c));
        } else {
            System.out.println("Not a valid option.");
        }
    }
    static boolean validChessPosition(String p){
        if(p.substring(0,1).toLowerCase().equals("a")||p.substring(0,1).toLowerCase().equals("b")||p.substring(0,1).toLowerCase().equals("c")||p.substring(0,1).toLowerCase().equals("d")||p.substring(0,1).toLowerCase().equals("e")||p.substring(0,1).toLowerCase().equals("f")||p.substring(0,1).toLowerCase().equals("g")||p.substring(0,1).toLowerCase().equals("h")){
            if(Integer.valueOf(p.substring(1,2)) <= 8 && Integer.valueOf(p.substring(1,2)) >= 0){
                return true;
            }
        }
        return false;
    }
    static boolean sameColumn(String p1, String p2){
        if(p1.substring(0,1).toLowerCase().equals(p2.substring(0,1).toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
    static boolean sameRow(String p1, String p2){
        if (Integer.valueOf(p1.substring(1,2)) == Integer.valueOf(p2.substring(1,2))){
            return true;
        } else{
            return false;
        }
    }
    static boolean sameDiagonal(String p1, String p2){
        if (Integer.valueOf(p1.substring(1,2)) == Integer.valueOf(p2.substring(1,2)) - 1 || Integer.valueOf(p1.substring(1,2)) == Integer.valueOf(p2.substring(1,2)) + 1){
            return true;
        } else{
            return false;
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
    static boolean validDate(String d){
        int y = Integer.parseInt(d.substring(0, 4));
        int m = Integer.parseInt(d.substring(5, 7));
        int dy = Integer.parseInt(d.substring(8, d.length()));
        if (dy <= 0 || m <= 0 || y <= 0 || dy > 31 || m > 12){
            return false;
        }
        if (m == 2 && isLeapYear(y)){
            if (dy > 29){
                return false;
            }
        } else {
            if (dy > 28){
                return false;
            }
        }
        return true;
    }
    static String season(Scanner userIn){
        System.out.println("Input month & day (Eg. March 7)");
        String m = userIn.next().toLowerCase();
        int d = userIn.nextInt();
        if (m.equals("january") || m.equals("february")){
            return "Winter";
        } else if(m.equals("march")){
            if (d >= 20){
                return "Spring";
            } else{
                return "Winter";
            }
        } else if (m.equals("april") || m.equals("may")){
            return "Spring";
        } else if(m.equals("june")){
            if (d >= 20){
                return "Summer";
            } else{
                return "Spring";
            }
        } else if (m.equals("july") || m.equals("august")){
            return "Summer";
        } else if(m.equals("september")){
            if (d >= 22){
                return "Fall";
            } else{
                return "Summer";
            }
        } else if (m.equals("october") || m.equals("november")){
            return "Fall";
        } else if(m.equals("december")){
            if (d >= 21){
                return "Winter";
            } else{
                return "Fall";
            }
        } else {
            return "NaD";
        }
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println(validDate("2025-02-29"));
        userIn.close();
    }
}
