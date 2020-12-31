package week3loop;
/* 	think about how you solve this as a human? convert it into sentence, convert it into steps, convert it into algorithm, 
figure out when loop and when branch, figure out the conditions that keep the loop going and conditions that cause branch.
forget about loop, think about what should be inside the loop first	*/ 
import java.util.Scanner;

public class assignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		initialization
		Scanner in = new Scanner(System.in);
		int number = 0;		//think about what variable you will use? and how many?
		int odd = 0;
		int even = 0;
/*		use do-while to solve this
			do {
				number = in.nextInt();
				if ( number > 0 & number < 100000)
				{
					if ( number != 2*(number/2) )
					{
						odd = odd+1;
					}
					else
					{
						even = even+1;
					}
				}
				else if (number != -1)
				{
					System.out.println(number + " is out of range!");
				}
			} while (number != -1);						*/
//		use while to solve this
		number = in.nextInt();
		while (number != -1)
		{
			if ( number > 0 & number < 100000)
				{
					if ( number != 2*(number/2) )
					{
						odd = odd+1;
					}
					else
					{
						even = even+1;
					}
				}
				else if (number != -1)
				{
					System.out.println(number + " is out of range!");
				}
			number = in.nextInt();
		}
		System.out.print(odd + " " +even);
	}

}
