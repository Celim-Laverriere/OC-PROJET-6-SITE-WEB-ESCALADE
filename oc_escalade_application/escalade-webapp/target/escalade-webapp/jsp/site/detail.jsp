<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 05/10/2018
  Time: 11:15
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

        <h2>Détail du site</h2>

            <li>
                ID : <s:property value="site.id"/><br/>
                Nom : <s:property value="site.nom"/><br/>
                Région : <s:property value="site.region"/><br/>
                Description : <s:property value="site.description"/><br/>
            </li>

        <h3>Commentaires</h3>

        <s:iterator value="site.commentaires">
            <li>
                <s:property value="commentaire"/>
            </li>
        </s:iterator>

        <h3>Secteurs</h3>

            <s:iterator value="site.secteurs">

                <li>
                    Nom : <s:property value="nom"/><br/>
                    Description : <s:property value="description"/>
                </li>

                <h3>Voies</h3>

                <s:iterator value="voies">
                    <li>
                        <s:a action="voie_detail">
                        <s:param value="id" name="voie_id"/>
                        Nom : <s:property value="nom"/></s:a>
                    </li>

                    <%--<h3>Detail des voies</h3>--%>
                    <%--<h4>Les relais</h4>--%>
                    <%--<s:iterator value="relais">--%>
                        <%--<p>--%>
                            <%--ID : <s:property value="id"/>--%>
                            <%--Numéro du relai : <s:property value="num_relai"/>--%>
                            <%--Hauteur : <s:property value="hauteur"/>--%>
                        <%--</p>--%>
                    <%--</s:iterator>--%>

                    <%--<h4>Les longueurs</h4>--%>
                    <%--<s:iterator value="longueurs">--%>
                        <%--<p>--%>
                            <%--Id : <s:property value="id"/>--%>
                            <%--Numéro de la longueur : <s:property value="numero"/>--%>
                            <%--Hauteur : <s:property value="hauteur"/>--%>
                            <%--Cotation : <s:property value="cotation"/>--%>
                        <%--</p>--%>
                    <%--</s:iterator>--%>
                </s:iterator>
            </s:iterator>


</body></center>

</html>
