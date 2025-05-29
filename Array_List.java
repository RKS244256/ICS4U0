import java.util.ArrayList;
import java.util.Arrays;
import Homework.Point;
public class Array_List {
    static boolean isDupe(String[] sa){
        Arrays.sort(sa);
        for(int i = 0; i<sa.length-1; i++){
            if(sa[i].equals(sa[i+1])){
                return true;
            }
        }
        return false;
    }
    static ArrayList<String> returnUnique(String[] sa){
        ArrayList<String> o = new ArrayList<>();
        for(String s : sa){
            if(!o.contains(s)){
                o.add(s);
            }
        }
        return o;
    }
    public static void main(String[] args) {
        String[] words = {"uwu", "owo", "kawaii", "mochi", "donatsu"};
        System.out.println(returnUnique(words));
    }
}
