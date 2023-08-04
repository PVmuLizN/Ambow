package edu.sdp.view;

import edu.sdp.util.InputUtil;

/*
* 界面类
*  */
public class NewsView {
	//创建登录界面方法
	public static String loginView(){
		System.out.println("************************************" +
				"欢迎来到新闻信息管理系统管理员登录页面**************************************");
		System.out.println("管理员登录");
		System.out.println("请输入用户名：");
		String loginname= InputUtil.getString();
		System.out.println("请输入密码：");
		String password=InputUtil.getString();
		return loginname+","+password;
	}
	//主页面方法
	public static void mainView(){
		System.out.println("******************************************" +
				"欢迎来到新闻信息系统管理系统****************************************");
		System.out.println("0、添加新闻信息\t1、查询所有新闻列表\t2、按新闻类型查询\t3、按作者查询\t4、删除新闻信息\t5、更新新闻信息\t6、退出系统");
		System.out.println("*******************************************" +
				"**************************************************************");
	}
}
