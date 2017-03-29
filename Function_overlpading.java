import java.util.Scanner;

public class Function_overlpading {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int n, num1, num2, num3, num4;
		System.out.println("\t\tMaximum paramiter number is 4");
		System.out.print("Enter the paramiter list: ");
		n = input.nextInt();
		switch (n) {
		case 1:
			System.out.print("Enter one number: ");
			int num = input.nextInt();
			add(num);
			break;
		case 2:
			System.out.print("Enter two number: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			add(num1, num2);
			break;
		case 3:
			System.out.print("Enter three number: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
			add(num1, num2, num3);
			break;
		case 4:
			System.out.print("Enter four number: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
			num4 = input.nextInt();
			add(num1, num2, num3, num4);
			break;
		default:
			System.out.println(n + " is an INVALID input...");
		}
	}

	private static void add(int num1, int num2, int num3, int num4) {
		// TODO Auto-generated method stub
		System.out.println("You have entered four numbers and sum = "
				+ (num1 + num2 + num3 + num4));
	}

	private static void add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		System.out.println("You have entered three numbers and sum = "
				+ (num1 + num2 + num3));
	}

	private static void add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("You have entered tow numbers and sum = "
				+ (num1 + num2));
	}

	private static void add(int num) {
		// TODO Auto-generated method stub
		System.out.println("You have entered one number and sum = " + num);
	}
}