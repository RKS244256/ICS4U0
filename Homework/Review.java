package Homework;
import java.util.Scanner;

class Review {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println(isEmail("ryansirisena@hotmail.co"));
        userIn.close();
    }
    static int randomInt(int min, int max){
        return (int) (Math.random()*(max-min+1))+min;
    }
    static boolean isEmail(String s){
        return s.toLowerCase().matches("[a-z]{1,}@[a-z]{1,}+\\.[a-z]{1,3}");
    }
    static boolean isPerfectSquare(int n){
        // Write a method that takes a number and returns whether it is a perfect square
        if(Math.sqrt(n)%1 == 0){
            return true;
        }
        return false;
    } 
    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static String twentyFourToTwelve(String s){
        int h = Integer.valueOf(s.substring(0, s.indexOf(":")));
        if(h <= 12){
            return s + " AM";
        }
        int m = Integer.valueOf(s.substring(s.indexOf(":")+1, s.length()));
        if(m==0){
            return String.valueOf(h - 12) + ":" + "00" + " PM";
        }
        return String.valueOf(h - 12) + ":" + String.valueOf(m) + " PM";
    }
    static boolean isStrongPW(String s){
        boolean u = false;
        boolean l = false;
        boolean n = false;
        boolean c = false;
        for(int i=0; i<s.length(); i++){
            if(!u){
                u = Character.isUpperCase(s.charAt(i));
            }
            if(!l){
                l = Character.isLowerCase(s.charAt(i));
            }
            if(!n){
                n = Character.isDigit(s.charAt(i));
            }
            if(!c){
                c = !Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i));
            }
        }
        return u && l && n && c;
    }
    static void oddNums(int n){
        for(int i=1; i<n+1; i+=2){
            System.out.println(i);
        }
    }
    static void evenNums(int n){
        for(int i=2; i<n+1; i+=2){
            System.out.println(i);
        }
    }
    static int factorial(int n){
        int o = 1;
        while(n != 1){
            o *= n;
            n--;
        }
        return o;
    }
    static void multiplicationTable(int n){
        for(int i=1; i<=12; i++){
            System.out.println(i + ": " + n*i);
        }
    }
    static boolean isArmstrongNumber(String s){
        int a = 0;
        for(int i=s.length(); i>s.length()-4; i--){
            a += Math.pow(Integer.valueOf(s.substring(i, i+1)), s.length());
        }
        return a == Integer.valueOf(s);

    }
}

