import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;

public class Files {
    public static void main(String[] args) {
        System.out.println(classlistConvert());
        genLotto649();
    }
    public static HashMap<String, Integer> classlistConvert(){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        try {
            File f = new File("classlist.txt");
            Scanner r = new Scanner(f);
            while (r.hasNextLine()) {
                Scanner nr = new Scanner(r.nextLine());
                nr.useDelimiter("\\s+");
                hm.put(nr.next() + nr.next(), nr.nextInt());
                nr.close();
            }
            r.close();
        }
        catch(FileNotFoundException e){
            System.out.println("OwO: No File Found");
        }
        for(String s : hm.keySet()){
            System.out.println(s + " " + hm.get(s));
        }
        return hm;
    }
    public static void genLotto649(){
        try{
            FileWriter fw = new FileWriter("lotto.txt");
            for(int i = 0; i<100; i++){
                StringBuilder sb = new StringBuilder();
                for(int ni = 0; ni<6; ni++){
                    sb.append((int)(Math.random()*49)+1);
                }
                fw.write(String.valueOf(sb)+"\n");
            }
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
