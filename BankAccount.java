import java.util.Scanner;

class cls_A{
	String owner_name, ac_name;
	int balance;
	
	public void setOwnerName(String name){
		owner_name = name;
	}
	
	public void showOwnerName(){
		System.out.println("Owner name: " + owner_name);
	}
	
	public void setAcName(String name){
		ac_name = name;
	}
	
	public void setBalance(int a){
		balance = a;
	}
	
	public int getBalance(){
		return balance;
	}
}

class cls_B extends cls_A{
	int initialBalance;
	
	public void setInitial(int a){
		initialBalance = a;
		setBalance(a);
	}
	public void withdrow(int a){
		if(a > balance)
			System.out.println("\tDon't have sufficient balance...");
		else{
			balance -= a;
			System.out.println("\tWithdrow success...");
			System.out.println("\tBalance after withdrow is " + getBalance());
		}
	}
	
	public void deposite(int a){
		balance += a;
	}
}

public class BankAccount {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		cls_B ob = new cls_B();
		System.out.print("Enter owner name: ");
		String st = input.nextLine();
		ob.setOwnerName(st);
		System.out.print("Enter account name: ");
		st = input.nextLine();
		ob.setAcName(st);
		System.out.print("Enter inital balance: ");
		int a = input.nextInt();
		ob.setInitial(a);
		boolean run = true;
		while(run){
			System.out.println("Press 1 for deposite, 2 for withdrow and 0 for exit");
			a = input.nextInt();
			switch(a){
			case 1:
				System.out.print("Enter the deposite ammount: ");
				a = input.nextInt();
				ob.deposite(a);
				break;
			case 2:
				System.out.print("Enter the withdrow ammount: ");
				a = input.nextInt();
				ob.withdrow(a);
				break;
			case 0:
				run = false;
				break;
				default:
					System.out.println("\tYou have pressed invalid key....please try again...");
					break;
			}
		}
		
	}
}