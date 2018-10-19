<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 19/10/2018
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

    <h2>Bienvenue sur l'application de référencement de sites d'escalade !</h2>

    <div>
        <label for="moteur_de_recherche"></label>
            <select name="moteur_de_recherche" id="moteur_de_recherche">
                <option value="region">En construction</option>
            </select>
    </div>

    <div>
        <p><button><s:a action="site_list">Liste des sites</s:a></button></p>
        <p><button><s:a action="topo_list">Litste des topos</s:a></button></p>
    </div>

