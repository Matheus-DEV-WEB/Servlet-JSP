<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<title>Cadastro de Clientes</title>
</head>

<body>
     <%
     String nome = request.getParameter("Nome");
	 String telefone = request.getParameter("telefone");
	 String email = request.getParameter("email");	
     %>
    <h1> Cadastro de Clientes</h1>
      
      <fieldset>
           <legend> Dados do Cliente Cadastrado </legend>      
           
           <p> O Seguinte Cliente foi Cadastrado com Sucesso: </p>
           
           <p>
           Nome: <%=nome%> <br>
           Telefone: <%=telefone%> <br>
           email: <%=email%>
          </p>
      </fieldset>
</body>
</html>