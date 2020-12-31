package week3loop;

import java.util.Scanner;

public class assignment32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		initialization
		Scanner in = new Scanner(System.in);
		int number = 0;
		int count = 1;
		int factor = 1;
		int decimal = 0;
		number = in.nextInt();
		if ( ( number % 10 / 2 ) * 2 != number % 10 )
		{
			if ( number/10 != 0 )
			{
				number = number/10;
				do {
					count = count+1;
					factor = 2*factor;
					if ( ( ( number % 10 ) / 2 ) * 2 == number % 10 )
					{
						if ( ( count / 2 ) * 2 == count )
						{
							decimal = decimal+factor;
						}
					}
					else if ( ( ( number % 10 ) / 2 ) * 2 != number % 10 )
					{
						if ( ( count / 2 ) * 2 != count )
						{
							decimal = decimal+factor;
						}
				 	}
					number = number/10;
				 } while ( number != 0);
			}
		System.out.println(decimal+1);
		}	
		else 
		{
			if ( number/10 != 0 )
			{
				number = number/10;
				do {
					count = count+1;
					factor = 2*factor;
					if ( ( ( number % 10 ) / 2 ) * 2 == number % 10 )
					{
						if ( ( count / 2 ) * 2 == count )
						{
							decimal = decimal+factor;
						}
					}
					else if ( ( ( number % 10 ) / 2 ) * 2 != number % 10 )
					{
						if ( ( count / 2 ) * 2 != count )
						{
							decimal = decimal+factor;
						}
				 	}
					number = number/10;
				 } while ( number != 0);
			}
		System.out.println(decimal);
		}
	}
}
