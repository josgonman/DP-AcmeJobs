<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.shout.form.label.player" path="player"/>
	<acme:form-textbox code="anonymous.shout.form.label.team" path="team"/>
	<acme:form-textbox code="anonymous.shout.form.label.teamLastSeason" path="teamLastSeason"/>
	<acme:form-textarea code="anonymous.shout.form.label.quote" path="quote"/>
	
	<acme:form-submit code="anonymous.shout.form.button.create" action="/anonymous/shout/create"/>
	<acme:form-return code="anonymous.shout.form.button.return"/>
</acme:form>	