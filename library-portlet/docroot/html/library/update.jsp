<%@include file="/html/library/init.jsp" %>
<h1>Add/Edit Form</h1>
<%
	PortletURL updateBookURL = renderResponse.createActionURL();
	updateBookURL.setParameter(ActionRequest.ACTION_NAME, "updateBook");
%>
<form name="<portlet:namespace/>fm" method="post" 
	action="<%= updateBookURL.toString()%>">
	Book Title:<input type="text" name="<portlet:namespace/>bookTitle"/>
	<br/>
	Book Author:<input type="text" name="<portlet:namespace/>bookAuthor"/>
	<br/>
	<input type="submit" value="Save"/>
</form>
<br/>
<a href="<portlet:renderURL/>">&laquo; Go Back</a>