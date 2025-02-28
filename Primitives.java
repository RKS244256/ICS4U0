public class Primitives {
    static int totalMinutes(String t){
        return (Integer.valueOf(t.substring(0,2)) * 60) + (Integer.valueOf(t.substring(3,5)));
    }
    public static void main(String[] args) {
        System.out.println(totalMinutes("03:45"));
    }
}
