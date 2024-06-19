<%@page import = "com.qedge.student.model.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Edit Student</h1>
    <form action="updateStudent">
    <%
       Student st = (Student) request.getAttribute("st");
    %>
    <table border="1">
        <tr>
            <td>ID</td>
            <td><input name="stu_id" value="<%= st.getStuId()%>" readonly/></td>
        </tr>
        <tr>
            <td>First Name</td>
            <td><input name="first_name"value="<%= st.getFirstName()%>"/></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input name="last_name" value="<%= st.getLastName()%>" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Update"/></td>
        </tr>
    </table>
</form>
</body>
</html>