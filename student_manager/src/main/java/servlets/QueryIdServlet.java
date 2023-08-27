package servlets;


import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import po.User;

public class QueryIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setCharacterEncoding("utf-8");
        int id=Integer.parseInt(req.getParameter("id"));
        UserDao userDao=new UserDao();
        User user=userDao.QueryUserById(id);
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer=resp.getWriter();
        writer.write(user.toString());
    }

}
