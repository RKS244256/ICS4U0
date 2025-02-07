package Sub_1;

public class Publico { // Default AM
    public static void main(String[] args) {
        System.out.print("Hello World");
	    System.out.println("Bye");
    }
    public static int increment(int number){
        number++;
        return number;
    }
    public static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
