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
    static boolean isGTAPhone(String s){
        return s.matches("((416)|(905)|(647)|(437))-\\d{3}-\\d{4}");
    }
    public static void main(String[] args) {
        System.out.println(isGTAPhone(""));
    }
}
