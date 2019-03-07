<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 12/10/2018
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>

<body>

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<section>
    <div class="container">

        <div class="row">
            <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
                <h2>Topos d'éscalades !</h2>
                <hr width="100%" color="#DCDCDC">
            </div>
        </div>

        <s:iterator value="topos">
            <div class="row">

                <c:forEach var="photo" items="${photoList}">
                    <c:if test="${id == photo.topo_id}">
                        <img src="<c:out value="${photo.url_image}"/>" style="width: 200px; height: 200px"
                             alt="<c:out value="${photo.nom}"/>" class="rounded float-left">
                    </c:if>
                </c:forEach>

                <div class="col-md-9" style="margin-top: 5px">
                    <ul>
                        <div class="well well-md">
                            <h4>Nom du topo : <s:property value="nom"/></h4>
                            <p>Description : <s:property value="description"/></p>
                        </div>
                    </ul>
                </div>
            </div>
            <div class="row">
                <div class="col-md-10"></div>
                <div class="col-md-2">
                    <s:a  action="topo_detail" class="btn btn-outline-info" role="button">
                        <s:param name="topo_id" value="id"/>
                        Voir détail
                    </s:a>
                </div>
            </div>
            <hr width="100%" color="#DCDCDC">
        </s:iterator>
    </div>
</section>

<footer>
    <%@include file="../_include/footer.jsp"%>
    <%@include file="../_include/scripts.jsp"%>
</footer>

</body>
</html>
