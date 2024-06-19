<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="js/student.js"></script>
</head>
<body>
   <h1>Add Student</h1>
    <form name="frm" action="saveStudent">
        <table border="1">
            <tr>
                <td>First Name</td>
                <td><input name="first_name"/></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input name="last_name"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                <input type="reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Save"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="Cancel" onClick="findAllStudents()"/></td>
            </tr>
        </table>
    </form>
</body>
</html>