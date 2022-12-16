<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Info</title>
<%--     <link rel="stylesheet" href="${request.getContextPath()}/resources/css/main.css"> --%>
</head>
<body>
	<h1>User name ${param.name}</h1>
	<h1>User name using model ${userName}</h1>
	<h1>User name using model and @RequestParam ${userNameByRequestParam}</h1>

</body>
</html>