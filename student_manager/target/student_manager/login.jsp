<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ page
isELIgnored="false" %>
<html>
    <head>
        <title>Title</title>
        <style type="text/css">
            div {
                text-align: center;
                width: 500px;
                height: 300px;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>
        <div>
            <form action="LoginServlet" method="post">
                用户名:<input type="text" name="username" /><br />
                密&nbsp;&nbsp;&nbsp;码:<input
                    type="password"
                    name="password"
                /><br />
                <input type="submit" value="登录" />
            </form>
        </div>
    </body>
</html>
