
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.offer.list.label.moment" path="moment" width="20%"/>
	<acme:list-column code="anonymous.offer.list.label.company" path="company" width="20%"/>
	<acme:list-column code="anonymous.offer.list.label.job" path="job" width="40%"/>
	<acme:list-column code="anonymous.offer.list.label.salary" path="salary" width="20%"/>
</acme:list>	
	