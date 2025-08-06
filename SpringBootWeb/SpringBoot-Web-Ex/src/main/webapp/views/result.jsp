<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Result : <%= session.getAttribute("result") %> </h2>

        <h2> Result(JSTL syntax) : ${result}</h2>



    </body>
</html>