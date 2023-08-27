package servlets;

import java.io.IOException;


import dao.UserDao;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import po.Admin;

@WebServlet("/LoginServlet")
public class LoginServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("username");
        String pwd=servletRequest.getParameter("password");
        Admin admin=new Admin();
        admin.setUsername(name);
        admin.setPassword(pwd);
        UserDao userDao=new UserDao();
        Admin admin1=userDao.Login(admin);
        if (admin1!=null){
            servletRequest.getRequestDispatcher("index.jsp").forward(servletRequest,servletResponse);
        }else {
            servletRequest.getRequestDispatcher("login.jsp").forward(servletRequest,servletResponse);
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
