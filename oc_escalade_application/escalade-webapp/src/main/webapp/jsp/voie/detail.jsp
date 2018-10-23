<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 19/10/2018
  Time: 14:32
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

    <h3>Detail de la voies</h3>
    <s:iterator value="voie">
        Nom : <s:property value="nom"/>

            <h4>Les relais</h4>
            <s:iterator value="relais">
                <p>
                    ID : <s:property value="id"/>
                    Numéro du relai : <s:property value="num_relai"/>
                    Hauteur : <s:property value="hauteur"/>
                </p>
            </s:iterator>

            <h4>Les longueurs</h4>
            <s:iterator value="longueurs">
                <p>
                    Id : <s:property value="id"/>
                    Numéro de la longueur : <s:property value="numero"/>
                    Hauteur : <s:property value="hauteur"/>
                    Cotation : <s:property value="cotation"/>
                </p>
            </s:iterator>
    </s:iterator>

</body></center>
</html>
