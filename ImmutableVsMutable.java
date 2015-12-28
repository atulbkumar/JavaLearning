import java.awt.Point;

public class ImmutableVsMutable
{
	public static void main(String args[])
	{
		Point myPoint = new Point( 0, 0 );
		System.out.println( myPoint );
		myPoint.setLocation( 1.0, 0.0 );
		System.out.println( myPoint );

		String myString = new String( "old String" );
		System.out.println( myString );
		myString.replaceAll( "old", "new" );
		System.out.println( myString );
		
		/**
		 * When we see the output of above program we see this
		 * java.awt.Point[x=0,y=0]
		 * java.awt.Point[x=1,y=0]
		 * old String
		 * old String
		 * 
		 */
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		String myStringNew = new String( "old String" );
		System.out.println( myStringNew );
		myStringNew = new String( "new String" );
		System.out.println( myStringNew );
		
		/**
		 * 
		 * 
		 */
	}
	
}
