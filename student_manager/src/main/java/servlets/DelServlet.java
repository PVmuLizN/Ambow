package servlets;

// import com.servlet.dao.UserDao;



import dao.UserDao;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class DelServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        Integer id=Integer.parseInt(servletRequest.getParameter("id"));
        UserDao userDao=new UserDao();
        int row=userDao.DeleteUser(id);
        if (row>=1){
            servletRequest.getRequestDispatcher("index.jsp").forward(servletRequest,servletResponse);
        }else {
            servletRequest.setAttribute("msg","删除失败");
            servletRequest.getRequestDispatcher("index.jsp").forward(servletRequest,servletResponse);
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
