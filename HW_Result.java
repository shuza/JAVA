import java.util.Scanner;

interface sports{
	int gres = 20;
	int total(int a);
}

class student{
	int mark;
	public void setmark(int a){
		mark = a;
	}
	public int getmark(){
		return mark;
	}
}

class exam extends student{
	int max_num;
	public void setMaxNum(int a){
		max_num = a;
	}
	public int getresult(int a){
		if(a > max_num)
			return max_num;
		return a;
	}
}

public class HW_Result extends exam implements sports {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		HW_Result ob = new HW_Result();
		System.out.print("Enter maximum number: ");
		int test = input.nextInt();
		ob.setMaxNum(test);
		System.out.print("Enter exam mark: ");
		test = input.nextInt();
		ob.setmark(test);
		test = ob.total(ob.getmark());
		test = ob.getresult(test);
		System.out.println("Result = " + test);
	}


	public int total(int a) {
		return (a + gres);
	}
}