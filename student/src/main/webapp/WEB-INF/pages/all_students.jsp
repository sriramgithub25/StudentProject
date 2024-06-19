<%@page import= "java.util.List"%>
<%@page import= "com.qedge.student.model.Student"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Details</title>
    <script src="js/student.js"></script>
</head>
<body>
    <h1 style=background-color:blue;padding:25px>Student Details</h1>
    <form name="frm">
    <input type="hidden" name="stu_id"/>  
    <table width="100%">
    <tr>
            <td align="right"><input type="button" value="Add Student" onClick="addStudent()"/></td>
        </tr>
        </table>
    <table border=1 width="100%">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <%List<Student> students = (List<Student>)request.getAttribute("students");
           for(Student st : students){
           %>
        <tr>
            <td align="center"><%=st.getStuId()%></td>
            <td align="center"><%=st.getFirstName()%></td>
            <td align="center"><%=st.getLastName()%></td>
            <td align="center"><input type="button" value="Edit" onClick="editStudent(<%= st.getStuId()%>)"/></td>
            <td align="center"><input type="button" value="Delete" onClick="deleteStudent(<%= st.getStuId()%>)"/></td>
        </tr>
        <%
        }
        %>
    </table>
    </form>
</body>
</html>