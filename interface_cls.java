interface Ismp{
	int ans = 10;
	void fun();
}

public class interface_cls implements Ismp {
	public static void main(String[] arg){
		interface_cls ob = new interface_cls();
		ob.fun();
	}

	@Override
	public void fun() {
		System.out.println("ans = " + ans);
	}
}