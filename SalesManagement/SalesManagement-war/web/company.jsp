<%-- 
    Document   : company
    Created on : 14.7.2010, 0:28:43
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
            <title>Company Detail</title>
        </head>
        <body>
            <h:form>
                <h1><h:outputText value="Company Details:"/></h1>
                <h:panelGrid columns="2">
                    <h:outputText value="Name"/>
                    <h:inputText value="#{sales.company.name}"/>

                    <h:outputText value="Description"/>
                    <h:inputText value="#{sales.company.description}"/>
                </h:panelGrid>
                <h:commandButton id="btnSave" action="#{sales.saveCompany}" value="Save"/>
            </h:form>
        </body>
    </html>
</f:view>
