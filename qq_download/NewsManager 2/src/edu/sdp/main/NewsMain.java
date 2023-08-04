package edu.sdp.main;




import com.shanzhi.po.Flight;
import edu.sdp.po.News;
import edu.sdp.po.User;
import edu.sdp.service.NewsService;
import edu.sdp.util.InputUtil;
import edu.sdp.view.NewsView;

import java.sql.SQLException;
import java.util.List;

public class NewsMain {
	//创建service层对象
	NewsService ns=new NewsService();
	public void start() throws SQLException {
		int count=3;
		while (count>0){
			String s = NewsView.loginView(); //用户输入的用户名和密码
			//字符串的拆分
			String[] strs = s.split(",");
			String loginname=strs[0];
			String password=strs[1];
			//创建User对象，并赋值
			User user=new User(loginname,password);
			//调用登录方法
			User user1= ns.login(user);
			if(user1!=null){
				System.out.println("登录成功！");
				int num=-1;
				while (num!=0){
					NewsView.mainView();
					System.out.println("请选择：");
					//在控制台（0-6）选择的数字
					int a= InputUtil.getInt();
					switch (a){
						case 0:
							System.out.println("新增新闻信息");
							addNews();
							break;
						case 1:
							System.out.println("查询所有新闻信息");
							queryAll();
							break;
						case 2:
							System.out.println("按新闻类型查询");
							queryByType();
							break;
						case 3:
							System.out.println("按作者查询");
							queryByAuthor();
							break;
						case 4:
							System.out.println("删除新闻信息");
							queryAll();
							delNews();
							break;
						case 5:
							System.out.println("更新新闻信息");
							queryAll();
							updateNews();
							break;
						case 6:
							System.out.println("退出新闻信息管理系统");
							System.exit(0);
							break;
						default:
							System.out.println("没有此选项，请重新输入...");
							break;
					}
				}
			}else {
				count--;
				System.out.println("用户名或密码有误，请重新输入，还有"+count+"次机会");
			}
		}
	}
	//查询所有方法
	public void queryAll(){
		//调用数据库操作类查询所有的方法，得到查询的所有数据的集合
		List<News> nns= ns.queryAll();
		System.out.println("新闻编号\t新闻类型\t新闻标题\t\t新闻作者\t\t\t创建日期\t\t\t修改日期\t\t\t新闻内容");
		for (News nn:nns){
			System.out.println(nn.getId()+"\t\t"+nn.getType()+"\t\t"+nn.getTitle()+"\t\t"
					+nn.getAuthor()+"\t\t"+nn.getCreatedate()+"\t\t"+nn.getModifydate()+"\t\t"+nn.getContent());
		}
	}
	//根据新闻类型查询
	public void queryByType(){
		System.out.println("请输入查询的新闻类型：");
		String title = InputUtil.getString();
		List<News> nns=ns.queryByType(title);
		//调用数据库操作类查询所有的方法，得到查询的所有数据的集合
		System.out.println("新闻编号\t新闻类型\t新闻标题\t\t新闻作者\t\t\t创建日期\t\t\t修改日期\t\t\t新闻内容");
		for (News nn:nns){
			System.out.println(nn.getId()+"\t\t"+nn.getType()+"\t\t"+nn.getTitle()+"\t\t"
					+nn.getAuthor()+"\t\t"+nn.getCreatedate()+"\t\t"+nn.getModifydate()+"\t\t"+nn.getContent());
		}
	}
	//根据作者查询
	public void queryByAuthor(){
		System.out.println("请输入查询的新闻作者：");
		String author = InputUtil.getString();
		List<News> nns=ns.queryByAuthor(author);
		//调用数据库操作类查询所有的方法，得到查询的所有数据的集合
		System.out.println("新闻编号\t新闻类型\t新闻标题\t\t新闻作者\t\t\t创建日期\t\t\t修改日期\t\t\t新闻内容");
		for (News nn:nns){
			System.out.println(nn.getId()+"\t\t"+nn.getType()+"\t\t"+nn.getTitle()+"\t\t"
					+nn.getAuthor()+"\t\t"+nn.getCreatedate()+"\t\t"+nn.getModifydate()+"\t\t"+nn.getContent());
		}
	}
	//添加航班信息
	public void addNews() {
		//新增优化，新增后输入yes/no来判断是否继续新增或者返回上一级
		String is = "yes";
		while (is.equals("yes")){
			System.out.println("请输入需要新增的新闻类型：");
			String type = InputUtil.getString();
			System.out.println("请输入需要新增的新闻标题：");
			String title = InputUtil.getString();
			System.out.println("请输入需要新增的新闻作者：");
			String author = InputUtil.getString();
			System.out.println("请输入需要新增的创建日期：");
			String createdate = InputUtil.getString();
			System.out.println("请输入需要新增的修改日期：");
			String modifydate = InputUtil.getString();
			System.out.println("请输入需要新增的新闻内容：");
			String content = InputUtil.getString();
			News n = new News(type, title, author,createdate,modifydate,content);
			//调用service层中的新增方法
			int i = 0;
			i = ns.addNews(n);
			if(i>0){
				System.out.println("添加成功！");
			}else {
				System.out.println("添加失败！");
			}
			//询问是否继续
			System.out.println("是否继续添加新闻信息？（yes/no）");
			is = com.shanzhi.util.InputUtil.getString();
		}
	}
	//删除新闻信息
	public void delNews(){
		String is = "yes";
		while (is.equals("yes")){
			System.out.println("请输入要删除的新闻编号：");
			int id =InputUtil.getInt();
			int i=ns.delNews(id);
			if(i>0){
				System.out.println("删除成功！");
			}else {
				System.out.println("删除失败！");
			}
			//询问是否继续
			System.out.println("是否继续删除航班信息？（yes/no）");
			is = InputUtil.getString();
		}
	}
	//修改新闻信息
	public void updateNews() {
		String is = "yes";
		while (is.equals("yes")) {
			System.out.println("请输入需要修改的新闻编号");
			int id = InputUtil.getInt();
			System.out.println("请输入修改后的新闻类型：");
			String type = InputUtil.getString();
			System.out.println("请输入修改后的新闻标题：");
			String title = InputUtil.getString();
			System.out.println("请输入修改后的新闻作者：");
			String author = InputUtil.getString();
			System.out.println("请输入修改后的创建日期：");
			String createdate = InputUtil.getString();
			System.out.println("请输入修改后的修改日期：");
			String modifydate = InputUtil.getString();
			System.out.println("请输入修改后的新闻内容：");
			String content = InputUtil.getString();
			//创建news对象，将值存储
			News n = new News(id,type,title,author,createdate,modifydate,content);
			//调用service中的修改方法
			int i = ns.updateNews(n);
			//判断
			if (i > 0) {
				System.out.println("修改成功！");
			} else {
				System.out.println("修改失败！");
			}
			//询问是否继续
			System.out.println("是否继续修改新闻信息？（yes/no）");
			is = InputUtil.getString();
		}

	}
	public static void main(String[] args) throws SQLException {
		NewsMain nm=new NewsMain();
		nm.start();

	}
}
