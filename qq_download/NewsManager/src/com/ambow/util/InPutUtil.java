package com.ambow.util;

import java.util.Scanner;

/**�������빤����*/
public class InPutUtil {
	//��ȡ�����������
	static Scanner sc=new Scanner(System.in);
	//��ȡ��ֵ����
	public static int getInt(){
		int i=sc.nextInt();
		return i;
	}
	//��ȡ�ַ�������
	public static String getString(){
		//����
		String str=sc.next();
		//����
		return str;
	}
}
