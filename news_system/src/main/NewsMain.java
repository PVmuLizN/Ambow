package main;

import java.util.List;

import po.News;
import po.User;
import service.NewsService;
import service.service_impl.NewsServiceImpl;
import utils.KeyboardUtil;
import view.NewsView;

/**
 * news main class entrance
 */
public class NewsMain {
    NewsService ns = new NewsServiceImpl();

    public void start() {
        System.out.println("欢迎来到新闻信息管理系统");
        System.out.println("请输入您的用户名");
        String loginName = KeyboardUtil.readString();
        System.out.println("Input your password: ");
        String password = KeyboardUtil.readString();
        System.out.println(loginName + password);

        User user = new User(loginName, password);

        User users = new User();
        users = ns.login(user);
        if (users != null) {
            // 登录成功调用主界面
            NewsView.mainView();
            // 接收选择的数值
            int a = KeyboardUtil.readInt();
            switch (a) {
                case 1:
                    System.out.println("查询");
                    this.queryAllNews();
                    break;
                case 2:
                    System.out.println("新增");
                    this.addNews();
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

    public void queryAllNews() {
        // 调用service层的查询所有的方法
        List<News> news = ns.queryAllNews();
        System.out
                .println("编号" + "\t" + "类型" + "\t" + "标题" + "\t" + "作者" + "\t" + "创建时间" + "\t" + "修改时间" + "\t" + "内容");
        // 遍历集合
        for (News n : news) {
            System.out.println(n.getId() + "\t" + n.getType() + "\t" + n.getTitle() + "\t" + n.getAuthor() + "\t"
                    + n.getCreatedate() + "\t" + n.getModifydate() + "\t" + n.getContent());
        }
    }

    public void addNews() {
        System.out.println("新增业务");
        System.out.println("请输入的新增的类型：");
        String type = KeyboardUtil.readString();
        System.out.println("请输入的新增的标题：");
        String title = KeyboardUtil.readString();
        System.out.println("请输入的新增的作者：");
        String author = KeyboardUtil.readString();
        System.out.println("请输入的新增的创建时间：");
        String createdate = KeyboardUtil.readString();
        System.out.println("请输入的新增的修改时间：");
        String mogifydate = KeyboardUtil.readString();
        System.out.println("请输入的新增的内容：");
        String content = KeyboardUtil.readString();
        // 调用service层的新增的方法
        News n = new News();
        n.setType(type);
        n.setTitle(title);
        n.setAuthor(author);
        n.setCreatedate(createdate);
        n.setModifydate(mogifydate);
        n.setContent(content);
        int a = ns.addNews(n);
        if (a > 0) {
            System.out.println("新增成功！");
        }
    }

    public void deleteNews() {
        System.out.println("删除业务");
        System.out.println("请输入要删除的新闻编号：");
        int newsId = KeyboardUtil.readInt();

        // Call the service layer's deleteNews method
        int result = ns.deleteNews(newsId);

        if (result > 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    public void updateNews() {
        System.out.println("修改业务");
        System.out.println("请输入要修改的新闻编号：");
        int newsId = KeyboardUtil.readInt();

        // Call the service layer's queryNewsById method to get the existing news data
        News existingNews = ns.queryNewsById(newsId);
        if (existingNews == null) {
            System.out.println("新闻编号不存在！");
            return;
        }

        // Read the new data from the user
        System.out.println("请输入修改后的类型：");
        String type = KeyboardUtil.readString();
        System.out.println("请输入修改后的标题：");
        String title = KeyboardUtil.readString();
        System.out.println("请输入修改后的作者：");
        String author = KeyboardUtil.readString();
        System.out.println("请输入修改后的创建时间：");
        String createdate = KeyboardUtil.readString();
        System.out.println("请输入修改后的修改时间：");
        String mogifydate = KeyboardUtil.readString();
        System.out.println("请输入修改后的内容：");
        String content = KeyboardUtil.readString();

        // Update the existing news object with the new data
        existingNews.setType(type);
        existingNews.setTitle(title);
        existingNews.setAuthor(author);
        existingNews.setCreatedate(createdate);
        existingNews.setModifydate(mogifydate);
        existingNews.setContent(content);

        // Call the service layer's updateNews method
        int result = ns.updateNews(existingNews);

        if (result > 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
    }

    public static void main(String[] args) {
        NewsView.mainView();
        NewsMain nm = new NewsMain();
        nm.start();
    }
}
