public class Array {
    public static void main(String[] args) {
        int[] n_arr = {1,2,3,4,5};
        String[] uWu_magic = new String[5];
        uWu_magic[0] = "Hiii";
        uWu_magic[1] = "UwU";
        for(int i = 0; i<n_arr.length; i++){
            if(n_arr[i]%2==0){
                System.out.println(n_arr[i]);
            }
        }
        for(String i : uWu_magic){
            System.out.println(i);
        }
    }
}
