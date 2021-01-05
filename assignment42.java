package week4;

import java.util.Scanner;

public class assignment42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化
		Scanner in = new Scanner(System.in);
		int number; // 存储读入的整数，假定范围在[-100000,100000]
		number = in.nextInt();
/* 1234，读yi er san si =》从左向右读数 =》1.从左向右拆分2.依次读数 =》1.1234/1000=1 1234%1000=234 
 * 234/100=2 234%100=34 ... => 1.1.获取位数，就知道是该/1000还是%100 1.2.输出结果1 2 3 4 
 */
/*第一步，又分为两大步，读出每一位 */
		int digit; // 存储输出的每一个整数
/*		重复对读入的整数进行操作，循环。先拆分，后判断，适合do-while,先写出空的循环，思考循环内如何实现，再考虑循环条件。
 		do
		{
			
		} while ();
*/	
		do
		{
			digit=number%10;
			System.out.print(digit+" ");
			number /= 10;
		} while ( number/10 !=0 );
		
	}

}
