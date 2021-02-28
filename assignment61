package com.mooc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        // 读一行
        String s = in.nextLine();
        // 读单词，并输出
        int loc = s.indexOf(' ');   // 找到空格的位置
        //  System.out.print(s.substring(0,loc));   // 读出夹在两个空格之间的单词
        String word = s.substring(0,loc);
        System.out.print(word.length());
        System.out.print(' ');
        // 如何处理空格？
        while ( s.indexOf(' ',loc+1) != -1 )   // 判断是否到了句末（没有空格）
        {
            if ( s.indexOf(' ',loc+1)-loc != 1 )
            {
                //  System.out.print(s.substring(loc+1,s.indexOf(' ',loc+1)));
                word = s.substring(loc+1,s.indexOf(' ',loc+1));
                System.out.print(word.length());
                System.out.print(' ');
            }
            loc = s.indexOf(' ',loc+1);
        }
        //  System.out.print(s.substring(loc+1,s.indexOf('.',loc+1)));
        word = s.substring(loc+1,s.indexOf('.',loc+1));
        System.out.print(word.length());
    }
}
