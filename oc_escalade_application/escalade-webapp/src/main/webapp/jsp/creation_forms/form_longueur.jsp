<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 28/02/2019
  Time: 14:15
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

    <div class="container" style="margin-top: 1%; border-style: solid; border-color: #DCDCDC; border-width: 2px;
     border-radius: 10px; box-shadow: 6px 6px 14px #DCDCDC">

        <div class="row">

            <div class="col-md-12" style="margin-top: 1%">
                <h5>Ajouter un relai!</h5>
                <p>Entrez les longueurs et le relais correspondants à la voie : <s:property value="#session.voie.nom"/></p>
            </div>

            <s:if test="#session.listLongueur">
                <div class="col-md-12">
                    <table class="table table">
                        <thead>
                        <tr>
                            <th scope="col">Longueur</th>
                            <th scope="col">Hauteur</th>
                            <th scope="col">Cotation</th>
                            <th scope="col">Relai</th>
                        </tr>
                        </thead>
                        <s:iterator value="listLongueur">
                            <tbody>
                            <tr>
                                <th id="thNumLongueur" scope="row">N° <s:property value="num_longueur"/></th>
                                <td id="tdHauteur"><s:property value="hauteur"/> Mètre(s)</td>
                                <td td="tdCotation"><s:property value="cotation"/></td>
                                <s:if test="%{num_relai == 0}">
                                    <td id="tdNumRelai">Pas de relai</td>
                                </s:if>
                                <s:else>
                                    <td id="tdNumRelai">N° <s:property value="num_relai"/></td>
                                </s:else>
                            </tr>
                            </tbody>
                        </s:iterator>
                    </table>
                </div>
            </s:if>

            <div class="col-md-12" id="formGroupLongueur">
                <s:form action="new_longueur">
                    <div class="form-group">

                        <div class="row align-justify">
                            <div class="col-md-3">
                                <label for="inputHauteurLongueur">Hauteur de la longueur N° <s:property value="#session.initNumLongueur"/></label>
                                <input name="hauteur" id="inputHauteurLongueur" type="number" step="0.10" class="form-control"
                                       style="width: 100%" required="true" autofocus>
                            </div>
                            <div class="col-md-3">
                                <label for="selectCotationLongueur">Cotation de la longueur</label>
                                <select name="longueur.cotation" id="selectCotationLongueur" required="true" class="form-control"
                                        style="width: 100%">
                                    <c:forEach var="cotation" items="${cotations}">
                                        <option><c:out value="${cotation}"/></option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col-md-5">
                                <label for="radiosRelai">Relai</label>
                                <fieldset class="form-group" id="radiosRelai">
                                    <div class="form-check form-check-inline">
                                        <input name="longueur.num_relai" id="relaiOui" value=1 class="form-check-input" type="radio">
                                        <label class="form-check-label" for="relaiOui">
                                            Oui il y a un relai !
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input name="longueur.num_relai" id="relaiNon" value=0 class="form-check-input" type="radio">
                                        <label class="form-check-label" for="relaiNon">
                                            Non il n'y a pas de relai !
                                        </label>
                                    </div>
                                    <small id="relaiHelp" class="form-text text-muted">
                                        Indiquez s'il y a un relai à la fin de cette longueur !
                                    </small>
                                </fieldset>
                            </div>
                            <div class="row align-items-center">
                                <div class="col-md-2" style="margin-right: -1%">
                                    <button id="addLongueur" class="btn btn-primary" type="submit">Validez</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </s:form>
            </div>
        </div>
    </div>

</section>

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>
</html>
