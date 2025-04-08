package Homework;
class StringHW{
    public static void main(String[] args) {
        System.out.println(domainFinder("ryansirisena@gmail.com"));
    }
    static int lengthOfString(String s) {
        return s.length();
    }
    static String expandedForm(int n) {
        String sn = String.valueOf(n);
        return String.format("%s000+%s00+%s0+%s", sn.substring(0,1), sn.substring(1,2), sn.substring(2,3), sn.substring(3,4));
    }
    static int spaceCount(String s) {
        return s.length() - s.replace(" ", "").length();
    }
    static String vowelRemover(String s) {
        return s.replace("a", "").replace("i", "").replace("e", "").replace("o", "").replace("u", "");
    }
    static String omitDigits(String s){
        return "************" + s.substring(12, 16);
    }
    static String domainFinder(String s){
        return s.substring(s.indexOf("@")+1, s.length());
    }
    static String pigLatin(String s){
        return s.substring(1, s.length()) + s.substring(0, 1) + "ay";   
    }
}  











