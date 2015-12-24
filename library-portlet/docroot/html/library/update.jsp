<%@include file="/html/library/init.jsp" %>
<h1>Add/Edit Form</h1>
<%
	PortletURL updateBookURL = renderResponse.createActionURL();
	updateBookURL.setParameter(ActionRequest.ACTION_NAME, 
			LibraryConstants.ACTION_UPDATE_BOOK);
%>
<aui:form method="POST" name="fm" 
	action="<%= updateBookURL.toString()%>">
	<aui:input name="bookTitle" label="Book Title"/>
	<aui:input name="bookAuthor" label="Book Author"/>
	<aui:button type="submit" value="Save"/>
</aui:form>
<br/>
<a href="<portlet:renderURL/>">&laquo; Go Back</a>