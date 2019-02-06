<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 23/10/2018
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<center><body>

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<h2><s:actionmessage/></h2>

<s:iterator value="sites">
    <h4>Site(s)</h4>
    <p>
        <s:a action="site_detail">
            <s:param value="id" name="site_id"/>
            Nom : <s:property value="nom"/></s:a><br/>
        Région : <s:property value="region"/>
        Description : <s:property value="description"/><br/>
    </p>

</s:iterator>

<s:iterator value="secteurs">
    <h4>Secteur(s)</h4>
    <p>
        <s:a action="site_detail">
            <s:param value="id" name="site_id"/>
            Nom : <s:property value="nom"/><br/></s:a><br/>
        Description : <s:property value="description"/>
    </p>

</s:iterator>

<s:iterator value="voies">
    <h4>Voie(s)</h4>
    <s:a action="voie_detail">
        <s:param name="voie_id" value="id"/>
        ID : <s:property value="id"/>
        <p>Nom : <s:property value="nom"/></p> </s:a>
    <p>Description : <s:property value="description"/></p>

</s:iterator>
<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>
</body></center>
</html>
