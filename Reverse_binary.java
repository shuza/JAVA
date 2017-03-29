import java.util.Scanner;

public class Reverse_binary {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int[] digit = new int[64];
		int i, ans = 0;
		for(i = 0; num > 0; i++){
			digit[i] = num % 2;
			num /= 2;
		}
		for(int j = 0; j < i; j++){
			ans += digit[j] * Math.pow(2, (i - j - 1));
		}
		System.out.print("Reverse binary: " + ans);
	}
}