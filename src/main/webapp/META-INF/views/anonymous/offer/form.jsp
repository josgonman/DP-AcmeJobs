<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.offer.form.label.company" path="company"/>
	<acme:form-textbox code="anonymous.offer.form.label.job" path="job"/>
	<acme:form-textbox code="anonymous.offer.form.label.salary" path="salary"/>

	
	<acme:form-submit code="anonymous.offer.form.button.create" action="/anonymous/offer/create"/>
	<acme:form-return code="anonymous.offer.form.button.return"/>
</acme:form>	