<%-- 
    Document   : consulterVente
    Created on : 11 oct. 2021, 12:01:02
    Author     : adminsio
--%>

<%@page import="model.Vente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equida</title>
    </head>
    <body>
         <h1>Infos ventes</h1>
        
         <%
        Vente uneVente = (Vente)request.getAttribute("pVente");
        %>
        
        
         <table class="table table-bordered table-striped table-condensed">
            <tr><td>ID :</td><td><% out.println(uneVente.getId());%></td></tr>
            <tr><td>NOM :</td><td><% out.println(uneVente.getNom());%></td></tr>
            <tr><td>DATEDEBUTVENTE :</td><td><%  out.println(uneVente.getDateDebutVente());%></td></tr>
           
          <tr><td> Catégories selectionnées</td><td>
          <% for (int i=0; i<uneVente.getCategVente().size(); i++){
               out.println(uneVente.getCategVente().get(i) + "</br>");  
          }
          %>
              </td></tr>
          
          <tr><td> Lieux selectionnés</td><td>
          <% for (int i=0; i<uneVente.getLieuVente().size(); i++){
               out.println(uneVente.getLieuVente().get(i) + "</br>");  
          }
          %>
              </td></tr>
        </table>
        
    </body>
</html>

