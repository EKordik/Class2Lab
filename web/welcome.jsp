<%-- 
    Document   : welcome
    Created on : Sep 1, 2015, 5:09:25 PM
    Author     : emmakordik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <link rel="stylesheet" type="text/css" href="class2lab.css">
    </head>
    <body>
        <header>
            <h1>Message Service</h1>
        </header>
        <div id="content">
            <form id="nameForm" name="nameForm" method="POST" action="greeter">
                <label for="name">Enter your name:</label>
                <input type="text" id="name" name="name">
                <input type="submit" id="enter" name="enter">
            </form>
        </div>
        
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
        <script src="class2lab.js"></script>
    </body>
</html>
