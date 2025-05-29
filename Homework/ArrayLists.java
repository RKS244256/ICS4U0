package Homework;
import java.util.Arrays;
import java.util.Random;
class ListUtilities{
    static int[] shift(int[] ia, int n){
        int[] o = new int[ia.length+n];
        for(int i : ia){
            o[n] = i;
            n++;
        }
        return o;
    }
}

class ArrayLists{
    public static void main(String[] args) {
        int[] ia = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(ListUtilities.shift(ia, 5)));
    }
}
