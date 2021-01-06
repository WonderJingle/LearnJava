package week4;

import java.util.Scanner;

public class assignment42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化
		Scanner in = new Scanner(System.in);
		int number;		// 存储读入的整数，假定范围在[-100000,100000]
		number = in.nextInt();
/* 1234，读yi er san si =》从左向右读数 =》1.从左向右拆分2.依次读数 =》1.1234/1000=1 1234%1000=234 
 * 234/100=2 234%100=34 ... => 1.1.获取位数，就知道是该/1000还是%100 1.2.输出结果1 2 3 4 
 */
		//1.1.获取位数
		int digit = 0;	// 存储位数
		int numbery;	// 替代读入整数，为了计算位数，而不影响读入整数
		numbery = number;
		do {
			numbery /= 10;
			digit++;
		} while ( numbery != 0 );
//		System.out.println(digit);
		//1.2.从左向右输出每一位整数，空格方式分开
		int output;
		//1.2.1.实现a，目的是输入的整数每次做"/a"，来获取最左边的数字
/*
  		int a=1;
  		for ( int d=digit ; d > 0; d--,a=1)
		{
			for ( int i=1; i < d ; i++ )
			{
				a *= 10;
			}
			System.out.println(a);
		} 
 */
		// 改进代码，实现1的目标，即从左向右拆分输入整数
  		int a=1;
 /*		for ( int d=digit ; d > 0; d--,a=1)
		{
			for ( int i=1; i < d ; i++ )
			{
				a *= 10;
			}
//			System.out.println(a);
			output = number/a;
			number %= a;
			System.out.print(output+" ");
   		}
  */
		// 改进代码，实现2的目标，即从左向右读出输入的整数，我有个想法，用switch-case实现
 /*
  		for ( int d=digit ; d > 0; d--,a=1)
		{
			for ( int i=1; i < d ; i++ )
			{
				a *= 10;
			}
//			System.out.println(a);
			output = number/a;
			number %= a;
//			System.out.print(output+" ");
			switch (output)
			{
			case 0:
				System.out.print(" ling");
				break;
			case 1:
				System.out.print(" yi");
				break;
			case 2:
				System.out.print(" er");
				break;
			case 3:
				System.out.print(" san");
				break;
			case 4:
				System.out.print(" si");
				break;
			case 5:
				System.out.print(" wu");
				break;
			case 6:
				System.out.print(" liu");
				break;
			case 7:
				System.out.print(" qi");
				break;
			case 8:
				System.out.print(" ba");
				break;
			case 9:
				System.out.print(" jiu");
				break;
			}
   		}
 */  		
  			//再次改进代码，题目要求是负数要读出"fu"，并且上段代码的输出最最左边有空格，想办法去掉
  		if ( number < 0 )
  		{
  			System.out.print("fu ");
  			number *= -1;
  		}
  		for ( int d=digit ; d > 0; d--,a=1)
  		{
  			for ( int i=1; i < d ; i++ )
  			{
  				a *= 10;
  			}
  			output = number/a;
  			number %= a;
  			switch (output)
  			{
  			case 0:
  				System.out.print("ling");
  				break;
  			case 1:
  				System.out.print("yi");
  				break;
  			case 2:
  				System.out.print("er");
  				break;
  			case 3:
  				System.out.print("san");
  				break;
  			case 4:
  				System.out.print("si");
  				break;
  			case 5:
  				System.out.print("wu");
  				break;
  			case 6:
  				System.out.print("liu");
  				break;
  			case 7:
  				System.out.print("qi");
  				break;
  			case 8:
  				System.out.print("ba");
  				break;
  			case 9:
  				System.out.print("jiu");
  				break;
  			}
  			if ( number != 0 || d != 1 )
  			{
  				System.out.print(" ");
  			} 
  	   	}
	}
}
