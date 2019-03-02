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

    <div class="container">
        <div class="row">
            <div class="col-md-12" style="background: antiquewhite">
                <p>One of three columns</p>
            </div>
            <div class="col-md-3" style="background: rebeccapurple">
                <p>One of three columns</p>
            </div>
            <div class="col-md-3" style="background: royalblue">
                <p>One of three columns</p>
            </div>
            <div class="col-md-3" style="background: red">
                <p>One of three columns</p>
            </div>
            <div class="col-md-3" style="background: aquamarine">
                <p>One of three columns</p>
            </div>
        </div>
    </div>

    <a href="pdf_topos/Edemere_topo.pdf" download>Télécharger</a>

    <footer>
        <%@include file="../jsp/_include/footer.jsp"%>
        <%@include file="../jsp/_include/scripts.jsp"%>
    </footer>

</body>

</html>
