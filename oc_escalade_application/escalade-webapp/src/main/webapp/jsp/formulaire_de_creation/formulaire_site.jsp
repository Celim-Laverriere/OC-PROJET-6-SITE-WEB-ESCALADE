<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 27/10/2018
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>

<body>

<div>
    <%@include file="../_include/formulaireChoixCreate.jsp"%>
</div>

<div class="container" style="position: absolute; top: 14%; left: 29%">
    <div class="row justify-content-md-center">
        <div class="col-md-6">
            <h4>Création d'un nouveau SITE</h4>

            <s:form action="new_site">

                <s:textfield name="site.nom" label="Nom du Site" labelposition="top" requiredLabel="true"
                             required="true" class="form-control" style="width: 150%"/>

                <s:select name="site.region" label="region" labelposition="top"
                          list="regionList" listKey="region" listValue="region"
                          emptyOption="true" requiredLabel="true" required="true"
                          class="form-control" style="width: 150%"/>

                <s:textarea name="site.description" label="Description" labelposition="top" cols="40"
                            rows="5" class="form-control" style="width: 150%"/>

                <s:a action="new_site">
                    <button class="btn btn-primary" style="position: absolute; left: 3%; top: 100%">Validez</button>
                </s:a>

            </s:form>

        </div>

        <!-- Button trigger modal -->
        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal"
                style="position: absolute;  left: 35%; top: 100%">Annuler</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Annulez la création d'un nouveau site</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Confirmez l'annulation !
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary"
                        data-dismiss="modal">Annulez</button>
                <s:a action="choixCreate">
                    <button type="button" class="btn btn-primary">Confirmez</button>
                </s:a>
            </div>
        </div>
    </div>
</div>


</body>

</html>

