package Homework;
import java.util.Scanner;

public class WhileLoopsExtraHW {
    static void divisors(int n){
        int i = 1;
        while(i <= n){
            if (n % i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    static void sum(Scanner userIn){
        int i = userIn.nextInt();
        int o = 0;
        while(i != 0){
            o += i;
            i = userIn.nextInt();
        }
        System.out.println(o);
    }
    static void mtable(int n){
        int i = 1;
        while(i <= 10){
            System.out.printf("%d - %d\n", i, i*n);
            i++;
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
    static int seveneleven(int n){
        int o = 0;
        while (n != 0){
            if (n % 7 == 0 || n % 11 == 0){
                o++;
            }
            n--;
        }
        return o;
    }
    static boolean isPalindrome(String s){
        StringBuilder c = new StringBuilder();
        s = s.toLowerCase();
        int i = s.length()-1;
        while(i != -1){
            c.append(s.substring(i,i+1).toLowerCase());
            i--;
        }
        if(s.toLowerCase().equals(String.valueOf(c))){
            return true;
        }
        return false;
    }
    static void numHarass(Scanner userIn){
        String s = userIn.next();
        while(s.length() < 1 || !Character.isDigit(s.charAt(0))){
            System.out.println("Enter digit");
            s = userIn.next();
        }
        System.out.println("Thank you");
    }
    static void numRev(Scanner userIn){
        String s = userIn.next();
        StringBuilder c = new StringBuilder();
        int i = s.length()-1;
        while(i != -1){
            c.append(s.substring(i,i+1).toLowerCase());
            i--;
        }
        System.out.println(c);
    }

    static void primeList(int n){
        int i = 1;
        while(i <= n){
            if(WhileLoopsHW.isPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    static String revString(String s){
        StringBuilder c = new StringBuilder();
        int i = s.length()-1;
        while(i != -1){
            c.append(s.substring(i,i+1));
            i--;
        }
        return String.valueOf(c);
    }
    static int countNonAlphaNum(String s){
        int o = 0;
        int i = 0;
        while(i < s.length()){
            if(!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i))){
                o++;
            }
            i++;
        }
        return o;
    }
    static int findGCD(int a, int b){
        a = Math.max(a, b);
        b = Math.min(a, b);
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        return(findGCD(b, a%b));
    }
    static void primeFactors(int n){
        int c = n;
        while(n!=0){
            if(c%n==0 && WhileLoopsHW.isPrime(n)){
                System.out.println(n);
            }
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println(findGCD(270, 192));
        userIn.close();
    }
}
