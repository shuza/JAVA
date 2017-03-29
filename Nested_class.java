class base_cls{
	int a, b;
	public void get(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void show(){
		System.out.println("\tMain_class method is called...");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	class second{
		int x, y;
		public void sub_get(int x, int y){
			this.x = x;
			this.y = y;
		}
		public void dislpay(){
			System.out.println("\tSub_class method is called....");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}


public class Nested_class {
	public static void main(String[] arg){
		base_cls ob = new base_cls();
		ob.get(10, 20);
		ob.show();
		base_cls.second sub = new base_cls().new second();
		sub.sub_get(5, 6);
		sub.dislpay();
		
	}
}