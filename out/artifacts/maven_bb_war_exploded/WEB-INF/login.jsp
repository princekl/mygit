<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    <form action="login.do"  method="post">
          账号:<input  type="text"  name="no"> <br>
          密码: <input  type="password"  name="password"> <br>
    <input  type="submit"  value="登录"> ${msg}
    </form>
</body>
</html>