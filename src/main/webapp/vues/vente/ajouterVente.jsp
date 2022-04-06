<%-- 
    Document   : ajouterVente
    Created on : 11 octobre 2021, 10:02:51
    Author     : adminsio
--%>

<%@page import="model.Lieu"%>
<%@page import="model.CategVente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="forms.FormAjoutVente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equida</title>
        <link rel="StyleSheet" href="./../css/style.css" type="text/css" />
    </head>
    <body>
         <h1>NOUVELLE VENTE</h1>
        
         <%
                //Vente Vente=(Vente)request.getAttribute("client");
                FormAjoutVente form = (FormAjoutVente)request.getAttribute("form");
            %>
        
        <form class="form-inline" action="ajouterVente" method="POST">
                <label for="nom">Nom : </label>
                <input id="nom" type="text" name="nom"  size="30" maxlength="30">
                </br>
                
                <label for="dateDebutVente">DateDebutVente : </label>
                <input id="dateDebutVente"  type="text"  name="dateDebutVente" size="30" maxlength="30">      
                </br>
                
                
                <label for="categVente">CategVente : </label>
                <select name="codeCategVente">
                    <%
                        ArrayList<CategVente> lesCategVentes = (ArrayList)request.getAttribute("pLesCategVentes");
                        for (int i=0; i<lesCategVentes.size();i++){
                            CategVente p = lesCategVentes.get(i);
                            out.println("<option value='" + p.getCode()+"'>" + p.getLibelle()+"</option>" );
                        }
                    %>
                </select>
                </br> 
                
                <label for="lieu">Lieu : </label>
                <select name="idLieu">
                    <%
                        ArrayList<Lieu> lesLieux = (ArrayList)request.getAttribute("pLesLieux");
                        for (int i=0; i<lesLieux.size();i++){
                            Lieu p = lesLieux.get(i);
                            out.println("<option value='" + p.getId()+"'>" + p.getVille()+"</option>" );
                        }
                    %>
                </select>
                </br> 
               
                
                <%-- Cases à cocher permettant de choisir les différentes catégories de vente auxquelles le client souhaite s'inscrire 
                <label for="categVente">Categories de vente : </label></br>
                 <%
                        ArrayList<CategVente> lesCategVente = (ArrayList)request.getAttribute("pLesCategVente");
                        for (int i=0; i<lesCategVente.size();i++){
                            CategVente cv = lesCategVente.get(i);
                            out.println("<input type='checkbox' id='cb" + i + "' name='" + cv.getCode() + "'>"); 
                            out.println(cv.getLibelle()); 
                            out.println("</label></br>");
                        }
                    %>
                    </br>
                    --%>
                                
            <input type="submit" name="valider" id="valider" value="Valider"/>
            </form>
    </body>
</html>
