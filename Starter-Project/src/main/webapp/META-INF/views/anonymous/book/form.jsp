<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.book.form.label.author" path="author"/>
	<acme:form-textbox code="anonymous.book.form.label.title" path="title"/>
	
	
	<acme:form-submit code="anonymous.book.form.button.create" action="/anonymous/book/create"/>
	<acme:form-return code="anonymous.book.form.button.return"/>

</acme:form>
