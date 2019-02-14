package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String check = String.valueOf(number);
		int countCheck = 0;
		for(int i=0; i<check.length(); i++)
		{
			
			if(check.charAt(i)=='3' || check.charAt(i)=='6' || check.charAt(i)=='9')
			{
				countCheck++;
			}
		}
		
		return countCheck;
	}
}