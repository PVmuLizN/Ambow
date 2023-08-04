package service.service_impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.News;
import po.User;
import service.NewsService;
import utils.JDBCUtil;

public class NewsServiceImpl implements NewsService {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public User login(User user) {

        User users = new User();
        try {
            String sql = "";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();

            while (rs.next()) {

                users.setUid(rs.getInt(1));
                users.setUsername(rs.getString(2));
                users.setPassword(rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return users;

    }

    @Override
    public List<News> queryAllNews() {
        List<News> news = new ArrayList<News>();

        try {
            String sql = "select * from news";
            // 2.连接数据库（获取数据库连接对象）
            conn = JDBCUtil.getConnection();
            // 3.预编译sql语句（1.判断sql语句是否正确2.判断sql语句是否需要赋值）
            ps = conn.prepareStatement(sql);
            // 4.赋值
            // 5.执行
            rs = ps.executeQuery();
            // 6.遍历结果集
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt(1));
                n.setType(rs.getString(2));
                n.setTitle(rs.getString(3));
                n.setAuthor(rs.getString(4));
                n.setCreatedate(rs.getString(5));
                n.setModifydate(rs.getString(6));
                n.setContent(rs.getString(7));
                // 将对象添加到集合中
                news.add(n);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // 关闭
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return news;

    }

    public int addNews(News n) {
        int a = 0;// 默认为失败的

        try {
            String sql = "insert into news values(null,?,?,?,?,?,?)";
            // 2.连接数据库（获取数据库连接对象）
            conn = JDBCUtil.getConnection();
            // 3.预编译sql语句（1.判断sql语句是否正确2.判断sql语句是否需要赋值）
            ps = conn.prepareStatement(sql);
            // 4.赋值
            ps.setString(1, n.getType());
            ps.setString(2, n.getTitle());
            ps.setString(3, n.getAuthor());
            ps.setString(4, n.getCreatedate());
            ps.setString(5, n.getModifydate());
            ps.setString(6, n.getContent());
            // 5.执行
            a = ps.executeUpdate();// 0失败,1成功
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭
            JDBCUtil.closeAll(conn, ps, null);
        }
        return a;
    }

    public int deleteNews(int newsId) {
        int result = 0; // Default value for failure

        try {
            String sql = "DELETE FROM news WHERE id=?";
            // 2. Connect to the database (get the database connection object)
            conn = JDBCUtil.getConnection();
            // 3. Prepare the SQL statement
            ps = conn.prepareStatement(sql);
            // 4. Set the parameter values
            ps.setInt(1, newsId);
            // 5. Execute the delete query
            result = ps.executeUpdate(); // Returns the number of rows affected
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close the resources
            JDBCUtil.closeAll(conn, ps, null);
        }
        return result;
    }

    public int updateNews(News n) {
        int result = 0; // Default value for failure

        try {
            String sql = "UPDATE news SET type=?, title=?, author=?, createdate=?, mogifydate=?, content=? WHERE id=?";
            // 2. Connect to the database (get the database connection object)
            conn = JDBCUtil.getConnection();
            // 3. Prepare the SQL statement
            ps = conn.prepareStatement(sql);
            // 4. Set the parameter values
            ps.setString(1, n.getType());
            ps.setString(2, n.getTitle());
            ps.setString(3, n.getAuthor());
            ps.setString(4, n.getCreatedate());
            ps.setString(5, n.getModifydate());
            ps.setString(6, n.getContent());
            ps.setInt(7, n.getId()); // Assuming 'id' is the primary key or unique identifier
            // 5. Execute the update query
            result = ps.executeUpdate(); // Returns the number of rows affected
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close the resources
            JDBCUtil.closeAll(conn, ps, null);
        }
        return result;
    }

    @Override
    public News queryNewsById(int newsId) {

        News news = null;

        try {
            String sql = "SELECT * FROM news WHERE id=?";
            // 2. Connect to the database (get the database connection object)
            conn = JDBCUtil.getConnection();
            // 3. Prepare the SQL statement
            ps = conn.prepareStatement(sql);
            // 4. Set the parameter value
            ps.setInt(1, newsId);
            // 5. Execute the query
            rs = ps.executeQuery();

            // 6. Process the query result
            if (rs.next()) {
                // Extract data from the result set
                int id = rs.getInt("id");
                String type = rs.getString("type");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String createdate = rs.getString("createdate");
                String modifydate = rs.getString("mogifydate");
                String content = rs.getString("content");

                // Create a News object with the retrieved data
                news = new News();
                news.setId(id);
                news.setType(type);
                news.setTitle(title);
                news.setAuthor(author);
                news.setCreatedate(createdate);
                news.setModifydate(modifydate);
                news.setContent(content);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. Close the resources
            JDBCUtil.closeAll(conn, ps, rs);
        }

        return news;
    }

}
