<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 23/10/2018
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <p>
                <s:a action="site_detail">
                    <s:param value="id" name="site_id"/>
                    Nom : <s:property value="nom"/></s:a><br/>
                    Description : <s:property value="description"/><br/>
            </p>

        </s:iterator>

       <s:iterator value="site">
          <p>
              <s:a action="site_detail">
                    <s:param value="id" name="site_id"/>
                    Nom : <s:property value="nom"/><br/></s:a><br/>
                    Description : <s:property value="description"/>
          </p>

       </s:iterator>

    <footer>

    </footer>
</body></center>
</html>
