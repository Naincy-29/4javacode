<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String userid=request.getParameter("userid");
String pwd=request.getParameter("pwd");
if(userid!=null&&pwd!=null){
	if(userid.trim().length()>0&&pwd.trim().length()>0){
		if(userid.equals(pwd)){
			response.sendRedirect("search.jsp");
		
		}
	}
}
else{
%>
<h1>invalid user name password</h1>
<%
}
%>

<form action=login1.jsp method="post">
<table>
<tr>
<td>
<label>USERID</label>
</td>
<td>
<input type="text" name="userid" placeholder="enter u r name">
</td>
<tr>
<td>
<label>PASSWORD</label>
</td>
<td>
<input type="password" name="pwd" placeholder="enter 10 digit password">
</td>

</table>
</form>

</body>
</html>