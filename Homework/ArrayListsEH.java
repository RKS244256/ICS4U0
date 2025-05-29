package Homework;

import java.util.Arrays;

public class ArrayListsEH {
    static int largestVal(int[][] nia){
        int o = 0;
        for(int[] ia : nia){
            for(int i : ia){
                if(i > o){
                    o = i;
                }
            }
        }
        return o;
    }

    static int[] sums(int[][] nia){
        int[] o = new int[nia.length];
        int wi;
        for(int i = 0; i<nia.length; i++){
            wi = 0;
            for(int ni : nia[i]){
                wi += ni;
            }
            o[i] = wi;
        }
        return o;
    }

    static int[] colSums(int[][] nia){
        int[] o = new int[nia[0].length];
        int wi;
        for(int iai = 0; iai < nia[0].length; iai++){
            wi = 0;
            for(int niai = 0; niai < nia.length; niai++){
                wi += nia[niai][iai];
            }
            o[iai] = wi;
        }
        return o;
    }

    static int[] highRow(int[][] nia){
        int oi = 0;
        int h = 0;
        int[] rs = sums(nia);
        for(int i = 0; i<rs.length; i++){
            if(h < rs[i]){
                h = rs[i];
                oi = i;
            }
        }
        return nia[oi];
    }

    static int[] highCol(int[][] nia){
        int[] o = new int[nia.length];
        int oi = 0;
        int h = 0;
        int[] cs = colSums(nia);
        for(int i = 0; i<cs.length; i++){
            if(h < cs[i]){
                h = cs[i];
                oi = i;
            }
        }
        h = 0;
        for(int[] ia : nia){
            o[h] = ia[oi];
            h++;
        }
        return o;
    }

    static int binaryEdgingStreak(int[][] nia) throws IllegalArgumentException{
        int o = 0;
        int c = 0;
        int ws = 1;
        for(int[] ia : nia){
            ws = 1;
            for(int i : ia){
                if(i != 0 && i != 1){
                    throw new IllegalArgumentException();
                }
                if(i != c){
                    ws = 1;
                    c = i;
                } else{
                    ws++;
                }
            }
            o = ws;
        }
        return o;
    }

    public static void main(String[] args) {
        int[][] nia = {{1,2,3,4}, {5,6,8,9}, {4,5,7,8}};
        int[][] binary = {{1,1,0,1}, {1,0,1,1}, {0,1,1,1}};
        System.out.println(Arrays.toString(highCol(nia)));
        System.out.println(binaryEdgingStreak(binary));
    }
}
