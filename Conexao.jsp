<%@page import="br.com.connection.ConexaoMySQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
    out.println(ConexaoMySQL.statusConection());
%>
<%
 
    ConexaoMySQL.getConexaoMySQL();
 
   out.println(ConexaoMySQL.statusConection());
 
%>
    </body>
</html>
