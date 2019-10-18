
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

	<acme:form-textbox code="anonymous.talk.form.label.employer" path="employer"/>
	<acme:form-textarea code="anonymous.talk.form.label.age" path="age"/>
	
	<acme:form-submit code="anonymous.talk.form.button.create" action="/anonymous/talk/create"/>
	<acme:form-return code="anonymous.talk.form.button.return"/>
	
	
		

</acme:form>