public class Exceptions {
    static int tToM(String t){
        try{
            return Integer.valueOf(t.substring(0,t.indexOf(":")))*60 + Integer.valueOf(t.substring(t.indexOf(":")+1, t.length()));
        } catch(IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e);
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(tToM("45:p5"));
    }
}