<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <link href="${pageContext.request.contextPath}/page/Pager.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/page/jquery-1.3.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/page/jquery.pager.js" type="text/javascript"></script>
    <script type="text/javascript" language="javascript">

        $(document).ready(function() {
            $("#pager").pager({ pagenumber: 1, pagecount: 15, buttonClickCallback: PageClick });
        });

        PageClick = function(pageclickednumber) {
            $("#pager").pager({ pagenumber: pageclickednumber, pagecount: 15, buttonClickCallback: PageClick });
            $("#result").html("Clicked Page " + pageclickednumber);
        }
       
    </script>
</head>
<body>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<h1 id="result">Click the pager below.</h1>
<div id="pager" ></div>
</body>
</html>