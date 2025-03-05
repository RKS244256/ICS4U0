import java.util.Scanner;

public class ForLoops {
    static void count(int n){
        for(int i = 0; i<=n; i++){
            System.out.println(i);
        }
    }
    static void count(int n, int inc){
        for(int i = 0; i<=n; i+=inc){
            System.out.println(i);
        }
    }
    static void countdown(int n){
        for(int i=n; i>=0; i--){
            System.out.println(i);
        }
    }
    static void countdown(int n, int inc){
        for(int i=n; i>=0; i-=inc){
            System.out.println(i);
        }
    }
    static int count(char c, String s){
        int o = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c){
                o++;
            }
        }
        return o;
    }
    static int countMaxInst(String s){
        int o = 0;
        for(int i=0; i<s.length(); i++){
            if(count(s.charAt(i),s) > o){
                o = count(s.charAt(i),s);
            }
        }
        return o;
    }
    static int countMinInst(String s){
        int o = count(s.charAt(0),s);
        for(int i=0; i<s.length(); i++){
            if(count(s.charAt(i),s) < o){
                o = count(s.charAt(i),s);
            }
        }
        return o;
    }
    static void bids(Scanner userIn){
        int b1 = 0;
        int b2 = 0;
        int b3 = 0;
        String n1 = "";
        String n2 = "";
        String n3 = "";
        int nb = userIn.nextInt();
        for(int i = 0; i<nb; i++){
            String n = userIn.next();
            int b = userIn.nextInt();
            if(b1 < b){
                b1 = b;
                n1 = n;
            } else if (b2 < b){
                b2 = b;
                n2 = n;
            } else if (b3 < b){
                b3 = b;
                n3 = n;
            }
        }
        System.out.printf("%s, %s, %s\n", n1, n2, n3);
    }
    static void longestNames(Scanner userIn){
        StringBuilder o = new StringBuilder();
        int max = 0;
        int nn = userIn.nextInt();
        for(int i = 0; i<nn; i++){
            String n = userIn.next();
            if (n.length() > max){
                max = n.length();
                o = new StringBuilder();
                o.append(n + ", ");
            } else if(n.length() == max){
                o.append(n + ", ");
            }
        }
        System.out.println(o);
    }
    static String toExpandedForm(int n){
        String s = String.valueOf(n);
        StringBuilder o = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '0'){
                if(s.length()-i-1 != 0){
                    o.append(String.valueOf(Integer.valueOf(String.valueOf(s.charAt(i))) * (int) Math.pow(10, s.length()-i-1)) + " + ");
                } else {
                    o.append(String.valueOf(Integer.valueOf(String.valueOf(s.charAt(i))) * (int) Math.pow(10, s.length()-i-1)));
                }
            }
        }
        return String.valueOf(o);
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println(toExpandedForm(10561));
        userIn.close();
    }
}
