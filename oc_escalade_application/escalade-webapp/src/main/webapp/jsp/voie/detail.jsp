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

        <div class="row">
            <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
                <h4>Detail de la voies</h4>
            </div>
        </div>

        <s:iterator value="voie">

        <div class="row">
            <div class="col-md-12">
               <h6>Voie : <s:property value="nom"/></h6>
            </div>
        </div>
        <hr width="100%" color="#DCDCDC">

        <div class="row">
            <div class="col-md-12">
                <s:iterator value="relais">
                    <p>
                        Le relai numéro <s:property value="num_relai"/>
                        ce trouve à une hauteur de <s:property value="hauteur"/> mètres.
                    </p>
                </s:iterator>
            </div>
        </div>
            <hr width="100%" color="#DCDCDC">

        <div class="row">
            <div class="col-md-12">
                <s:iterator value="longueurs">
                    <p>
                        La longueur numéro <s:property value="numero"/>
                        est d'une hauteur de <s:property value="hauteur"/> mètres,
                        pour une difficultée de <s:property value="cotation"/>.
                    </p>
                </s:iterator>
            </div>
        </div>
        </s:iterator>
        <hr width="100%" color="#DCDCDC">
    </div>




    <footer>
        <%@include file="../_include/footer.jsp"%>
    </footer>

</body>
</html>
