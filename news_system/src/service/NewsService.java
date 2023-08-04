package service;

import java.util.List;

import po.News;
import po.User;

/**
 * operations on databases
 */
public interface NewsService {
    User login(User user);

    List<News> queryAllNews();

    int addNews(News n);

    int deleteNews(int newsId);

    int updateNews(News n);

    News queryNewsById(int newsId);
}
