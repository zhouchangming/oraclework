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
		
	<style type="text/css">
		
		body {font-size:150%;}
	
	</style>
    </head>
	
    <body>

        <h1>你好 欢迎您 ${username}</h1>
        <br>
        <a href="${pageContext.request.contextPath }/selectUserInfo.handler"><button class="selectinfo">查询我的信息</button></a>
        <div class="msg">
        	你的创建时间是  ${userInfo.createdate}<br>
        	你的积分是          ${userInfo.riches}<br>
        	你最后一次登陆的时间为 ${userInfo.lastlogin}
        </div>
        
        <form action="${pageContext.request.contextPath }/addRiches.handler">
        	心情好把自己积分变为 <input name="index"></input> 倍   <br>
        	共增加了 ${sum} 积分
        	<button class="selectinfo" type="submit">增加</button>
        </form>
        
        <a href="${pageContext.request.contextPath }/loginOut.handler"><button class="selectinfo">退出</button></a>
        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>

</html>

