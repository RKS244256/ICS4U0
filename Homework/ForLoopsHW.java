package Homework;
public class ForLoopsHW {
    static String encode(String s){
        StringBuilder o = new StringBuilder();
        String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                o.append(" ");
            }else{
                o.append(a.charAt(a.indexOf(s.substring(i, i+1))+3));
            }
        }
        return String.valueOf(o);
    }
    static String decode(String s){
        StringBuilder o = new StringBuilder();
        String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                o.append(" ");
            }else{
                o.append(a.charAt(a.indexOf(s.substring(i, i+1))-3));
            }
        }
        return String.valueOf(o);
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
    static String decodeAttempt(String s){
        StringBuilder o = new StringBuilder();
        int max = 0;
        char m = 'a';
        for(int i = 0; i<s.length(); i++){
            if(count(s.charAt(i), s) > max){
                m = s.charAt(i);
                max = count(s.charAt(i), s);
            }
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == m){
                o.append('e');
            }else if(s.charAt(i) == Character.toUpperCase(m)){
                o.append('E');
            } else{
                o.append(s.charAt(i));
            }
        }
        return String.valueOf(o);
    }
    static int toBinary(int n){
        StringBuilder o = new StringBuilder();
        while(n != 0){
            o.append(String.valueOf(n%2));
            n /= 2;
        }
        return Integer.valueOf(String.valueOf(o));
    }
    static int toDecimal(int n){
        String s = String.valueOf(n);
        int o = 0;
        for(int i = 0; i < s.length(); i++){
            o += Integer.valueOf(s.substring(i, i+1))*(int) Math.pow(2, s.length()-1-i);
        }
        return o;
    }
    static double mean(String s){
        StringBuilder tn = new StringBuilder();
        int n = 0;
        double o = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                n++;
                o += Integer.parseInt(String.valueOf(tn));
                tn = new StringBuilder();
            } else {
                tn.append(s.substring(i, i+1));
            }
            if(s.length()-1 == i){
                n++;
                o += Integer.parseInt(String.valueOf(tn));
                tn = new StringBuilder();
            }
        }
        return o / (double) n;
    }
    public static void main(String[] args) {
        System.out.println(encode("Secret Message"));
        System.out.println(decode("Vhfuhw Phvvdjh"));
        System.out.println(decodeAttempt("Vhfuhw Phvvdjh"));
        System.out.println(toBinary(5));
        System.out.println(toDecimal(101));
        System.out.println(mean("12 34 56 78 91"));
    }
}
