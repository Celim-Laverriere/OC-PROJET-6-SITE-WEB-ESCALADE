<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 12/10/2018
  Time: 11:38
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
        <%@include file="../_include/barreDeRecherche.jsp"%>
    </header>

    <h2>Topos d'éscalades !</h2>

        <s:iterator value="topos">
            <p>
                <s:a action="topo_detail">
                    <s:param value="id" name="topo_id"/>
                    Nom : <s:property value="nom"/><br/></s:a>
            </p>
        </s:iterator>

</body></center>
</html>
