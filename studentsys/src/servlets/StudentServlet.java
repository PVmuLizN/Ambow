package servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import po.Student;
import utils.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            // 假设你已经在应用中配置了数据库连接
            Connection connection = JDBCUtil.getConnection();
            StudentDAO studentDAO = new StudentDAO(connection);

            if ("add".equals(action)) {
                String name = request.getParameter("name");
                int age = Integer.parseInt(request.getParameter("age"));
                Student student = new Student();
                student.setName(name);
                student.setAge(age);
                studentDAO.addStudent(student);

            } else if ("delete".equals(action)) {
                int studentId = Integer.parseInt(request.getParameter("studentId"));
                studentDAO.deleteStudent(studentId);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("index.html"); // 重定向回表单页面
    }
}

