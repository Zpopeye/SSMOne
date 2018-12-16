<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basepath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here </title>
</head>
<body>
	<h1>Insert title here SSM登入成功页面</h1>
	<h1>Insert title here 欢迎你:${u.realname }</h1>
	
	
</body>
</html>