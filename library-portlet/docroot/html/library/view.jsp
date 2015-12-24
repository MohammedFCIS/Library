<%@include file="/html/library/init.jsp" %>

<portlet:renderURL var="updateBookURL">
	<portlet:param name="jspPage" value="<%= LibraryConstants.PAGE_UPDATE %>"/>
</portlet:renderURL>
<br/>
<a href="<%= updateBookURL%>"> Add new Book &raquo;</a>
<br/><hr/>
<a href="javascript:void()" id="jQueryText"> JQuery in Action</a>
<div id="sayHello" style="display: none;"> JQuery is working</div>
<hr/>
<div id="tabs">
	<ul>
		<li><a href="#tabs-1"> Tab One</a></li>
		<li><a href="#tabs-2"> Tab Two</a></li>
		<li><a href="#tabs-3"> Tab Three</a></li>
	</ul>
	<div id="tabs-1"> Tabs 1 Contents</div>
	<div id="tabs-2"> Tabs 2 Contents</div>
	<div id="tabs-3"> Tabs 3 Contents</div>
</div>
<script type="text/javascript">
	$(document).ready(function(){
		$("#jQueryText").on('click', function(){
			$("#sayHello").toggle();
		})
	});
	$(function(){
		$("#tabs").tabs();
	})
</script>