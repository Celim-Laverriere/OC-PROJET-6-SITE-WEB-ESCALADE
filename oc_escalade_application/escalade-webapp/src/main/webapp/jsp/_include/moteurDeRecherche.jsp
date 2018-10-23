<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 20/10/2018
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<s:form action="moteur_de_recherche">
        <nav>
              <s:select name="regionSelect" label="region"
                        list="regionList"
                        emptyOption="true"
                        requiredLabel="true"/>
              <s:submit value="Validez" />
        </nav>
</s:form>




