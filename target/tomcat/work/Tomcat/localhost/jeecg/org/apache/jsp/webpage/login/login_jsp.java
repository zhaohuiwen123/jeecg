/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-02-16 12:40:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jeecgframework.core.util.SysThemesUtil;
import org.jeecgframework.core.enums.SysThemesEnum;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tld/easyui.tld", Long.valueOf(1542624170000L));
    _jspx_dependants.put("/context/mytags.jsp", Long.valueOf(1542624170000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fid_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fid_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fid_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\n');

  session.setAttribute("lang","zh-cn");
  SysThemesEnum sysTheme = SysThemesUtil.getSysTheme(request);
  String lhgdialogTheme = SysThemesUtil.getLhgdialogTheme(sysTheme);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <title>");
      if (_jspx_meth_t_005fmutiLang_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("   <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("  <!-- bootstrap & fontawesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/bootstrap.css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/font-awesome.css\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/accordion/css/accordion.css\">\n");
      out.write("  <!-- text fonts -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-fonts.css\" />\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/jquery-ui.css\" />\n");
      out.write("  <!-- ace styles -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\n");
      out.write("  <!--[if lte IE 9]>\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-part2.css\" class=\"ace-main-stylesheet\" />\n");
      out.write("  <![endif]-->\n");
      out.write("\n");
      out.write("  <!--[if lte IE 9]>\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-ie.css\" />\n");
      out.write("  <![endif]-->\n");
      out.write("  <!-- ace settings handler -->\n");
      out.write("  <script src=\"plug-in/ace/js/ace-extra.js\"></script>\n");
      out.write("\n");
      out.write("  <!--[if lte IE 8]>\n");
      out.write("  <script src=\"plug-in/ace/js/html5shiv.js\"></script>\n");
      out.write("  <script src=\"plug-in/ace/js/respond.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-layout light-login\">\n");
      out.write("<div class=\"main-container\">\n");
      out.write("  <div class=\"main-content\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("          <div class=\"center\">\n");
      out.write("            <h1 id=\"id-text2\" class=\"grey\">\n");
      out.write("              <i class=\"ace-icon fa fa-leaf green\"></i>\n");
      out.write("                                            净水系统\n");
      out.write("            </h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"space-6\"></div>\n");
      out.write("          <div class=\"position-relative\">\n");
      out.write("            <div id=\"login-box\" class=\"login-box visible widget-box no-border\">\n");
      out.write("              <div class=\"widget-body\">\n");
      out.write("                <form id=\"loinForm\" class=\"form-horizontal\"    method=\"post\">\n");
      out.write("                <!-- 单点登录参数 -->\n");
      out.write("                <input type=\"hidden\" id=\"ReturnURL\"  name=\"ReturnURL\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ReturnURL }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("                <div class=\"widget-main\">\n");
      out.write("                 <div class=\"alert alert-warning alert-dismissible\" role=\"alert\" id=\"errMsgContiner\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t\t  <div id=\"showErrMsg\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                  <h4 class=\"header blue lighter bigger\">\n");
      out.write("                    <i class=\"ace-icon fa fa-coffee green\"></i>\n");
      out.write("                \t    用户登录\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"space-6\"></div>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\"  name=\"userName\" iscookie=\"true\" class=\"form-control\" placeholder=\"请输入用户名\"  id=\"userName\" value=\"admin\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"请输入密码\" id=\"password\" value=\"123456\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <input type=\"text\" style=\"width:150px\" name=\"randCode\" class=\"form-control\" placeholder=\"请输入验证码\"  id=\"randCode\"/>\n");
      out.write("                          <span class=\"input-group-addon\" style=\"padding: 0px;\"><img id=\"randCodeImage\" src=\"randCodeImage\"  /></span>\n");
      out.write("                        </div>\n");
      out.write("                      </label>\n");
      out.write("                      <div class=\"space\"></div>\n");
      out.write("                      <div class=\"clearfix\">\n");
      out.write("                        <label class=\"inline\">\n");
      out.write("                          <input type=\"checkbox\" class=\"ace\" id=\"on_off\"  name=\"remember\" value=\"yes\"/>\n");
      out.write("                          <span class=\"lbl\">记住用户名</span>\n");
      out.write("                        </label>\n");
      out.write("                       \n");
      out.write("                        <button type=\"button\" id=\"but_login\"  onclick=\"checkUser()\" class=\"width-35 pull-right btn btn-sm btn-primary\">\n");
      out.write("                          <i class=\"ace-icon fa fa-key\"></i>\n");
      out.write("                          <span class=\"bigger-110\" >登录</span>\n");
      out.write("                        </button>\n");
      out.write("                        <!-- <a href=\"loginController.do?goResetPwdMail\" class=\"btn btn-link\">忘记密码 ?</a> -->\n");
      out.write("                        \n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"space-4\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"toolbar clearfix\">\n");
      out.write("                  <div style=\"float: right\">\n");
      out.write("                    <a href=\"#\"  class=\"forgot-password-link\">\n");
      out.write("                    \t  语言\n");
      out.write("                      <i class=\"ace-icon fa fa-arrow-right\"></i>\n");
      out.write("                      ");
      if (_jspx_meth_t_005fdictSelect_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"center\"><h4 class=\"blue\" id=\"id-company-text\"></h4></div>\n");
      out.write("            <div class=\"navbar-fixed-top align-right\">\n");
      out.write("              <br />\n");
      out.write("              &nbsp;\n");
      out.write("              <a id=\"btn-login-dark\" class=\"blue\" href=\"#\" onclick=\"darkStyle()\">Dark</a>\n");
      out.write("              &nbsp;\n");
      out.write("              <span class=\"blue\">/</span>\n");
      out.write("              &nbsp;\n");
      out.write("              <a id=\"btn-login-blur\" class=\"blue\" href=\"#\" onclick=\"blurStyle()\">Blur</a>\n");
      out.write("              &nbsp;\n");
      out.write("              <span class=\"blue\">/</span>\n");
      out.write("              &nbsp;\n");
      out.write("              <a id=\"btn-login-light\" class=\"blue\" href=\"#\" onclick=\"lightStyle()\">Light</a>\n");
      out.write("              &nbsp; &nbsp; &nbsp;\n");
      out.write("            </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery.cookie.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutiLang/en.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutiLang/zh-cn.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/jquery.tipsy.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/iphone.check.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"webpage/login/login-ace.js\"></script>\n");
      out.print(lhgdialogTheme );
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\toptErrMsg();\n");
      out.write("\t});\n");
      out.write("\t$(\"#errMsgContiner\").hide();\n");
      out.write("\n");
      out.write("   //输入验证码，回车登录\n");
      out.write("  $(document).bind('keyup', function(event) {\n");
      out.write("\t　　if (event.keyCode == \"13\") {\n");
      out.write("\t　　　　$('#but_login').click();\n");
      out.write("\t　　}\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  //验证用户信息\n");
      out.write("  function checkUser(){\n");
      out.write("    if(!validForm()){\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    newLogin();\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /**\n");
      out.write("   * 刷新验证码\n");
      out.write("   */\n");
      out.write("  $('#randCodeImage').click(function(){\n");
      out.write("\t    reloadRandCodeImage();\n");
      out.write("  });\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var _hmt = _hmt || [];\n");
      out.write("(function() {\n");
      out.write("  var hm = document.createElement(\"script\");\n");
      out.write("  hm.src = \"https://hm.baidu.com/hm.js?098e6e84ab585bf0c2e6853604192b8b\";\n");
      out.write("  var s = document.getElementsByTagName(\"script\")[0]; \n");
      out.write("  s.parentNode.insertBefore(hm, s);\n");
      out.write("})();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fmutiLang_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_005fmutiLang_005f0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_005fmutiLang_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fmutiLang_005f0.setParent(null);
    // /webpage/login/login.jsp(14,9) name = langKey type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fmutiLang_005f0.setLangKey("jeect.platform");
    int _jspx_eval_t_005fmutiLang_005f0 = _jspx_th_t_005fmutiLang_005f0.doStartTag();
    if (_jspx_th_t_005fmutiLang_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fmutiLang_0026_005flangKey_005fnobody.reuse(_jspx_th_t_005fmutiLang_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fid_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent(null);
    // /webpage/login/login.jsp(112,22) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setId("langCode");
    // /webpage/login/login.jsp(112,22) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("langCode");
    // /webpage/login/login.jsp(112,22) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("lang");
    // /webpage/login/login.jsp(112,22) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/login/login.jsp(112,22) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setExtendJson("{style:'padding:2px; width:80px;'}");
    // /webpage/login/login.jsp(112,22) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal("zh-cn");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fid_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fid_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }
}
