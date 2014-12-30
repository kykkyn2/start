<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<button id="test">오오오</button>
	<script>
		document.getElementById('test').onclick = function () {
			$.ajax({
				url : 'test.htm',
				type : 'GET',
				success : function(res){
					
					console.log(res);
					console.log($.parseJSON(res));
				}
			});
		}
		
		
	</script>
</body>
</html>
