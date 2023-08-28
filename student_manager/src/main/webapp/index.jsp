<%@ page import="java.util.List" %>
<%@ page import="po.User" %>
<%@ page import="dao.UserDao" %>
<%--
  Created by IntelliJ IDEA.
  User: 22373
  Date: 2023/8/22
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello</title>
    <meta charset="UTF-8">
    <style type="text/css">
      table{
        width: 300px;
        text-align: center;
      }
    </style>
    <%
      String msg=(String) request.getAttribute("msg");
      if (msg!=null){
    %>
      <script type="text/javascript">
        alert("抱歉！！"+msg);
      </script>
    <%
    }
    %>
  </head>
  <body>
    <div>
      <%

        UserDao userDao=new UserDao();
        List<User> users=userDao.QueryAllUser();
      %>
      <form action="Add" method="post">
        <input type="text" name="name" placeholder="请输入姓名" required>
        <input type="text" name="sex" placeholder="请输入性别" required>
        <input type="text" name="age" placeholder="请输入年龄" required>
        <input type="submit" value="添加">
      </form>

      <table border="1">
        <tr>
          <th>姓名</th>
          <th>性别</th>
          <th>年龄</th>
          <th>操作</th>
        </tr>
        <%
          for (int i=0;i<users.size();i++){
        %>
        <tr>
          <td>
            <%=users.get(i).getName()%>
          </td>
          <td>
            <%=users.get(i).getSex()%>
          </td>
          <td>
            <%=users.get(i).getAge()%>
          </td>
          <td>
            <a href="Del?id=<%=users.get(i).getId()%>">删除</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="QueryId?id=<%=users.get(i).getId()%>">查询信息</a>
          </td>
        </tr>
        <%
          }
        %>
      </table>


    </div>
  </body>
</html>
