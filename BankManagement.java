import java.util.Scanner;


public class BankManagement {
	static String[] ac_name;
	static int[] ac_number;
	static int[] balance;
	static int member;
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		ac_name = new String[100];
		ac_number = new int[100];
		balance = new int[100];
		member = 0;
		int press = 999;
		while(press != 0){
			System.out.println("Press 1 for deposite,  2 for cass out,  3 for details,  4 for add new menber...");
			press = input.nextInt();
			int num, tk;
			switch(press){
			case 0:
				break;
			case 1:
				System.out.print("Enter account number: ");
				num = input.nextInt();
				System.out.print("Enter ammount: ");
				tk = input.nextInt();
				tkDeposite(num, tk);
				break;
			case 2:
				System.out.print("Enter account number: ");
				num = input.nextInt();
				System.out.print("Enter ammount you want to cass out: ");
				tk = input.nextInt();
				cassOut(num, tk);
				break;
			case 3:
				System.out.print("Enter the account number: ");
				num = input.nextInt();
				showDetails(num);
				break;
			case 4:
				System.out.print("Enter mamber name: ");
				String name = input.next();
				System.out.print("Enter account number: ");
				num = input.nextInt();
				System.out.print("Enter initial balance (minimum 500): ");
				tk = input.nextInt();
				addMenber(name, num, tk);
				break;
			default:
				System.out.println("You have pressed invalid key...please try again.");
				break;
			}
		}
	}
	
	private static void showDetails(int num) {
		int i;
		for(i = 0; i < member; i++)
			if(ac_number[i] == num)
				break;
		if(i == member){
			System.out.println("You have entered an invalid account number....please try again.");
			return;
		}
		System.out.println("Account holder name: " + ac_name[i]);
		System.out.println("Account number: " + ac_number[i]);
		System.out.println("Balance: " + balance[i] + "tk");
		
	}

	private static void cassOut(int num, int tk) {
		int i;
		for(i = 0; i < member; i++)
			if(ac_number[i] == num)
				break;
		if(i == member){
			System.out.println("You have entered wrong account number...please try again.");
			return;
		}
		balance[i] -= tk;
		System.out.println("cass out successfully....");
	}

	private static void tkDeposite(int num, int tk) {
		int i;
		for(i = 0; i < member; i++)
			if(ac_number[i] == num)
				break;
		if(i == member){
			System.out.println("Sorry you have entered invalid account number...deposite failed...please try again...");
			return;
		}
		balance[i] += tk;
		System.out.println("Deposite successfully...");
	}

	private static void addMenber(String name, int num, int tk) {
		if(tk < 500){
			System.out.println("Minimum balance required 500tk.....account create failed.");
			return;
		}
		ac_name[member] = name;
		ac_number[member] = num;
		balance[member] = tk;
		System.out.println("Account created successfully....thank you for banking with us.");
		member++;
	}
}
