<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.shout.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.shout.form.label.text" path="text"/>
	
	<acme:menu-suboption code="master.menu.anonymous.shout" action="/anonymous/shout/create"/>
	<acme:menu-suboption code="master.menu.anonymous.shoutlist" action="/anonymous/shout/list"/>
</acme:form>	