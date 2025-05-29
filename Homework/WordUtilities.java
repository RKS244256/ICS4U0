package Homework;
import java.util.Arrays;
class WordUtilities{
	static boolean wordChecker(String[] listOfStrings){
		for(String s : listOfStrings){
			if(!s.substring(1, s.length()).toLowerCase().equals(s.substring(1, s.length()))){
				return false;
			}
		}
		return true;
	}
	static String[] longestLength(String[] listOfWords){
		int sm = 0;
		int m = 0;
		for(String s : listOfWords){
			if(s.length() > sm){
				sm = s.length();
				m = 0;
			}
			if(s.length() == sm){
				m++;
			}
		}
		String[] r = new String[m];
		m = 0;
		for(String s : listOfWords){
			if(s.length() == sm){
				r[m] = s;
				m++;
			}
		}
		return r;
	}
	static boolean areAnagrams(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		String[] sa1 = new String[s1.length()];
		String[] sa2 = new String[s2.length()];
		for(int i = 0; i<s1.length(); i++){
			sa1[i] = s1.substring(i, i+1);
			sa2[i] = s2.substring(i, i+1);
		}
		Arrays.sort(sa1);
		Arrays.sort(sa2);
		return Arrays.equals(sa1, sa2);
	}
	static boolean isUnique(String[] listOfWords){
		for(int i = 0; i<listOfWords.length; i++){
			listOfWords[i] = listOfWords[i].toLowerCase();
		}
		Arrays.sort(listOfWords);
		for(int i = 0; i<listOfWords.length-1; i++){
			if(listOfWords[i].equals(listOfWords[i+1])){
				return false;
			}
		}
		return true;
		//Compare adjacent items to see if there are dupes. Should reduce time complexity to O(n) rather than a nested traversal (O(n)^2)
	}


}
