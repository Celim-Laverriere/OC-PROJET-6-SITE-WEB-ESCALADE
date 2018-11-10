<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/10/2018
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<center><body>
    <header>
        <%@include file="header.jsp"%>
        <%@include file="barreDeRecherche.jsp"%>
    </header>

    <h1>COMPTE</h1>

    <div>
        <button><s:a action="formulaire_site">Créer un nouveau Site d'escalade</s:a> </button>
        <button><s:a action="formulaire_secteur">Créer un nouveau Secteurs</s:a> </button>
        <button><s:a action="">Créer un nouvelle Voie</s:a> </button>
        <button><s:a action="">Créer un nouveau Relai</s:a> </button>
        <button><s:a action="">Créer une nouvelle Longueure</s:a></button>
    </div>

    <h1><s:actionmessage/></h1>

    <footer>

    </footer>

</body></center>
</html>
