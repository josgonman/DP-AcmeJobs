
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">

	<acme:list-column code="anonymous.talk.list.label.moment" path="moment" width="20%"/>
	<acme:list-column code="anonymous.talk.list.label.employer" path="employer" width="20%"/>
	<acme:list-column code="anonymous.talk.list.label.age" path="age" width="60%"/>

</acme:list>