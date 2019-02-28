<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 23/10/2018
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
    <%@include file="../_include/head.jsp"%>
</head>

<body>

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<div class="container">

    <h2><s:actionmessage/></h2>

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h2>Résultat de votre recherche !</h2>
            <hr width="100%" color="#DCDCDC">
        </div>
    </div>
</div>

<div class="container">
    <s:if test="%{!listSites.isEmpty()}">
        <h3 style="text-align: center">Site(s)</h3>
        <s:iterator value="listSites">
            <div class="row">
                <div class="col-md-9">
                    <h6>Nom : <s:property value="nom"/></h6>
                    <p>Région : <s:property value="region"/></p>
                    <p>Description : <s:property value="description"/></p>
                </div>
                <div class="col-md-3 align-self-center">
                    <s:a  action="site_detail" class="btn btn-outline-info" role="button">
                        <s:param name="site_id" value="id"/>
                        Voir détail
                    </s:a>
                </div>
            </div>
        </s:iterator>
    </s:if>
</div>

<div class="col-md-12"></div>

<div class="container">
    <s:if test="%{!listSecteurs.isEmpty()}">
        <h3 style="text-align: center">Secteur(s)</h3>
        <s:iterator value="listSecteurs">
            <div class="row">
                <div class="col-md-9">
                    <h5>Nom : <s:property value="nom"/></h5>
                    <p>Description : <s:property value="description"/></p>
                    <s:iterator value="secteursRefSite">
                        <s:if test="%{site_id.equals(id)}">
                            <p>Nom du site auquel le secteur apartien : <s:property value="nom"/></p>
                        </s:if>
                    </s:iterator>
                </div>
                <div class="col-md-3 align-self-center">
                    <s:a  action="site_detail" class="btn btn-outline-info" role="button">
                        <s:param name="site_id" value="site_id"/>
                        Voir détail du site
                    </s:a>
                    <p></p>
                    <s:a  action="secteur_detail" class="btn btn-outline-info" role="button">
                        <s:param name="secteur.id" value="id"/>
                        Voir détail du secteur
                    </s:a>
                </div>
            </div>
        </s:iterator>
    </s:if>
    <hr width="100%" color="#DCDCDC">
</div>



<div class="container">
    <s:if test="%{!listVoies.isEmpty()}">
        <h3 style="text-align: center">Voie(s)</h3>
        <s:iterator value="listVoies">
            <div class="row">
                <div class="col-md-9">
                    <h5>Nom : <s:property value="nom"/></h5>
                    <p>Description : <s:property value="description"/></p>
                    <p>Type de voie : <s:property value="type_voie"/></p>
                    <p>Cotation : <s:property value="cotation"/> </p>
                </div>
                <div class="col-md-3 align-self-center">
                    <s:a action="voie_detail" class="btn btn-outline-info" role="button">
                        <s:param value="id" name="voie_id"/>
                        Détail de la voie
                    </s:a>
                </div>
            </div>

            <s:iterator value="voiesRefSecteur">
                <div class="row">
                    <div class="col-md-9">
                        <s:if test="%{secteur_id.equals(id)}">
                            <p>Nom du secteur auquel apartien la voie : <s:property value="nom"/></p>
                        </s:if>
                    </div>
                    <div class="col-md-3 align-self-center">
                        <s:a  action="site_detail" class="btn btn-outline-info" role="button">
                            <s:param name="site_id" value="site_id"/>
                            Voir détail du site
                        </s:a>
                    </div>
                </div>
            </s:iterator>

            <s:iterator value="voiesRefSecteur">
                <s:iterator value="voiesRefSecteurRefSite">
                    <div class="row">
                        <div class="col-md-9">
                            <s:if test="%{site_id.equals(id)}">
                                <p>Nom du site auquel apartien la voie : <s:property value="nom"/> </p>
                            </s:if>
                        </div>
                        <div class="col-md-3 align-self-center">
                            <s:a  action="secteur_detail" class="btn btn-outline-info" role="button">
                                <s:param name="secteur.id" value="id"/>
                                Voir détail du secteur
                            </s:a>
                        </div>
                    </div>
                </s:iterator>
            </s:iterator>
        </s:iterator>
    </s:if>
</div>

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>

</html>
