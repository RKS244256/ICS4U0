public class RegExp {
    static boolean isFiveLetters(String s){
        return s.matches("[a-z]");
    }
    static boolean isStudentNumber(String s){
        return s.matches("\\d{6,7}");
    }
    static boolean isBinary(String s){
        return s.matches("1[0-1]*");
    }
    public static void main(String[] args) {
        System.out.println(isBinary("00001"));
    }
}
