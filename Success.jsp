<%-- 
    Document   : Success
    Created on : 2 Νοε 2020, 1:55:23 μμ
    Author     : Konstantinos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"  crossorigin="anonymous">
        <title>Successful item addition</title>
    </head>
    <body class="text-center">
        <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
	
	<main role="main" class="inner cover">
            <h2 class="cover-heading">Successful item addition! <br><br></h2>
            <h3> Item Details<br></h3>
	</main>
        
        <div class="container">
            <div class="card bg-light">
                <article class="card-body mx-auto" style="max-width: 600px;">
    
                    Barcode: <b><%= request.getParameter("Barcode") %></b><br>
                    Name: <b><%= request.getParameter("Name") %></b><br>
                    Colour:<b><%= request.getParameter("Colour") %></b><br>
                    Description:<b><%= request.getParameter("Description") %></b><br>
                   

                </article>
            </div> 
        </div>    
        </div>
    </body>
</html>
