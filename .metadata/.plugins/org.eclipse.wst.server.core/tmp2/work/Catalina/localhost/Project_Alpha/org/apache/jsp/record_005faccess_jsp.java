/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2017-08-29 15:45:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class record_005faccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"text/html; charset=ISO-8859-1\" http-equiv=\"Content-Type\">\r\n");
      out.write("<title>Records</title>\r\n");
      out.write("<link rel=\"icon\" href=\"images/records.png\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function alert_exception(){\r\n");
      out.write("\talert(\"Database Connection Unsuccessful\\nCheck Your XAMPP Connection and Try Again\");\r\n");
      out.write("\twindow.history.back();\r\n");
      out.write("}\r\n");
      out.write("function fnExcelReport()\r\n");
      out.write("{\r\n");
      out.write("\tvar save_file=confirm(\"Press OK to save this table as Excel Spreadsheet(.xls)\");\r\n");
      out.write("\tif(save_file==true){\r\n");
      out.write("      var tab_text=\"<table border='2px'>\";\r\n");
      out.write("      var textRange; \r\n");
      out.write("      var j=0;\r\n");
      out.write("      tab = document.getElementById('table_search');\r\n");
      out.write("\r\n");
      out.write("      for(j = 0 ; j < tab.rows.length ; j++) \r\n");
      out.write("      {     \r\n");
      out.write("            tab_text=tab_text+tab.rows[j].innerHTML+\"</tr>\";\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      tab_text=tab_text+\"</table>\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      var ua = window.navigator.userAgent;\r\n");
      out.write("      var msie = ua.indexOf(\"MSIE \"); \r\n");
      out.write("\r\n");
      out.write("      if (msie > 0 || !!navigator.userAgent.match(/Trident.*rv\\:11\\./))      // If Internet Explorer\r\n");
      out.write("      {\r\n");
      out.write("         txtArea1.document.open(\"txt/html\",\"replace\");\r\n");
      out.write("         txtArea1.document.write(tab_text);\r\n");
      out.write("         txtArea1.document.close();\r\n");
      out.write("         txtArea1.focus(); \r\n");
      out.write("         sa=txtArea1.document.execCommand(\"SaveAs\",true,\"Global View Task.xls\");\r\n");
      out.write("      }  \r\n");
      out.write("      else\r\n");
      out.write("      \tsa = window.open('data:application/vnd.ms-excel,' + encodeURIComponent(tab_text));  \r\n");
      out.write("      \treturn (sa);\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\talert(\"You Pressed Cancel\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write(".title {\r\n");
      out.write("\tmargin: 1px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tfont-family: \"Yu Gothic UI Light\";\r\n");
      out.write("\tfont-weight: 700;\r\n");
      out.write("\tfont-style: normal;\r\n");
      out.write("\ttext-transform: none;\r\n");
      out.write("\tfont-variant: small-caps;\r\n");
      out.write("\tline-height: normal;\r\n");
      out.write("\tbackground-color: #333;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tborder-radius:20px;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\tbackground-image:/images/background_1.jpg;\r\n");
      out.write("\tpadding-bottom:42px;\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write("margin-left:20px;\r\n");
      out.write("padding-left:20px;\r\n");
      out.write("}\r\n");
      out.write(".search_results{\r\n");
      out.write("background-color:#333;\r\n");
      out.write("text-align:center;\r\n");
      out.write("height:50px;\r\n");
      out.write("border-radius:20px;\r\n");
      out.write("vertical-align:middle;\r\n");
      out.write("box-shadow:1px 3px 2px #e24a4a;\r\n");
      out.write("}\r\n");
      out.write(".search_results h2{\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".container{\r\n");
      out.write("background-color:#333333;\r\n");
      out.write("font-family:Yu Gothic UI Light;\r\n");
      out.write("color:white;\r\n");
      out.write("text-align:center;\r\n");
      out.write("height:300px;\r\n");
      out.write("font-size:19px;\r\n");
      out.write("font-weight:500;\r\n");
      out.write("border-radius:20px;\r\n");
      out.write("box-shadow:1px 3px 2px #e24a4a;\r\n");
      out.write("}\r\n");
      out.write("table{\r\n");
      out.write("\tbackground:#333;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tfont-family:\"Yu Gothic UI Light\";\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tborder-radius:10px;\r\n");
      out.write("\tmargin-left:3px;\r\n");
      out.write("\tmargin-right:3px;\r\n");
      out.write("\tbox-shadow:1px 3px 2px #e24a4a;\r\n");
      out.write("\tanimation: animatezoom 0.8s;\r\n");
      out.write("\tmargin-bottom:23px;\r\n");
      out.write("}\r\n");
      out.write("table tr{\r\n");
      out.write("\theight:40px;\r\n");
      out.write("\tpadding-top:5px;\r\n");
      out.write("}\r\n");
      out.write("table th:hover{\r\n");
      out.write("\tbackground-color:white;\r\n");
      out.write("\tcolor:#333;\r\n");
      out.write("\tfont-weight:bolder;\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table th{\r\n");
      out.write("\twidth:16%;\r\n");
      out.write("\tborder-left: 1px solid;\r\n");
      out.write("\tborder-right: 1px solid; \r\n");
      out.write("\tborder-bottom:1px solid ;\r\n");
      out.write("\tborder-color:white;\r\n");
      out.write("\tborder-radius:5px;\r\n");
      out.write("\tfont-size:19px;\r\n");
      out.write("\tbox-shadow:1px 3px 2px #e24a4a;\r\n");
      out.write("}\r\n");
      out.write("table td{\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tborder-left: 1px solid;\r\n");
      out.write("\tborder-right: 1px solid;\r\n");
      out.write("\tborder-bottom:1px solid;\r\n");
      out.write("\tborder-color:white;\r\n");
      out.write("\tborder-radius:5px;\r\n");
      out.write("\theight:60px;\r\n");
      out.write("\tfont-weight:550;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button{\r\n");
      out.write("height:50px;\r\n");
      out.write("text-align:center;\r\n");
      out.write("border-radius:20px;\r\n");
      out.write("width:100%;\r\n");
      out.write("font-family:Yu Gothic UI Light;\r\n");
      out.write("color:white;\r\n");
      out.write("font-size:18px;\r\n");
      out.write("background-color:#333;\r\n");
      out.write("}\r\n");
      out.write("button:hover{\r\n");
      out.write("font-size:20px;\r\n");
      out.write("cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write(".export_button{\r\n");
      out.write("box-shadow:1px 3px 2px #e24a4a;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".bottom_fix{\r\n");
      out.write("\tmin-width:100%; /* Set a default minimum width */\r\n");
      out.write("    margin-left: -50%; /* Divide value of min-width by 2 */\r\n");
      out.write("    background-color: #333; /* Black background color */\r\n");
      out.write("    color: #fff; /* White text color */\r\n");
      out.write("    text-align: left; /* Centered text */\r\n");
      out.write("    border-radius: 2px; /* Rounded borders */\r\n");
      out.write("    font-family:\"Yu Gothic UI Light\";\r\n");
      out.write("    position: fixed; /* Sit on top of the screen */\r\n");
      out.write("    z-index: 1; /* Add a z-index if needed */\r\n");
      out.write("    left: 50%; /* Center the snackbar */\r\n");
      out.write("    bottom: 0px; /* 30px from the bottom */\r\n");
      out.write("    height:40px;\r\n");
      out.write("    padding:15px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"title\">\r\n");
      out.write("<h1 align=\"center\">ALPHA LIBRARY APPLICATION</h1>\r\n");
      out.write("<div class=\"search_results\">\r\n");
      out.write("<h2>Library Day-to-Day Records</h2>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"table_results\">\r\n");
      out.write("<p></p>\r\n");
      out.write("<button class=\"export_button\" id=\"btnExport\" onclick=\"fnExcelReport();\">EXPORT AS SPREADSHEET(.xls)</button>\r\n");
      out.write("<p></p>\r\n");
      out.write("<p></p>\r\n");
      out.write("<table class=\"search\" id=\"table_search\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>TYPE</th>\r\n");
      out.write("<th>BOOK ID</th>\r\n");
      out.write("<th>STUDENT ID</th>\r\n");
      out.write("<th>DATE</th>\r\n");
      out.write("<th>FINE</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
Object s=request.getParameter("id");
String s1=s.toString();
String url = "jdbc:mysql://localhost:3306/"; 
String dbName = "Project Alpha"; 
String driver = "com.mysql.jdbc.Driver"; 
String user = "root";  
String password = ""; 
Statement pstmt;
String sql="";

try { 
        Class.forName(driver).newInstance(); 
        Connection conn = DriverManager.getConnection(url+dbName, user, password);
		String q="SELECT * FROM `records` WHERE `rdate`>=?";
		PreparedStatement ps=conn.prepareStatement(q);
		ps.setString(1,s1);
		ResultSet rs=ps.executeQuery();
		String f1,f2,f3,f4,f5,f6,f7;
		int sum=0;
        
        while(rs.next()) 
        {
        	
            f1=rs.getString(2);
			f2=rs.getString(3);
			f3=rs.getString(4);
			f4=rs.getString(5);
			f5=rs.getString(6);
			if(f5.equals("0")){
				f7="-";
			}
			else{
				f7=f5;
			}
			if(f2.equals("0")) f6="ISSUE";
			else if(f2.equals("1")) f6="RETURN";
			else f6="RENEWAL";
			
			
      out.write("\r\n");
      out.write("\t\t<tr><td>");
      out.print(f6);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(f1 );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(f3 );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(f4 );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(f7 );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

				sum+=Integer.parseInt(f5);
        } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bottom_fix\">\r\n");
      out.write("<h2>Total Fine Collected : &#8377;");
      out.print(sum );
      out.write("</h2>\r\n");
 
   
}
catch(SQLException e){
	
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\talert_exception();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

} 

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
 out.close(); 
      out.write('\r');
      out.write('\n');
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
