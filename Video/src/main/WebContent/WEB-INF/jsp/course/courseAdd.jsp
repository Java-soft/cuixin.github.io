<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>course添加界面</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
#oo {
	width: 500px;
	height: 40px;
}

#pp {
	margin-left: 650px;
}

#zz {
	height: 120px;
	background-color: #DDDDDD;
	display: block;
}

* {
	padding: 0;
	line-height: 0;
	margin: 0;
}

#ee {
	margin-left: 50px;
	text-align: left;
	font-size: 40px;
	padding-top: 40px;
}

#mm {
	margin-left: 600px;
}

#op {
	margin-left: 40px;
}

#tb {
	margin-left: 50px;
	height: 400px;
	padding-top: 60px;
	width: 1200px;
}

#hh {
	background-color: white;
}

#tu {
	margin-left: 30px;
}
</style>
</head>

<body>

	<nav class="navbar navbar-inverse" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" id="tu" href="#">视频管理系统</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					 <li  id="tu"><a href="${pageContext.request.contextPath}/video/findallvideo.action">视频管理</a></li>
             <li><a  href="${pageContext.request.contextPath}/speaker/findallspeaker.action" id="tu" >主讲人管理</a></li>
            <li class="active" ><a href="${pageContext.request.contextPath}/course/findallcourse.action" id="tu">课程管理</a>
                
            </li>
					<li id="pp"><a href="#">退出</a></li>
				</ul>
			</div>
		</div>

		<div id="zz">
			<h2 id="ee">添加课程</h2>

		</div>


		<div class="container-fluid" id="hh">


	<div id="tb">
<form class="form-inline" role="form" action="${pageContext.request.contextPath}/course/courseadd.action"
				method="get"	> 
				

					所属学科：<input type="text" name="subjectId" id="oo" ><br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br> 
					标题：<input type="text" name="courseTitle" id="oo"
						> <br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					
					<br> 简介：<input type="text" name="courseDesc" id="oo"
						> <br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					
						


						<button type="submit" class="btn btn-default">保存</button>
			 </form> 
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
				</div>
			</div>
		
			
	</nav>
</body>
</html>