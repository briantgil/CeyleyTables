/**
 * 
 */

/**
 * @author Brian Gil Copyright (C) 2017
 *
 */
public class CeyleyTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n = 12;  //16
		//multiplyTable(n);
		
		//int d = Integer.parseInt( args[0] );
		int d = 35;  //50
		String sepChar = " * ";
		String sepLine = "";
		String multLabel = " M o d u l a r  M u l t i p l i c a t i o n ";
		String multLine = "";
		String addLabel = " M o d u l a r  A d d i t i o n ";
		String addLine = "";
		int multLnPad = 0;
		int addLnPad = 0;
		
		
		for (int i=0;i<=d;i++) {
			sepLine += sepChar;
		}

		multLnPad = ((sepLine.length() - multLabel.length()) / 6);
		for (int j=0;j<multLnPad;j++) {
			multLine += sepChar;
		}
		multLine += multLabel;
		for (int k=0;k<multLnPad;k++) {
			multLine += sepChar;
		}

		addLnPad = ((sepLine.length() - addLabel.length()) / 6);		
		for (int j=0;j<addLnPad;j++) {
			addLine += sepChar;
		}
		addLine += addLabel;
		for (int k=0;k<addLnPad;k++) {
			addLine += sepChar;
		}		
			
		System.out.println(sepLine);
		System.out.println(multLine);
		System.out.println(sepLine);
		modMultiplyTable(d);
		
		System.out.println(sepLine);
		System.out.println(addLine);
		System.out.println(sepLine);
		modAdditionTable(d);
		
	}
	

	/**
	 * multiplication table
	 * 
	 * @param n
	 */
	public static void multiplyTable(int n) {
		int x = 1;
		int y = 1;
			
		while (x <= n)
		{
			while (y <= n)
			{
				System.out.print(x*y + " ");
				y++;
			}
			System.out.println();
			y = 1;
			x++;
		}	
	}
	
	
	/**
	 * uses modular multiplication algorithm ( x and y E Zd ( x(*)y = x*y mod d ) ),
	 * and constructs a Ceyley table for divisor d
	 * 
	 * @param d
	*/
	public static void modMultiplyTable(int d) {
		//int d = Integer.parseInt( args[0] );
		
		int largestNumber = d - 1;
		String largestNumberStr = Integer.toString( largestNumber );
		int largestNumberLen = largestNumberStr.length();
		
		int x = 0;
		String xStr = "";
		int xLen = 0;
		int xPadLen = 0;
		String xPad = "";
		
		int y = 0;
		
		int xy = 0;
		String xyStr = "";
		int xyLen = 0;
		int xyPadLen = 0;
		String xyPad = "";
		
		String star = "*";
		int starLen = 1;
		int starPadLen = largestNumberLen - starLen;
		String starPad = "";
		
		if ( starPadLen > 0 )
		{
			for ( int i=0; i<starPadLen; i++ )
			{
				starPad += " ";
			}
		}
		System.out.print( star + starPad + " " );
		
		while ( x < d )
		{
			xStr = Integer.toString( x );
			xLen = xStr.length();
			if ( xLen < largestNumberLen )
			{
					xPadLen = largestNumberLen - xLen;
					for ( int i=0; i<xPadLen; i++ )
					{
						xPad += " ";
					}
			}
			System.out.print( x + xPad + " " );
			xPad = "";
			x++;
		}
		System.out.println();
		x = 0;
		
		while ( x < d )
		{
			xStr = Integer.toString( x );
			xLen = xStr.length();
			if ( xLen < largestNumberLen )
			{
					xPadLen = largestNumberLen - xLen;
					for ( int i=0; i<xPadLen; i++ )
					{
						xPad += " ";
					}
			}
			System.out.print( x + xPad + " " );
			xPad = "";
			
			//System.out.print( x + " " );
			
			while ( y < d )
			{				
				xy = ( x * y ) % d;
				
				xyStr = Integer.toString( xy );
				xyLen = xyStr.length();
				if ( xyLen < largestNumberLen )
				{
					xyPadLen = largestNumberLen - xyLen;
					for ( int i=0; i<xyPadLen; i++ )
					{
						xyPad += " ";
					}
				}
				System.out.print( xy + xyPad + " " );
				xyPad = "";
				y++;	
			}
			System.out.println();
			x++;
			y = 0;
		}
				
	}

	
	/**
	 * 	uses modular addition algorithm ( x and y E Zd ( x(+)y = x+y mod d ) ),
	 * 	and constructs a Ceyley table for divisor d where d is passed in as a command line argument	
	 * 
	 * @param d
	 */
	public static void modAdditionTable(int d) {
		//int d = Integer.parseInt( args[0] );
		
		int largestNumber = d - 1;
		String largestNumberStr = Integer.toString( largestNumber );
		int largestNumberLen = largestNumberStr.length();
		
		int x = 0;
		String xStr = "";
		int xLen = 0;
		int xPadLen = 0;
		String xPad = "";
		
		int y = 0;
		
		int xPlusY = 0;
		String xyStr = "";
		int xyLen = 0;
		int xyPadLen = 0;
		String xyPad = "";
		
		String star = "*";
		int starLen = 1;
		int starPadLen = largestNumberLen - starLen;
		String starPad = "";
		
		if ( starPadLen > 0 )
		{
			for ( int i=0; i<starPadLen; i++ )
			{
				starPad += " ";
			}
		}
		System.out.print( star + starPad + " " );
		
		while ( x < d )
		{
			xStr = Integer.toString( x );
			xLen = xStr.length();
			if ( xLen < largestNumberLen )
			{
					xPadLen = largestNumberLen - xLen;
					for ( int i=0; i<xPadLen; i++ )
					{
						xPad += " ";
					}
			}
			System.out.print( x + xPad + " " );
			xPad = "";
			x++;
		}
		System.out.println();
		x = 0;
		
		while ( x < d )
		{
			xStr = Integer.toString( x );
			xLen = xStr.length();
			if ( xLen < largestNumberLen )
			{
					xPadLen = largestNumberLen - xLen;
					for ( int i=0; i<xPadLen; i++ )
					{
						xPad += " ";
					}
			}
			System.out.print( x + xPad + " " );
			xPad = "";
			
			//System.out.print( x + " " );
			
			while ( y < d )
			{				
				xPlusY = ( x + y ) % d;
				
				xyStr = Integer.toString( xPlusY );
				xyLen = xyStr.length();
				if ( xyLen < largestNumberLen )
				{
					xyPadLen = largestNumberLen - xyLen;
					for ( int i=0; i<xyPadLen; i++ )
					{
						xyPad += " ";
					}
				}
				System.out.print( xPlusY + xyPad + " " );
				xyPad = "";
				y++;	
			}
			System.out.println();
			x++;
			y = 0;
		}
			
	}		

}
