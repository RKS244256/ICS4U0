package Homework;
import java.util.Arrays;
import java.util.Scanner;
class Array{
	static int sum(int[] ia){
		int o = 0;
		for(int n : ia){
			o += n;
		}
		return o;
	}
	static int[] genBwdArray(Scanner userIn){
		int[] ia = new int[5];
		for(int i = 0; i<5; i++){
			ia[i] = userIn.nextInt();
		}
		Arrays.sort(ia);
		int[] o = new int[5];
		int oi = 0;
		for(int i = 4; i>=0; i--){
			o[oi] = ia[i];
			oi++;
		}
		return o;
	}
	static String largestString(String[] sa){
		String o = "";
		for(String s : sa){
			if(s.length() > o.length()){
				o = s;
			}
		}
		return o;
	}
	static double average(double[] da){
		double o = 0;
		for(double d : da){
			o += d;
		}
		return o/da.length;
	}
	static int[] evenNums(int[] ia){
		int ol = 0;
		for(int i : ia){
			if(i%2==0){
				ol++;
			}
		}
		int[] o = new int[ol];
		ol = 0;
		for(int i : ia){
			if(i%2==0){
				o[ol] = i;
				ol++;
			}
		}
		return o;
	}
	static int countNum(int[] ia, int n){
		int o = 0;
		for(int i : ia){
			if(i == n){
				o++;
			}
		}
		return o;
	}
	static boolean inArr(int[] ia, int n){
		for(int i : ia){
			if(i == n){
				return true;
			}
		}
		return false;
	}
	static void breakUp(Scanner userIn){
		int c = 0;
		String s = userIn.nextLine();
		Scanner in = new Scanner(s);
		Scanner sc = new Scanner(s);
		in.useDelimiter(" ");
		while(in.hasNext()){
			c++;
			in.next();
		}
		String[] o = new String[c];
		c = 0;
		while(sc.hasNext()){
			o[c] = sc.next();
			c++;
		}
		for(String os : o){
			System.out.println(os);
		}
		in.close();
		sc.close();
	}
	static int arrMax(int[] ia){
		int o = 0;
		for(int i : ia){
			if(i > o){
				o = i;
			}
		}
		return o;
	}
	static boolean isSorted(int[] ia){
		int[] ai = ia.clone();
		Arrays.sort(ai);
		return Arrays.equals(ai, ia);
	}
	public static void main(String[] args){
		Scanner userIn = new Scanner(System.in);
		int[] nums = {1,3,2,3,4,5,5};
		String[] strings = {"uwu", "Kawaii", "AHHHHHHHHHH", "Hehe", "OwO", "Nya~~~", "D0k!"};
		double[] doubles = {90.0, 91.0, 92.0, 96.0, 96.0, 99.0};
		System.out.println("Hello World");
		System.out.println(sum(nums));
		System.out.println(Arrays.toString(genBwdArray(userIn)));
		System.out.println(largestString(strings));
		System.out.println(average(doubles));
		System.out.println(Arrays.toString(evenNums(nums)));
		System.out.println(countNum(nums, 5));
		breakUp(userIn);
		System.out.println(arrMax(nums));
		System.out.println(isSorted(nums));
		userIn.close();
	}
}
