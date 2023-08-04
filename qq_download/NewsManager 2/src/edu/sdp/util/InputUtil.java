package edu.sdp.util;

import java.util.Scanner;

public class InputUtil {
	//整型
	public static int getInt(){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true){
			try {
				i = sc.nextInt();
				return i;
			} catch (Exception e) {
				System.out.println("您输入不匹配，请重新输入！");
				sc=new Scanner(System.in);
			}
		}
	}
	//字符串
	public  static String getString(){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		return str;
	}
}
