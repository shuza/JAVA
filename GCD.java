import java.util.* ;

public class GCD {
	public static void main( String arg[] ){
		Scanner input = new Scanner( System.in ) ;
		int a = input.nextInt() ;
		int b = input.nextInt() ;
		int r ;
		while( a%b!=0 ){
			r  = a%b ;
			a = b ;
			b = r ;
		}
		System.out.print( b + "\t" + a ) ;
	}

}
