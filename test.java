import java.util.Scanner;
//In: 5
//5
//45
//345
//2345
//12345
class test{
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int n = u.nextInt();
        StringBuilder s = new StringBuilder();
        for(int i = n; i > 0; i--){
            System.out.println(String.valueOf(i) + s);
            s = new StringBuilder().append(i).append(s);
        }
        u.close();
    }
}