package com.ambow.util;

import java.util.Scanner;

/**键盘输入工具类*/
public class InPutUtil {
	//获取键盘输入对象
	static Scanner sc=new Scanner(System.in);
	//获取数值类型
	public static int getInt(){
		int i=sc.nextInt();
		return i;
	}
	//获取字符串类型
	public static String getString(){
		//接收
		String str=sc.next();
		//返回
		return str;
	}
}
