import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        input.useDelimiter(",");
        System.out.println(input.next());
        System.out.println(input.next());
        System.out.println(input.next());
        input.close();
    }
}
