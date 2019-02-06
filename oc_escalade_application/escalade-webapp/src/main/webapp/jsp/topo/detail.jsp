<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 16/10/2018
  Time: 15:55
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
        <s:iterator value="topo">
        <div class="row">
            <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
                <h2>Detail du topos d'éscalades : <s:property value="nom"/></h2>
                <hr width="100%" color="#DCDCDC">
            </div>
        </div>

            <p
                ID : <s:property value="id"/><br/>
                Date d'upload : <s:property value="date_upload"/><br/>
                Statut : <s:property value="statut"/><br/>
                Desciption : <s:property value="description"/><br/>
            </p>

            <div class="row">
                <div class="col-md-12">
                    <h4>Commentaires</h4>
                </div>
            </div>

            <s:if test="%{topo.commentaires.isEmpty()}">
                <p>Ce topo d'éscalade n'a pas encore de commentaires !</p>
            </s:if>
            <s:else>
                <s:iterator value="commentaires">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="well well-md">
                                <p><s:property value="commentaire"/></p>
                            </div>
                        </div>
                    </div>
                </s:iterator>
            </s:else>

            <s:iterator value="resaTopos">
                <h3>Reservation des topos</h3>
                <p>
                    <s:property value="id"/><br/>
                    <s:property value="date_debut"/><br/>
                    <s:property value="date_fin"/><br/>
                    <s:property value="compte_id"/><br/>
                </p>
            </s:iterator>

        </s:iterator>
    </div>
    <footer>
        <%@include file="../_include/footer.jsp"%>
    </footer>

</body></center>
</html>
