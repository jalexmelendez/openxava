/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-09-13 07:52:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.KeyAndDescription;
import org.openxava.util.Is;
import org.openxava.util.XavaResources;
import org.openxava.model.meta.MetaProperty;
import org.openxava.calculators.DescriptionsCalculator;
import org.openxava.formatters.IFormatter;
import org.openxava.filters.IFilter;
import org.openxava.filters.IRequestFilter;
import org.openxava.mapping.PropertyMapping;
import org.openxava.converters.IConverter;
import org.openxava.session.MyReport;
import org.openxava.util.Labels;

public final class myReportNameEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.calculators.DescriptionsCalculator");
    _jspx_imports_classes.add("org.openxava.formatters.IFormatter");
    _jspx_imports_classes.add("org.openxava.filters.IRequestFilter");
    _jspx_imports_classes.add("org.openxava.session.MyReport");
    _jspx_imports_classes.add("org.openxava.util.Labels");
    _jspx_imports_classes.add("org.openxava.util.XavaResources");
    _jspx_imports_classes.add("org.openxava.mapping.PropertyMapping");
    _jspx_imports_classes.add("org.openxava.filters.IFilter");
    _jspx_imports_classes.add("org.openxava.util.KeyAndDescription");
    _jspx_imports_classes.add("org.openxava.converters.IConverter");
    _jspx_imports_classes.add("org.openxava.util.Is");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
String propertyKey = request.getParameter("propertyKey");
String script = request.getParameter("script");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String title = (p == null)?"":p.getDescription(request);
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
boolean editable = "true".equals(request.getParameter("editable"));
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel() || "true".equalsIgnoreCase(request.getParameter("readOnlyAsLabel"));
org.openxava.session.MyReport report = (org.openxava.session.MyReport) view.getModel();

String[] sharedDescriptions = report.getAllNamesSharedUser();
String[] currentUserDescription = report.getAllNamesCurrentUser();
String suffix = Labels.get("sharedReportSuffix");
if (!editable) {

      out.write("\r\n");
      out.write("<select id=\"");
      out.print(propertyKey);
      out.write("\" name=\"");
      out.print(propertyKey);
      out.write("\" tabindex=\"1\" class=");
      out.print(style.getEditor());
      out.write(' ');
      out.print(script);
      out.write(" title=\"");
      out.print(title);
      out.write("\">\t\r\n");
	
	// current user
	for (int i=0; i<currentUserDescription.length; i++) {
		String selected = "";
		String description = currentUserDescription[i];
		if (Is.equalAsStringIgnoreCase(fvalue, description)) {
			selected = "selected"; 
		} 		
	
      out.write("\r\n");
      out.write("\t\t<option value=\"");
      out.print(description);
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(description);
      out.write("</option>\r\n");
      out.write("\t");

	}
	
	// shared reports
	for (int i=0; i<sharedDescriptions.length; i++){
		String selected = "";
		String description = sharedDescriptions[i];
		String descriptionKey = description + MyReport.SHARED_REPORT;
		if (Is.equalAsStringIgnoreCase(fvalue, descriptionKey)) {
			selected = "selected"; 
		}
	
      out.write("\r\n");
      out.write("\t\t<option value=\"");
      out.print(descriptionKey);
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(description);
      out.write(' ');
      out.print(suffix);
      out.write("</option>\r\n");
      out.write("\t");

	} 

      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("__DESCRIPTION__\" value=\"");
      out.print(fvalue);
      out.write("\">\r\n");
 
} else {

      out.write('	');
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "textEditor.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("script", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("", request.getCharacterEncoding()), out, false);
      out.write(' ');
      out.write('\r');
      out.write('\n');
 
} 

      out.write("\t\t\t\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
