package main;

import po.User;
import service.NewsService;
import service.serviceImpl.NewsServiceImpl;
import utils.KeyboardUtil;

/**
 * news main class entrance
 */
public class NewsMain {
    public void start() {
        System.out.println("欢迎来到新闻信息管理系统");
        System.out.println("请输入您的用户名");
        String loginName = KeyboardUtil.readString();
        System.out.println("Input your password: ");
        String password = KeyboardUtil.readString();
        System.out.println(loginName + password);

        User user = new User(loginName, password);

        NewsService ns = new NewsServiceImpl();
        if (user != null) {
            ns.login(user);
        }

    }

    public static void main(String[] args) {
        NewsMain nm = new NewsMain();
        nm.start();
    }
}
