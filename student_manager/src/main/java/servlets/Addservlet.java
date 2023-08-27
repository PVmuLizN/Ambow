package servlets;

// import com.servlet.dao.UserDao;
// import com.servlet.pb.User;



import dao.UserDao;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import po.User;

import java.io.IOException;

public class Addservlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletRequest.setCharacterEncoding("utf-8");
        String name=servletRequest.getParameter("name");
        Integer age=Integer.parseInt(servletRequest.getParameter("age"));
        String sex=servletRequest.getParameter("sex");
        User user=new User(name,age,sex);
        UserDao userDao=new UserDao();
        int row=userDao.AddUser(user);
        if (row>=1){
            servletRequest.getRequestDispatcher("index.jsp").forward(servletRequest,servletResponse);
        }else {
            servletRequest.setAttribute("msg","添加失败");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
