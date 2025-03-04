package Homework;

import java.util.Scanner;

public class WhileLoopsHW {
    static StringBuilder doubleVowels(String s){
        int i = 0;
        StringBuilder o = new StringBuilder();
        while(i<s.length()){
            if("aeiou".contains(s.substring(i, i+1).toLowerCase())){
                o.append(s.substring(i, i+1).repeat(2));
            } else {
                o.append(s.substring(i, i+1));
            }
            i++;
        }
        return o;
    }

    static float scoreMC(String ak, String in){
        int i = 0;
        int s = 0;
        while(i < in.length()){
            if (in.charAt(i) == ak.charAt(i)){
                s++;
            }
            i++;
        }
        return ((float) s/(float) ak.length());
    }
    static void gpa(Scanner userIn){
        String i = userIn.next().toLowerCase();
        while (!i.equals("quit")){
            if(i.equals("a+")){
                System.out.println("4.0");
            } else if(i.equals("a")){
                System.out.println("4.0");
            } else if(i.equals("a-")){
                System.out.println("3.7");
            } else if(i.equals("b+")){
                System.out.println("3.3");
            } else if(i.equals("b")){
                System.out.println("3.0");
            } else if(i.equals("b-")){
                System.out.println("2.7");
            } else if(i.equals("c+")){
                System.out.println("2.3");
            } else if(i.equals("c")){
                System.out.println("2.0");
            } else if(i.equals("c-")){
                System.out.println("1.7");
            } else if(i.equals("d+")){
                System.out.println("1.3");
            } else if(i.equals("d")){
                System.out.println("1.0");
            } else if(i.equals("f")){
                System.out.println("0.0");
            }
            i = userIn.next().toLowerCase();
        }
    }
    static int gcf(int n, int m){
        int i = 0;
        int o = 0;
        while (i <= Math.max(m, n)){
            if (m % i == 0 && n % i == 0){
                o = i;
            }
            i++;
        }
        return o;
    }

    static int lcm(int n, int m){
        int i = 0;
        while (i <= Math.max(m, n)){
            if (m % i == 0 && n % i == 0){
                return i;
            }
            i++;
        }
        return 1;
    }
    static boolean isPrime(int n){
        int i = 2;
        while (i < n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    static int nextPrime(int n){
        while (!isPrime(n)){
            n++;
        }
        return n;
    }
    static StringBuilder primeFactorization(int p){
        StringBuilder o = new StringBuilder();
        int i = 2;
        while ((int) p != 1 && !isPrime(p)){
            if(isPrime(i) && p%i == 0){
                p = p/i;
                o.append(String.valueOf(i) + " x ");
            }
            i++;
        }
        return o.append(p);
    }
    static boolean pwRater(String p){
        int i = 0;
        int a = 0;
        if(p.length() >= 12){
            while(i < p.length()){
                if(Character.isUpperCase(p.charAt(i))){
                    a++;
                    break;
                }
            }
            while(i < p.length()){
                if(Character.isLowerCase(p.charAt(i))){
                    a++;
                    break;
                }
            }
            while(i < p.length()){
                if(Character.isDigit(p.charAt(i))){
                    a++;
                    break;
                }
            }
            while(i < p.length()){
                if("!@#$%^&*()".contains(p.substring(i, i+1))){
                    a++;
                    break;
                }
            }
            if(a >= 4){
                return true;
            }
        }
        return false;
    }
    static int digitGen(){
        return (int)(Math.random()*(10));
    }
    static int numGen(int n){
        StringBuilder o = new StringBuilder();
        String i;
        while(o.length() != n){
            i = String.valueOf(digitGen());
            if(!String.valueOf(o).contains(i)){
                o.append(i);
            }
        }
        return Integer.valueOf(String.valueOf(o));
    }
    static StringBuilder numleValidator(String a, String gu){
        StringBuilder f = new StringBuilder();
        int i = 0;
        while (i < a.length()){
            if (a.charAt(i) == gu.charAt(i)){
                f.append("G");
            } else if(a.contains(gu.substring(i,i+1))){
                f.append("Y");
            } else{
                f.append("B");
            }
            i++;
        }
        return f;
    }
    static void numle(Scanner userIn){
        int t = 0;
        String a = String.valueOf(numGen(5));
        System.out.printf("DEBUG: A:%s\n", a);
        while (t < 6){
            System.out.println("Enter guess (#####)");
            String gu = userIn.nextLine();
            if(gu.equals(a)){
                System.out.println("You win!");
                return;
            }
            System.out.printf("%d tries left\n", 5-t);
            System.out.println(numleValidator(a, gu));
            t++;
        }
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        numle(userIn);
        userIn.close();
    }
}