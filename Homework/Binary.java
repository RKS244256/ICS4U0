package Homework;

public class Binary {
    private String binary;

    Binary(String binary) throws IllegalArgumentException{
        if(binary.matches("[0-1]+")){
            this.binary = binary;
        } else{
            throw new IllegalArgumentException();
        }
    }

    public String toString(){
        return binary;
    }

    boolean equals(Binary other){
        return Integer.parseInt(binary) == Integer.parseInt(other.toString());
    }

    int parseInt(){
        int p = 0;
        int o = 0;
        for(int i = binary.length()-1; i>=0; i--){
            if(binary.charAt(i) == '1'){
                o+=Math.pow(2, p);
            }
            p++;
        }
        return o;
    }

    static Binary valueOf(String s) throws IllegalArgumentException{
        if(s.matches("[0-1]+")){
            return new Binary(s);
        } else {
            throw new IllegalArgumentException();
        }
    }

    int add(Binary other){
        return parseInt() + other.parseInt();
    }

    public static void main(String[] args) {
        System.out.println(new Binary("101101").parseInt());
    }
}
