import java.math.BigInteger;
import java.util.Scanner;

public class Pbrm_15_BigInteger {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		BigInteger fact = BigInteger.valueOf(1);
		for(int i = 2; i <= n; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		System.out.println(fact);
		System.out.println("Length: " + fact.toString().length());
	}
}