<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 16/10/2018
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>

<center><body>

    <header>
        <%@include file="../_include/header.jsp"%>
    </header>

    <h2>Detail des topos</h2>

        <s:iterator value="topo">
            <p
                ID : <s:property value="id"/><br/>
                Nom : <s:property value="nom"/><br/>
                Date d'upload : <s:property value="date_upload"/><br/>
                Statut : <s:property value="statut"/><br/>
                Desciption : <s:property value="description"/><br/>
            </p>

            <s:iterator value="commentaires">
                <h3>Commentaires</h3>
                <p>
                    <s:property value="id"/><br/>
                    <s:property value="commentaire"/><br/>
                </p>
            </s:iterator>


            <s:iterator value="resaTopos">
                <h3>Reservation des topos</h3>
                <p>
                    <s:property value="id"/><br/>
                    <s:property value="date_debut"/><br/>
                    <s:property value="date_fin"/><br/>
                    <s:property value="compte_id"/><br/>
                </p>
            </s:iterator>

        </s:iterator>


</body></center>
</html>
