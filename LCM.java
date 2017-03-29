import java.util.* ;

public class LCM {
	public static void main( String arg[] ){
		Scanner input = new Scanner( System.in ) ;
		int num1, num2, r, a, b ;
		num1 = input.nextInt() ;
		num2 = input.nextInt() ;
		a = num1 ;
		b = num2 ;
		while( a%b!=0 ){
			r = a%b ;
			a = b ;
			b = r ;
		}
		System.out.println( "GCD = " + b ) ;
		if( num1>num2 )
			a = ( num2/b ) * num1 ;
		else
			a = ( num1/b ) * num2 ;
		System.out.println( "LCM = " + a ) ;
	}

}
