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
<body>

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<div class="container">

    <s:iterator value="voie">

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h4>Detail de la listVoies : <s:property value="nom"/></h4>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <p>Description : <s:property value="description"/></p>
            <p>La difficulté moyenne de la voie et de <s:property value="cotation"/>, cette voie est "<s:property value="type_voie"/>".</p>
        </div>
    </div>

    <hr width="50%" color="#DCDCDC">

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h4>Longueur(s) & Relai(s)</h4>
        </div>
    </div>

    <s:if test="%{voie.longueursRelais.isEmpty()}">
        <p style="text-align: center">Aucune données concernant les longueures et les relais de cette voie n'ont encore été communiquer !</p>
    </s:if>
    <s:else>
        <s:iterator value="voie.longueursRelais">
            <div class="row">
                <div class="col-md-12">

                    <p>La longueur N° <s:property value="num_longueur"/> est d'une hauteur de <s:property value="hauteur"/>
                        <s:if test="%{num_relai != 0}">
                        mètres pour atteindre le relai N° <s:property value="num_relai"/></p>
                    </s:if>
                    <s:else>
                        mètres pour enfin atteindre le sommet !
                    </s:else>
                    <p>La difficultée de la longueur est de <s:property value="cotation"/>.</p>

                </div>
            </div>
        </s:iterator>
    </s:else>

    <hr width="100%" color="#DCDCDC">
</div>

</s:iterator>

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>
</html>
