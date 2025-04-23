import java.util.Arrays;

public class Static {
    static String[] toLower(String[] isa){
        for(int i = 0; i<isa.length; i++){
            isa[i] = isa[i].toLowerCase();
        }
    return isa;
    }
    static String[] cropFourLess(String[] sa){
	    int rc = 0;
	    for(int i = 0; i<sa.length; i++){
		if(sa[i].length() > 3){
			rc++;
		}
	    }
	    String[] r = new String[rc];
	    rc = 0;
	    for(String s : sa){
		    if(s.length() > 3){
			r[rc] = s;
			rc++;
		    }
	    }
	    return r;
    }
    public static void main(String[] args) {
        String[] sa = {"Hiiii", "uwU", "OwO", "Neko"};
        System.out.println(Arrays.toString(sa));
	System.out.println(Arrays.toString(cropFourLess(sa)));
	System.out.println(Arrays.toString(toLower(sa)));
   }
}
