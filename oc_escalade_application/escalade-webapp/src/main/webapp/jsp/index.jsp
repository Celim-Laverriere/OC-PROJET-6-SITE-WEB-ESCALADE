<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/09/2018
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <%@include file="_include/head.jsp"%>
    </head>
<body>

    <header>
        <%@include file="../jsp/_include/header.jsp"%>
    </header>

    <%--Lien temporaire pour créer un site complet--%>
    <ul class="nav nav-pills" style="margin-left: 50%">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
               role="button" aria-haspopup="true" aria-expanded="false">MES SITES</a>
            <div class="dropdown-menu">
                <s:a action="complete_creation_climbing_site" class="dropdown-item">
                    Créer un nouveau Site d'escalade complet
                </s:a>

            </div>
        </li>
    </ul>

    <footer>
        <%@include file="../jsp/_include/footer.jsp"%>
    </footer>

</body>

</html>
