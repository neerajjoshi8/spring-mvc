<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Form</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="processStudentForm" method="GET"
		modelAttribute="student">
		<form:label path="name">Student name: </form:label>
		<form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br />
		<form:label path="age">Age: </form:label>
		<form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br />
		<form:label path="marks">Marks</form:label>
		<form:input path="marks" />
		<br />

		<form:label path="division">Division</form:label>
		<form:input path="division" />
		<form:errors path="division" cssClass="error" />
		<br />
		<form:label path="subjects">Subjects</form:label>
		<form:select path="subjects">
			<form:option value="Maths" label="Maths" />
			<form:option value="English" label="English" />
			<form:option value="Science" label="Science" />
		</form:select>
		<br />
		<input type="submit">
	</form:form>
</body>
</html>