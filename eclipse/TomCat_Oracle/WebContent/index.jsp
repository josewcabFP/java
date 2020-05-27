<%@ page language="java" %>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.SQLException" %>
<%@ page import = "java.sql.Statement" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Saludo de prueba con JSP</title>
</head>
<body>
<h1>Conexión BD Oracle</h1>
<%
	try{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","clase","clase");
		 Statement miStatement = conexion.createStatement();
		 ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM employees");
		 out.println("<table border=\"1\">");
		 out.println("<tr><th>Nombre</th><th>Trabajo</th></tr>");
		 while(miResultSet.next()) {
		 	out.println("<tr>");
		 	out.println("<td>" + miResultSet.getString("ename") + "</td>");
		 	out.println("<td>" + miResultSet.getString("job") + "</td>");
		 	out.println("</tr>");
		 }
		 out.println("</table>");
		 
	}catch(SQLException | ClassNotFoundException ex){
		
	}

%>
    
</body>
</html>