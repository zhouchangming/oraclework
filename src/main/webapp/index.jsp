<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>Fullscreen Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">


    </head>

    <body>

        <div class="page-container">
            <h1>欢迎登录</h1>
            <form action="${pageContext.request.contextPath}/login.handler" method="post">
                <input type="text" name="username" class="username" placeholder="Username"><p>${error}</p>
                <input type="password" name="userpassword" class="password" placeholder="Password">
                <button type="submit">登录</button>
                
                <div class="error"><span>+</span></div>
            </form>
            <a href='register.jsp'><button type="button">点击注册</button></a>
		</div>
        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>

</html>

