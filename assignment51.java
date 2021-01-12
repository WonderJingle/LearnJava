package weekfive;

import java.util.Scanner;

public class assignment51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
/*
 * 通过举例子来读懂题目。通过举例子想个办法，人类是如何做这件事情的，一边构思（草稿纸）一边敲代码和注释，1.需要输入及输出几个？什么类型？的变量。2.用什么类型？条件是什么？的循环。3.有分支吗？条件是什么？4.循环或分支里面是在干什么？
 */
		// 如何读入多项式？一边敲代码一边debug调试。
		int power = 0;	// 多项式的幂次
		int coefficient = 0;	// 多项式的系数
		int[] intermediate = new int[100];	// 并不是一开始就想到的变量，看后面注释。
//		power = in.nextInt(); // 第一次输入的幂次，正好可以作为数组的length,并且之后无论power如何变化（循环内）,数组的length都已经固定了。
//		coefficient = in.nextInt();
//		int[] polynomials = new int[power+1];	// 用数组表达最大幂次是maxPower的多项式，polynomials[0]~polynomials[maxPower]，但是polynomials.lengh=maxPower+1
//		polynomials[power] = coefficient;	// 目前想到的做法是先往数组里放一个，之后的循环就可以在幂次为零的情况下，读取最后一个系数。
//		do	// 想让幂次为零的时候，也能读取到最后一个系数，我想的做法是用do-while循环。
//		{
//			power = in.nextInt();
//			coefficient = in.nextInt();
//			polynomials[power] = coefficient;
////			System.out.println(polynomials.length);	// 是否会随着继续读入power而改变，想不明白就用debug模式，一步一步看
//		} while ( power !=0 );
//		
//		// 如何输出多项式？
//		for ( int i=polynomials.length-1; i>0; i--)	// 这里体现出直接敲代码而不是先在稿纸上想再敲代码的好处，可以知道这个做法能否被计算机接受。
//		{
//			System.out.print(polynomials[i]+"X"+i+"+"); 
//		}
//		System.out.print(polynomials[0]);
		
		// 如何读两个多项式？
//		MAIN_LOOP:	// 多层循环嵌套，标记主循环
//		for ( int p=1; p<3; p++ )	// 两个多项式，p=1和p=2
//		{
//			power = in.nextInt();
//			coefficient = in.nextInt();
//			int[] polynomials = new int[power+1];	
//			polynomials[power] = coefficient;	
//			do	
//			{
//				power = in.nextInt();
//				coefficient = in.nextInt();
//				polynomials[power] = coefficient;
//			} while ( power !=0 );
//			for ( int i=polynomials.length-1; i>0; i--)	
//			{
//				System.out.print(polynomials[i]+"X"+i+"+"); 
//			}
//			System.out.print(polynomials[0]);
//			System.out.println();
//			if ( power == 0 )
//			{
//				continue MAIN_LOOP;
//			}
//		}
		
		// 如何将两个多项式相加？我的想法是把读进来的多项式，拷贝到中间变量里，在中间变量上做计算，然后输出结果
		MAIN_LOOP:
		for ( int p=1; p<3; p++ )	// p正好可以作为内部循环的标记，这里也能体现边敲代码边想办法的好处。		
		{
			power = in.nextInt();
			coefficient = in.nextInt();
			int[] polynomials = new int[power+1];	
			polynomials[power] = coefficient;	
			do	
			{
				power = in.nextInt();
				coefficient = in.nextInt();
				polynomials[power] = coefficient;
			} while ( power !=0 );
			if ( p==1 )	// 如果是第一个多项式就拷贝到中间变量，否则就与中间变量相加
			{
//				int[] intermediate = new int[100];	// 在循环内声明并初始化的变量，在循环外无法使用，放在代码的头部.第二个多项式可能比第一个多项式的幂次要高，因此数组的length设定为100
				for ( int i=0; i<polynomials.length; i++ )
				{
					intermediate[i] = polynomials[i];
				}
			}
			else
			{
				for ( int i=0; i<polynomials.length; i++ )
				{
					intermediate[i] = polynomials[i]+intermediate[i];
				}
			}
			if ( power == 0 )
			{
				continue MAIN_LOOP;
			}
		}
		for ( int i=intermediate.length-1; i>1; i--)	// 问题：遍历了数组的所有位置，浪费资源
		{
			if ( intermediate[i] !=0 )	// 去掉带零的
			{
				System.out.print(intermediate[i]+"X"+i+"+"); 
			}
		}
		System.out.print(intermediate[1]+"X"+"+");	// 幂次为一 
		System.out.print(intermediate[0]);	// 幂次为零
	}
}
