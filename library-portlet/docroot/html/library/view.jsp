<%@include file="/html/library/init.jsp" %>

<portlet:renderURL var="updateBookURL">
	<portlet:param name="jspPage" value="<%= LibraryConstants.PAGE_UPDATE %>"/>
</portlet:renderURL>
<br/>
<a href="<%= updateBookURL%>"> Add new Book &raquo;</a>
<br/><hr/>
<a href="javascript:void()" id="jQueryText"> JQuery in Action</a>
<div id="sayHello" style="display: none;"> JQuery is working</div>
<script type="text/javascript">
	$(document).ready(function(){
		$("#jQueryText").on('click', function(){
			$("#sayHello").toggle();
		})
	})
</script>