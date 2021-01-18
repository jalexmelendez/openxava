<%@ page import="org.openxava.model.meta.MetaProperty" %>

<jsp:useBean id="style" class="org.openxava.web.style.Style" scope="request"/>
  
<%
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
String align = p.isNumber()?"right":"left";
boolean editable="true".equals(request.getParameter("editable"));
String disabled=editable?"":"disabled";
String script = request.getParameter("script");
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel();
String browser = request.getHeader("user-agent");
int sizeIncrement = browser.contains("Chrome")?0:2; 
if (editable || !label) {
%>
<%-- tmp
<span class="<%=style.getDateCalendar()%>">
<input type="text" name="<%=propertyKey%>" id="<%=propertyKey%>" class=<%=style.getEditor()%> title="<%=p.getDescription(request)%>"
	tabindex="1" 
	align='<%=align%>'
	maxlength="<%=p.getSize()%>" 
	size="<%=p.getSize() + sizeIncrement%>" 	 
	value="<%=fvalue%>" <%=disabled%> <%=script%>><%if (editable) {%><a style="position: relative; right: 25px;" href="javascript:showCalendar('<%=propertyKey%>', '<%=org.openxava.util.Dates.dateFormatForJSCalendar(org.openxava.util.Locales.getCurrent())%>')"><i class="mdi mdi-calendar"></i></a><%} %>	
--%>
<%-- tmp ini --%>
<script src="https://npmcdn.com/flatpickr/dist/l10n/ru.js"></script>
<%-- tmp --%>
<span class="xava_date <%=style.getDateCalendar()%>" data-date-format="<%=org.openxava.util.Dates.dateFormatForJSCalendar(org.openxava.util.Locales.getCurrent())%>">
<input type="text" name="<%=propertyKey%>" id="<%=propertyKey%>" class="<%=style.getEditor()%>" title="<%=p.getDescription(request)%>"
	tabindex="1" 
	align='<%=align%>'
	maxlength="<%=p.getSize()%>"
	data-input
	size="<%=p.getSize() + sizeIncrement%>" 
	value="<%=fvalue%>" <%=disabled%> <%=script%>><%if (editable) {%><a href="javascript:void(0)" data-toggle style="position: relative; right: 25px;"><i class="mdi mdi-calendar"></i></a><%} %>	
<%-- tmp
<input id="kk" type="hidden" data-input style="width: 0">
--%>	
<%-- tmp
<div class="flatpickr xava_date">
    <input type="text" placeholder="Select Date.." data-input> <!-- input is mandatory -->

    <a class="input-button" title="toggle" data-toggle>
        <i class="mdi mdi-calendar"></i>
    </a>

    <a class="input-button" title="clear" data-clear>
        <i class="icon-close"></i>
    </a>
</div>
--%>

<%-- tmp fin --%>
</span> 
<%
} else {
%>
<%=fvalue%>&nbsp;	
<%
}
%>
<% if (!editable) { %>
	<input type="hidden" name="<%=propertyKey%>" value="<%=fvalue%>">
<% } %>			
