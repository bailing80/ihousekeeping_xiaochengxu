<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>题库页面</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
<script type="text/javascript" src="<%=baseurl%>/js/test_util.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>类型</td>
			<td>
			<select id="name"style="width: 30%" class="form-control">
			<option value="1">Java</option>
			<option value="2">小程序</option>
			<option value="3">网络安全</option>
			<option value="4">销售</option>
			</select>
			<!-- <input id="name" type="text" size="2" class="form-control"
				> --></td>
		</tr>
		<tr>
			<td>题目</td>
			<td><input id="age" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>A</td>
			<td><input id="height" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>B</td>
			<td><input id="b" type="text" size="2"
				class="form-control" style="width: 28%"></td>
		</tr>
		<tr>
			<td>C</td>
			<td><input id="c" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>D</td>
			<td><input id="d" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>Answer</td>
			<td><input id="answer" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
	</table>

</body>
</html>