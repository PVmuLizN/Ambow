package com.ambow.main;

import java.util.List;

import com.ambow.po.News;
import com.ambow.po.User;
import com.ambow.service.NewsService;
import com.ambow.util.InPutUtil;
import com.ambow.view.NewsView;

/** 新闻系统主类（入口） */
public class NewsMain {
	// 创建service对象，调用登录方法
	NewsService ns = new NewsService();

	// 开始方法
	public void start() {
		System.out.println("欢饮来到新闻信息管理系统");
		System.out.println("请输入您的用户名：");
		String loginname = InPutUtil.getString();
		System.out.println("请输入您的密码：");
		String password = InPutUtil.getString();
		// 创建user对象并且赋值
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		User users = ns.login(user);
		if (users != null) {
			// 登录成功调用主界面
			NewsView.mainView();
			// 接收选择的数值
			int a = InPutUtil.getInt();
			switch (a) {
				case 1:
					System.out.println("查询");
					this.queryAllNews();
					break;
				case 2:
					System.out.println("新增");
					addNews();
					break;
				case 3:
					System.out.println("修改");
					this.queryAllNews();

					break;
				case 4:
					System.out.println("删除");
					this.queryAllNews();

					break;
				case 0:
					System.out.println("退出......");
					// 系统正常退出
					System.exit(0);
					break;

				default:
					System.out.println("没有此选项，请重新输入：");
					break;
			}

		} else {
			System.out.println("登录失败");
		}
	}

	// 查询所有新闻的方法
	public void queryAllNews() {
		// 调用service层的查询所有的方法
		List<News> news = ns.queryAllNews();
		System.out
				.println("编号" + "\t" + "类型" + "\t" + "标题" + "\t" + "作者" + "\t" + "创建时间" + "\t" + "修改时间" + "\t" + "内容");
		// 遍历集合
		for (News n : news) {
			System.out.println(n.getId() + "\t" + n.getType() + "\t" + n.getTitle() + "\t" + n.getAuthor() + "\t"
					+ n.getCreatedate() + "\t" + n.getMogifydate() + "\t" + n.getContent());
		}
	}

	// 新增新闻信息方法
	public void addNews() {
		System.out.println("新增业务");
		System.out.println("请输入的新增的类型：");
		String type = InPutUtil.getString();
		System.out.println("请输入的新增的标题：");
		String title = InPutUtil.getString();
		System.out.println("请输入的新增的作者：");
		String author = InPutUtil.getString();
		System.out.println("请输入的新增的创建时间：");
		String createdate = InPutUtil.getString();
		System.out.println("请输入的新增的修改时间：");
		String mogifydate = InPutUtil.getString();
		System.out.println("请输入的新增的内容：");
		String content = InPutUtil.getString();
		// 调用service层的新增的方法
		News n = new News();
		n.setType(type);
		n.setTitle(title);
		n.setAuthor(author);
		n.setCreatedate(createdate);
		n.setMogifydate(mogifydate);
		n.setContent(content);
		int a = ns.addNews(n);
		if (a > 0) {
			System.out.println("新增成功！");
		}
	}

	public static void main(String[] args) {
		NewsMain nm = new NewsMain();
		nm.start();
	}
}
