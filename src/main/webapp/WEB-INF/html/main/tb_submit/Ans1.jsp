<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Java</title>
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/main/tb_submit/ans1.js"></script>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	outline: 0
}

a {
	text-decoration: none
}

body, html {
	font-size: 20px;
	background: #999999;
	font-family: 'Microsoft YaHei,微软雅黑';
	height: 100%;
}

-webkit-input-placeholder {
	color: #ccc
}

::-moz-placeholder {
	color: #ccc
}

:-ms-input-placeholder {
	color: #ccc
}

input:-moz-placeholder {
	color: #ccc
}

html {
	font-size: 20px;
	height: 100%
}

@media only screen and (min-width:320px) and (min-height:480px) {
	html {
		font-size: 20px !important
	}
}

@media only screen and (min-width:320px) and (min-height:568px) {
	html {
		font-size: 20px !important
	}
}

@media only screen and (min-width:360px) and (min-height:640px) {
	html {
		font-size: 22.5px !important
	}
}

@media only screen and (min-width:375px) and (min-height:667px) {
	html {
		font-size: 23.5px !important
	}
}

@media only screen and (min-width:414px) and (min-height:736px) {
	html {
		font-size: 25.9px !important
	}
}

@media only screen and (min-width:736px) {
	html {
		font-size: 46px !important
	}
}
</style>
<script src="<%=baseurl%>/js/jquery.js"></script>
<style type="text/css">
body{
font-size: 64px;
}
.radio{
width:4em;
height:1em;
transform:scale(3);
}
#username,#userphone{
width: 8em;
height: 1em;
font-size:64px; 
}
table {
	 width: 100%;
	/* border: 1px solid red; */
}
#getTableSetByJS td:nth-child(odd){
/*background:#ff0;*/
width:4em;
}
#submit{
width: 100%;
height: 8em;
font-size: 64px;
}
</style>
</head>
<body background="#999999">

	<form action="" >
		<table>
			<tr>
				<th>入职笔试<img src="<%=baseurl%>/html/main/tb_submit/meiba.jpg" width="100px" height="100px"/></th>
			</tr>
			<tr>
				<td>姓名：<font><input id="username" name="name"></font></td>
			</tr>
			<tr>
				<td>电话：<font><input id="userphone" name="phone"></font></td>
			</tr> 
		</table>
	<div id="getTableSetByJS"></div>
	<center><input id="submit" type="button" value="提交" ></center>
	</form>
</body>
</html>