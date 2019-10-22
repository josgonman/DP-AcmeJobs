<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.player.form.label.player" path="player"/>
	<acme:form-textbox code="anonymous.player.form.label.team" path="team"/>
	<acme:form-textbox code="anonymous.player.form.label.teamLastSeason" path="teamLastSeason"/>
	<acme:form-textarea code="anonymous.player.form.label.quote" path="quote"/>
	
	<acme:form-submit code="anonymous.player.form.button.create" action="/anonymous/player/create"/>
	<acme:form-return code="anonymous.player.form.button.return"/>
</acme:form>	