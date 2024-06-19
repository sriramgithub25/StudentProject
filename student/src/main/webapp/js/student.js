function findAllStudents(){
          document.frm.action="getAllStudents";
          document.frm.submit();
        }
        function deleteStudent(stuId){
           var  flag = confirm("Do you wish to delete the Student (OK/Cancel) : " +stuId);
           if(flag){
           document.frm.stu_id.value=stuId;
           document.frm.action="deleteStudent";
           document.frm.submit();
           }
           }
           function editStudent(stuId){
           document.frm.stu_id.value=stuId;
           document.frm.action="editStudent";
           document.frm.submit();
           }
        function addStudent(){
           document.frm.action="addStudent";
           document.frm.submit();
        }
        