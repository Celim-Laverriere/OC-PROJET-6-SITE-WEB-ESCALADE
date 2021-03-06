<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 28/02/2019
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                <h5>Modification d'une Voie !</h5>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12" style="text-align: center; margin-top: 1%">
                <p> <s:actionerror/></p>
            </div>
        </div>

        <div class="row justify-content-center">
            <div class="col-md-10">
                <s:form action="modified_voie">
                    <div class="form-group">

                        <label for="inputNomVoie">Nom de la voie</label>
                        <input name="modifiedVoie.nom" id="inputNomVoie" value="<s:property value="#session.voie.nom"/>"
                               type="text" class="form-control" style="width: 100%" requiredLabel="true"
                               required="true" autofocus>

                        <div class="row align-justify">
                            <div class="col-md-4">
                                <label for="selectTypeVoie">Type de la voie</label>
                                <select name="modifiedVoie.type_voie" id="selectTypeVoie" required="true" class="form-control">
                                    <s:if test="#session.voie">
                                        <option selected="selected"><s:property value="#session.voie.type_voie"/></option>
                                    </s:if>
                                    <c:forEach var="type" items="${listTypesVoie}">
                                        <option><c:out value="${type}"/></option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col-md-4">
                                <label for="selectCotationVoie">Cotation de la voie</label>
                                <select name="modifiedVoie.cotation" id="selectCotationVoie" required="true" class="form-control">
                                    <s:if test="#session.voie">
                                        <option selected="selected"><s:property value="#session.voie.cotation"/></option>
                                    </s:if>
                                    <c:forEach var="cotation" items="${cotations}">
                                        <option><c:out value="${cotation}"/></option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col-md-4">
                                <label for="inputHauteurVoie">Hauteur de la voie</label>
                                <input name="hauteur" id="inputHauteurVoie" value="<s:property value="#session.voie.hauteur"/>"
                                       type="number" step="0.10" class="form-control" required="true">
                            </div>
                        </div>

                        <label for="textareaDescriptionVoie">Description du secteur</label>
                        <textarea name="modifiedVoie.description" id="textareaDescriptionVoie" cols="40" rows="5" class="form-control"
                                  style="width: 100%"><s:property value="#session.voie.description"/></textarea>
                    </div>

                    <div class="row justify-content-center">
                        <div class="col-md-5">
                            <button class="btn btn-primary" type="submit" style="width: 100%">Validez</button>
                        </div>
                        <div class="col-md-5">
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#cancelVoie" style="width: 100%">Annuler</button>
                        </div>
                    </div>
                </s:form>
            </div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="cancelVoie" tabindex="-1" role="dialog" aria-labelledby="modyfVoieModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Annulez la modification de la voie</h5>
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
                    <s:a action="voies_by_account">
                        <button type="button" class="btn btn-primary">Confirmez</button>
                    </s:a>
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
