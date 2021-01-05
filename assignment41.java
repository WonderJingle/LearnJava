package week4;

import java.util.Scanner;

public class assignment41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		initialization 首先通过举例子搞清楚人工是怎样计算的，思考需要用几个变量去存储数据，思考分为几个大步骤几个小步骤，使用什么循环方式合适？
		Scanner in = new Scanner(System.in);
		int n;	// the nth prime
		int m;	// the mth prime
		boolean isPrime = true; // boolean variable hold characteristic of Prime, using the value of a variable, the property can be changed. drop if is not Prime
		int sum = 0;	// variable store result
		int count = 0;
		n = in.nextInt();
		m = in.nextInt();
//		separate our question into two steps
		
/*		first of all we are trying to list all prime numbers
			for ( int number=2; ; number++, isPrime=true ) 
			{
				for ( int i=2; i < number; i++ )
				{
					if ( number % i == 0 )
					{
						isPrime = false;
						break;
					}
				}
				if ( isPrime == true )
				{
					System.out.println(number);
				}
			}
*/

/*		improve our code, 经过debug调试，观察每次循环的输出，这段代码在count等于m之后还会循环一次，但不进行sum计算。我们希望最好是在count大于m的时候就停止循环，因为之后的过程是无意义的。这种情况下改成while更合适
		for ( int number=2; count <= m; number++, isPrime=true ) // number variable hold all positive integer starts from 2 
		{
			for ( int i=2; i < number; i++ ) // enumeration method
			{
				if ( number % i == 0 )
				{
					isPrime = false;
					break; 
				}
			}
			if ( isPrime == true ) 
			{
//				System.out.println(number);
				count++;
				if ( count >= n && count <= m )
				{
					sum += number;
				}
			}
		}
		System.out.println(sum);
*/
//		improve our code again! hopeful this should be the last time.
//		for ( int number=2; count <= m; number++, isPrime=true ) // number variable hold all positive integer starts from 2 
		int number =1;
		do
		{
			isPrime=true;
			number++;
			for ( int i=2; i < number; i++ ) // enumeration method
			{
				if ( number % i == 0 )
				{
					isPrime = false;
					break; 
				}
			}
			if ( isPrime == true ) 
			{
				count++;
				if ( count >= n && count <= m )
				{
					sum += number;
				}
			}
		} while ( count < m );
		System.out.println(sum);
	}
}
