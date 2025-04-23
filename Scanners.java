import java.util.Scanner;
import Homework.Fraction;
public class Scanners {
    public static int calc(String s){
        Scanner p = new Scanner(s);
        p.useDelimiter(" ");
        int o = Integer.parseInt(p.next());
        while(p.hasNext()){
            if(p.next().equals("+")){
                o += p.nextInt();
            } else{
                o -= p.nextInt();
            }
        }
        p.close();
        return o;
    }
    public static Fraction fracCalc(String s){
        Scanner p = new Scanner(s);
        p.useDelimiter(" ");
        String in = p.next();
        Fraction o = new Fraction(Integer.parseInt(in.substring(0,1)), Integer.parseInt(in.substring(2, 3)));
        while(p.hasNext()){
            if(p.next().equals("+")){
                in = p.next();
                o = o.add(new Fraction(Integer.parseInt(in.substring(0,1)), Integer.parseInt(in.substring(2, 3))));
            } else{
                in = p.next();
                o = o.subtract(new Fraction(Integer.parseInt(in.substring(0,1)), Integer.parseInt(in.substring(2, 3))));
            }
        }
        p.close();
        return o;
    }
    public static void main(String[] args) {
        System.out.println(fracCalc("1/2 + 1/4 - 1/8"));
    }
}
