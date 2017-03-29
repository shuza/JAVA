import java.util.Scanner;

public class num_conversion {
	
	static String in_str;
	static int decNum;
	static String numValue = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int base;
		while(true) {
			System.out.print("Enter the given base: ");
			base = input.nextInt();
			System.out.print("Enter the given number: ");
			in_str = input.next();
			boolean error = ToDec(base, in_str);
			if(!error)
				break;
			System.out.println("Invalid input.....please give valid input");
		}
		System.out.print("Enter the target base: ");
		base = input.nextInt();
		convert(base, decNum);
		System.out.print("Converted number: " + in_str);
	}


	private static boolean ToDec(int base, String num) {
		// TODO Auto-generated method stub
		int l = num.length();
		int mul = 1;
		l--;
		decNum = 0;
		while(l >= 0){
			if(numValue.indexOf(num.charAt(l)) >= base || numValue.indexOf(num.charAt(l)) < 0)
				return true;
			decNum += numValue.indexOf(num.charAt(l)) * mul;
			mul *= base;
			l--;
		}
		return false;
	}


	private static void convert(int base, int num) {
		// TODO Auto-generated method stub
		int test;
		in_str = "";
		char ch[] = new char[20];
		while(num != 0) {
			test = num % base;
			num /= base;
			in_str = numValue.charAt(test) + in_str;
		}
	}
}