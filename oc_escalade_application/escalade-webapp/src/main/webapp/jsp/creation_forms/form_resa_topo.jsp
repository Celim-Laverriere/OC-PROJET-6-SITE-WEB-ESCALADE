<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 07/03/2019
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<section>
    <%@include file="../_include/user_menu.jsp"%>

    <div class="container" style="border-style: solid; border-color: #DCDCDC; border-width: 2px; border-radius: 10px;
        margin-top: 1%; box-shadow: 6px 6px 14px #DCDCDC">

        <s:iterator value="topo">
        <div class="row">
            <div class="col-md-12" style="text-align: center; margin-top: 1%">
                <h5>Formulaire de réservaton du topo : <s:property value="nom"/> </h5>
            </div>
        </div>
        </s:iterator>

    </div>
</section>

</body>
</html>
