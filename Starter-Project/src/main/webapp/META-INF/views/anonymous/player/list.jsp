
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.player.list.label.player" path="player" width="25%"/>
	<acme:list-column code="anonymous.player.list.label.team" path="team" width="25%"/>
	<acme:list-column code="anonymous.player.list.label.teamLastSeason" path="teamLastSeason" width="25%"/>
	<acme:list-column code="anonymous.player.list.label.quote" path="quote" width="25%"/>
</acme:list>	
	