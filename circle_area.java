import java.util.Scanner;

public class circle_area {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter redious of the circle: ");
		float r = input.nextFloat();
		r = 3.14f * r * r;
		System.out.println("Are = " + r);
	}
}