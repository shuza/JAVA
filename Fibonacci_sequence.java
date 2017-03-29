import java.util.* ;

public class Fibonacci_sequence {
	public static void main( String[] arg ){
		Scanner input = new Scanner( System.in ) ;
		long a, b, c, i, n ;
		n = input.nextLong() ;
		a = 0 ;
		b = 1 ;
		for( i = 0 ; i<n ; i++ ){
			c = a ;
			a += b ;
			b = c ;
			System.out.println( "n = " + (i+1) + "\t" + a ) ;
		}
	}

}