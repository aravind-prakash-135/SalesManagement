<%-- 
    Document   : newjsp
    Created on : 13.7.2010, 21:51:42
    Author     : fajfr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Companies List</title>
        </head>
        <body>
            <h:form>
                <h1><h:outputText value="Companies List"/></h1>
                <h:dataTable value="#{sales.companiesModel}" var="item">
                    <h:column>
                        <f:facet name="header"><h:outputText value="Name"/></f:facet>
                        <h:outputText value="#{item.name}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header"><h:outputText value="Description"/></f:facet>
                        <h:outputText value="#{item.description}"/>
                    </h:column>
                    <h:column>
                        <h:commandButton id="btnEdit" action="#{sales.editCompany}" value="Edit"/>
                    </h:column>
                </h:dataTable>
                <h:commandButton id="btnNew" action="#{sales.newCompany}" value="New"/>
            </h:form>
        </body>
    </html>
</f:view>
