import java.util.* ;

public class Multiplication_table {
	public static void main( String arg[] ){
		Scanner input = new Scanner( System.in ) ;
		int n ;
		System.out.print( "Enter the number you want to know: " ) ;
		n = input.nextInt() ;
		int table[][] = new int[n][10] ;
		int i, j ;
		System.out.println( "\t\t\tMultiplication  Table" ) ;
		for( i = 0 ; i<n ; i++ ){
			for( j = 0; j<10 ; j++ ){
				table[i][j] = (i+1) * (j+1) ;
				System.out.print( table[i][j] + "\t" ) ;
			}
			System.out.println() ;
		}
	}

}
