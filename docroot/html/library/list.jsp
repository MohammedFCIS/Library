<%@include file="/html/library/init.jsp" %>
<h1> List of our Books</h1>
<%
	List<book> books = bookLocalServiceUtil.getbooks(0, -1);
%>
<table border="1" width="80%">
	<tr>
		<th>Title</th>
		<th>Author</th>
		<th>Created</th>
	</tr>
	<%
		for(book myBook : books){
			%>
	<tr>
		<td><%= myBook.getTitle() %></td>
		<td><%= myBook.getAuthor() %></td>
		<td><%= myBook.getCreateDate() %></td>
	</tr>
			<%
		}
	%>
</table>
<br/>
<a href='<portlet:renderURL/>'> &laquo Back</a>