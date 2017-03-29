import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

import org.omg.CORBA_2_3.portable.Delegate;

public class add_large_num {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		boolean error = true;
		String ans = null;
		int fl, sl, carry = 0, f, s;
		while (error) {
			System.out.print("Enter 1st number: ");
			String fnum = input.next();
			System.out.print("Enter 2nd number: ");
			String snum = input.next();
			fl = fnum.length();
			sl = snum.length();
			fl--;
			sl--;
			carry = 0;
			f = 0;
			s = 0;
			ans = "";
			while (fl >= 0 || sl >= 0) {
				if (fl >= 0) {
					f = ch_num(fnum.charAt(fl));
					fl--;
				} else
					f = 0;
				if (sl >= 0) {
					s = ch_num(snum.charAt(sl));
					sl--;
				} else
					s = 0;
				if(iserror(fnum.charAt(fl+1)) || iserror(snum.charAt(sl+1))){
					System.out.println("\tInvalid input.....");
					error = true;
					break;
				}else
					error = false;
				carry += f + s;
				ans += (carry % 10);
				carry /= 10;
			}
		}
		if(carry > 0)
			ans += carry;
		char[] test = new char[ans.length()];
		test = ans.toCharArray();
		fl = test.length - 1;
		ans = "";
		while (fl >= 0) {
			ans += test[fl];
			fl--;
		}
		System.out.println("ans = " + ans);
	}

	static boolean iserror(char c) {
		if (c >= '0' && c <= '9')
			return false;
		return true;
	}

	static int ch_num(char c) {
		int a = (int) c - '0';
		return a;
	}
}