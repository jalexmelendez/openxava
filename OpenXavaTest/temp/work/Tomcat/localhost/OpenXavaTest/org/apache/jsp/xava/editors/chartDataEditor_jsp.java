/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-09-13 07:53:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections;
import org.openxava.tab.Tab;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.openxava.model.MapFacade;
import org.openxava.model.meta.MetaProperty;
import org.openxava.session.Chart;
import org.openxava.session.ChartColumn;
import org.openxava.util.Is;
import org.openxava.web.Charts;
import org.openxava.util.XavaException;
import org.openxava.web.WebEditors;
import org.apache.commons.lang3.StringUtils;

public final class chartDataEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


private Map[] getLoadChunk(Tab tab) {
	Collection allKeys = new ArrayList();
	int end = tab.getTableModel().getRowCount() > tab.getTableModel().getChunkSize() ? 
			tab.getTableModel().getChunkSize() : tab.getTableModel().getRowCount();  
	for (int i = 0; i < end; i++) { 					
		try {
			allKeys.add(tab.getTableModel().getObjectAt(i)); 				
		}
		catch (Exception ex) {
			allKeys.add(Collections.EMPTY_MAP);
		}
	}
	Map [] keys = new Map[allKeys.size()];
	allKeys.toArray(keys);
	return keys;
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1568360618195L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1568360617836L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1568360618195L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.web.Charts");
    _jspx_imports_classes.add("org.apache.commons.beanutils.PropertyUtils");
    _jspx_imports_classes.add("org.openxava.util.XavaException");
    _jspx_imports_classes.add("org.openxava.session.Chart");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("org.openxava.session.ChartColumn");
    _jspx_imports_classes.add("org.apache.commons.lang3.StringUtils");
    _jspx_imports_classes.add("org.openxava.util.Is");
    _jspx_imports_classes.add("java.lang.reflect.InvocationTargetException");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.openxava.tab.Tab");
    _jspx_imports_classes.add("org.openxava.web.WebEditors");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("org.openxava.model.MapFacade");
    _jspx_imports_classes.add("org.apache.commons.lang.ArrayUtils");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("  \n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
org.openxava.tab.Tab tab = (org.openxava.tab.Tab) context.get(request, "xava_chartTab");  
tab.setRequest(request); 
String chartObject = request.getParameter("chartObject");
chartObject = (chartObject == null || chartObject.equals(""))?"xava_chart":chartObject;
Chart chart = (Chart) context.get(request, chartObject);
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
String [] chartData = fvalue.split(Charts.CHART_DATA_SEPARATOR); 
String chartTypeName = chartData[0];
Chart.ChartType chartType = Chart.ChartType.valueOf(chartData[1]);
boolean labelColumnIsNumber = "true".equalsIgnoreCase(chartData[2]);
String labelColumnLabel = chartData[3];
String applicationName = request.getParameter("application");
String module = request.getParameter("module");
String idPrefix = org.openxava.web.Ids.decorate(request, "xava_chart__");

      out.write("\n");
      out.write("<input type=\"hidden\" id=\"xava_application\" value=\"");
      out.print(applicationName);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" id=\"xava_module\" value=\"");
      out.print(module);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name='");
      if (_jspx_meth_xava_005fid_005f0(_jspx_page_context))
        return;
      out.write("' value=\"");
      out.print(fvalue);
      out.write("\" />\n");

// Let's read the data
org.openxava.tab.impl.IXTableModel model = tab.getTableModel();
Map[] selectedKeys = tab.getSelectedKeys();
if (selectedKeys == null || selectedKeys.length == 0) {
	selectedKeys = getLoadChunk(tab);	// when the list has a lot of records tab.getAllKeys() do not finnish
}
java.util.List<Integer> selected = new java.util.ArrayList<Integer>(); 
int end = model.getRowCount();

for (int i = 0; i < end; i++){
	Map key = (Map)model.getObjectAt(i);
	for (Map selectedKey : selectedKeys) {
		if (selectedKey.equals(key)) { 
			selected.add(i);
			break;
		}
	}
}
int[] selectedRows = ArrayUtils.toPrimitive(selected.toArray(new Integer[selected.size()]));
SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd");
// select datasets and create titles
int columnCount = 0;
List<ChartColumn> selectedColumns = new ArrayList<ChartColumn>();
for (int index = 0; index < chart.getColumns().size(); index++) {
	ChartColumn column = chart.getColumns().get(index);
	if (!column.isNumber()) {
		continue;
	}
	selectedColumns.add(column);
	String id = idPrefix + "dataset_" + columnCount++ + "_title";
	
      out.write("\n");
      out.write("\t<input type=\"hidden\" id='");
      out.print(id);
      out.write("' value=\"");
      out.print(column.getLabel());
      out.write("\" />\n");

}

      out.write("\n");
      out.write("<input type=\"hidden\" id='");
      out.print(idPrefix + "columnCount");
      out.write("' value=\"");
      out.print(selectedColumns.size());
      out.write("\" />\n");

if (!Is.emptyString(chart.getxColumn())) {

      out.write("\n");
      out.write("\t<input type=\"hidden\" id='");
      out.print(idPrefix + "rowCount");
      out.write("' value=\"");
      out.print(selectedRows.length);
      out.write("\" />\n");

	Class labelColumnType = null;
		
	for (int rowIndex = 0; rowIndex < selectedRows.length; rowIndex++) {
		String id = idPrefix + "title_" + rowIndex;
		int row = selectedRows[rowIndex];
		Object labelColumnObject;
		MetaProperty xColumnProperty = tab.getMetaProperty(chart.getxColumn());		
		int xColumnIndex = tab.getMetaProperties().indexOf(xColumnProperty);
		String labelColumnValue = WebEditors.format(request, xColumnProperty, model.getValueAt(row, xColumnIndex), errors, view.getViewName(), true);
		labelColumnValue = StringUtils.abbreviate(labelColumnValue, 40);

      out.write("\n");
      out.write("\t\t<input type=\"hidden\" id=\"");
      out.print(id);
      out.write("\" value=\"");
      out.print(labelColumnValue);
      out.write("\" />\n");

		int columnIndex = 0;
		// Process the columns
		for (int index = 0; index < selectedColumns.size(); index++) {
			ChartColumn column = selectedColumns.get(index);
			Object value = null;
			String datasetValueIdPrefix = idPrefix + "dataset_" + (columnIndex++) + "_value_";					
			MetaProperty property= tab.getMetaProperty(column.getName());
			int propertyIndex = tab.getMetaProperties().indexOf(property);
			value = model.getValueAt(row, propertyIndex); 
			if (value == null) {
				value = "";
			}
		
      out.write("\n");
      out.write("\t\t\t<input type=\"hidden\" id='");
      out.print(datasetValueIdPrefix + rowIndex );
      out.write("' name=\"");
      out.print(datasetValueIdPrefix);
      out.write("\"\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(value.toString());
      out.write("\" />\n");
      out.write("\t\t");
			
		}
	}
}

      out.write("\n");
      out.write("<input type=\"hidden\" id='");
      out.print(idPrefix + "type" );
      out.write("' value=\"");
      out.print(chartTypeName );
      out.write("\" />\n");
      out.write("<input type=\"hidden\" id='");
      out.print(propertyKey);
      out.write("' value=\"");
      out.print(fvalue);
      out.write("\" />\n");
      out.write("\n");
      out.write("<div class=\"");
      out.print(style.getChartData());
      out.write("\">\n");
      out.write("\t<div class=\"ct-chart ct-perfect-fourth\" id='");
      out.print(idPrefix + "container" );
      out.write("' style=\"");
      out.print(style.getChartsDataStyle());
      out.write("\">\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
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

  private boolean _jspx_meth_xava_005fid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    boolean _jspx_th_xava_005fid_005f0_reused = false;
    try {
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/editors/chartDataEditor.jsp(72,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fid_005f0.setName("chartData");
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      _jspx_th_xava_005fid_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f0_reused);
    }
    return false;
  }
}
