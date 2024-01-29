<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>placement Detail</title>
</head>
<body>

    <h1>PLACEMENT DETAIL</h1>
    <form action="addStudent">
        Name: <input type="text" name="studentName"> <br>
        RollNo: <input type="text" name="rollNo"> <br>
        CompanyName:<input type="text" name="companyName"> <br>
        CGPA:<input type="text" name="cgpa"> <br>
        Whether placed :<input type="text" name="whetherPlaced"> <br>
               <input type="submit">
    </form>

    <h1>view user</h1>
    <form action="viewStudent">
        RollNo: <input type="text" name="rollNo"> <br>
       
               <input type="submit">
    </form>
    <h1>Delete</h1>
    <form action="deleteStudent">
       
        RollNo: <input type="text" name="rollNo"> <br>
               <input type="submit">
    </form>
    <form action ="updateStudent">
        Name:<input type ="text" name="studentName"><br>
        RollNo:<input type ="text" name="rollNo"><br>
        CompanyName:<input type="text" name="companyName"> <br>
        CGPA:<input type="text" name="cgpa"> <br>
        Whether placed :<input type="text" name="whetherPlaced"> <br>
        <input type ="submit">
    </form>

    

    <!-- Hyperlink back to the home page -->
    <a href="home.jsp">Go back to Home Page</a>

</body>
</html>
