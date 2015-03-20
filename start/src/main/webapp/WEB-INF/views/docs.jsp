<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>docs</title>
	<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
</head>
<body>
	<script>
		$(function(){
			$.ajax({
				url : '/google/docs.htm',
				type : 'POST',
				data : {
					test1 : 'AAA',
					test2 : 'BBB'
				},
				dataType :'json',
				success : function(data){
					console.log(data);
				}
			})
		});
	</script>
</body>
</html>
