<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/02/2019
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

</head>
<body>

<section>
    <%@include file="../_include/user_menu.jsp"%>

    <div class="container" style="border-style: solid; border-color: #DCDCDC; border-width: 2px; border-radius: 10px;
        margin-top: 1%; box-shadow: 6px 6px 14px #DCDCDC">

        <div class="row">
            <div class="col-md-12" style="text-align: center; margin-top: 1%">
                <h2>Création d'un nouveau topo</h2>

                <div class="row justify-content-center">
                    <div class="col-md-10">

                        <s:form action="new_topo" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for="inputNomTopo">Entrez le nom du topo</label>
                                <input id="inputNomTopo" name="topo.nom" type="text" class="form-control">
                            </div>

                            <label for="fileTopo">Choisissez une photo du topo</label>
                            <div class="form-group">
                                <input type="file" name="upload" id="fileTopo" accept="image/jpeg" style="display: inline-block; align-items: center"/>
                            </div>


                            <div class="form-group">
                                <label for="textareaDescriptionSite">Description du site</label>
                                <textarea name="topo.description" id="textareaDescriptionSite" rows="5" class="form-control"></textarea>
                            </div>

                            <button type="submit" class="btn btn-primary"  >Validez</button>
                        </s:form>
                    </div>
                </div>
            </div>
        </div>

    </div>

</section>
<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>
</html>
