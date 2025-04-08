package Homework;
class StringsExtraHW {
    // 1. Write a method countConsonants that takes in a String word and returns the
    // number of consonants (take into account lower and upper case)
    // countConsonants("Mississauga")
    // >>> 6

    // 2. Write a method getInitials that takes in a String name in the format last,first
    // and returns the users intials 
    // getInitials("Owens,Jack")
    // >>> "J.O"

    // 3. Write methods getX and getY that take in a String coordinate in the format (x,y)
    // and returns x and y respectively as Strings
    // getX("(23.5,89)")
    // >>> "23.5"

    // 4. Write methods getNum and getDom that take in a String fraction in the format num/den
    // and return num and den respectively as Strings
    // getNum("12/15")
    // >>> 12

    // 5. Write a method that takes in a String date in the form MM-DD-YYYY and returns
    // a String in the form YYYY-MM-DD

    // look up documentation for repeat method in String class

    // https://www.tutorialspoint.com/java/lang/string_repeat.htm

    // 6. Write a method hide that takes in a String password and returns a String with everything replaced
    // with an *

    // hide("hello")
    // >>> "*****"
    static String hide(String s){
        return "*".repeat(s.length());
    }

    // 7. Write a method cover that takes in a String name in the form first last and replaces everything
    // but the first letter of the first and last name with an *
    // cover("Jessie Owens")
    // >>> "J***** O****"
    static String cover(String s){
        return s.substring(0,1) + "*".repeat(s.substring(1, s.indexOf(" ")).length()) + " " + s.substring(s.indexOf(" ")+1, s.indexOf(" ")+2) + "*".repeat(s.substring(s.indexOf(" ")+2, s.length()).length());
    }
    
    // 8. Write a method complement that takes in a String binary made of 1's and 0's and returns the complement
    // aka all 1's become 0's and all 0's become 1's

    // complement("10101111")
    // >>> "01010000"
    static String complement(String s){
        return s.replace("0", "2").replace("1", "0").replace("2", "1");
    }

    public static void main(String[] args) {
        System.out.println(hide("Hello"));
        System.out.println(cover("Ryan Sirisena"));
        System.out.println(complement("10101111"));
    }
}
