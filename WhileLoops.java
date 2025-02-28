import java.util.Scanner;

class WhileLoops {
    static void countTo(int i, int f, int s){
        while (i <= f){
            System.out.println(i);
            i+=s;
        }
    }
    static void countTo(int i, int f){
        while (i <= f){
            System.out.println(i);
            i++;
        }
    }
    static void countTo(int f){
        int i = 0;
        while (i <= f){
            System.out.println(i);
            i++;
        }
    }
    static boolean hasDigit(String s){
        int i = 0;
        while (i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                return true;
            }
            i++;
        }
        return false;
    }
    static boolean hasVowel(String s){
        int i = 0;
        String v = "aeiou";
        while (i < s.length()){
            if(v.contains(s.substring(i,i+1))){
                return true;
            }
            i++;
        }
        return false;
    }
    static boolean isNumber(String s){
        int i = 0;
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }
    static int counts(String s, char c){
        int i = 0;
        int o = 0;
        while(i < s.length()){
            if(s.charAt(i) == c){
                o++;
            }
            i++;
        }
        return o;
    }
    static int countConsonants(String s){
        int i = 0;
        int o = 0;
        while (i < s.length()){
            if(Character.isLetter(s.indexOf(i)) && !"aeiou".contains(s.substring(i,i+1))){
                o++;
            }
            i++;
        }
        return o;
    }
    static int total(String s){
        int i = 0;
        int o = 0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                o += Integer.parseInt(s.substring(i, i+1));
            }
            i++;
        }
        return o;
    }
    static void average(Scanner userIn){
        int t = 0;
        int i = 0;
        String n = userIn.nextLine();
        while (!n.equals("q")){
            t += Integer.valueOf(n);
            i++;
            n = userIn.nextLine();
        }
        if(i == 0){
            System.out.println("N/A");
            return;
        }
        System.out.println(t/i);
    }
    static void sequenceAverage(Scanner userIn){
        int t = 0;
        int i = 0;
        String n = userIn.nextLine();
        while (!n.equals("q")){
            t += n.length();
            i++;
            n = userIn.nextLine();
        }
        if(i == 0){
            System.out.println("N/A");
            return;
        }
        System.out.println(t/i);
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        sequenceAverage(userIn);
        userIn.close();
    }
}
