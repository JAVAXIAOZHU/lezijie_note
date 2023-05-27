/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-07 13:40:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<div class=\"col-md-9\">\n");
      out.write("    <div class=\"data_list\">\n");
      out.write("        <div class=\"data_list_title\"><span class=\"glyphicon glyphicon-signal\"></span>&nbsp;数据报表 </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\" style=\"padding-top: 20px;\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div id=\"monthChart\" style=\"height: 500px\"></div>\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <h3 align=\"center\">用户地区分布图</h3>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div id=\"baiduMap\" style=\"height: 600px;width: 100%;\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"statics/echarts/echarts.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"https://api.map.baidu.com/api?v=2.0&&type=webgl&ak=5goCmt6CpetLhAudcAqzGc5vr3SoN6ss\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * 通过月份查询对应的云记数量\n");
      out.write("     */\n");
      out.write("    $.ajax({\n");
      out.write("        type:\"get\",\n");
      out.write("        url:\"report\",\n");
      out.write("        data:{\n");
      out.write("            actionName:\"month\"\n");
      out.write("        },\n");
      out.write("        success:function (result) {\n");
      out.write("            console.log(result);\n");
      out.write("            if (result.code == 1) {\n");
      out.write("                // 得到月份 （得到X轴的数据）\n");
      out.write("                var monthArray = result.result.monthArray;\n");
      out.write("                // 得到月份对应的云记数量 （得到Y轴的数据）\n");
      out.write("                var dataArray = result.result.dataArray;\n");
      out.write("                // 加载柱状图\n");
      out.write("                loadMonthChart(monthArray, dataArray);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * 加载柱状图\n");
      out.write("     * monthArray月份表示的数组\n");
      out.write("     * dataArray 数据表示的数组\n");
      out.write("     */\n");
      out.write("    function loadMonthChart(monthArray, dataArray) {\n");
      out.write("        // 基于准备好的dom，初始化echarts实例\n");
      out.write("        var myChart = echarts.init(document.getElementById('monthChart'));\n");
      out.write("\n");
      out.write("        // 指定图表的配置项和数据\n");
      out.write("        // X轴显示名称\n");
      out.write("        var dataAxis = monthArray;\n");
      out.write("        // Y轴的数据\n");
      out.write("        var data = dataArray;\n");
      out.write("        var yMax = 30;\n");
      out.write("        var dataShadow = [];\n");
      out.write("\n");
      out.write("        for (var i = 0; i < data.length; i++) {\n");
      out.write("            dataShadow.push(yMax);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var option = {\n");
      out.write("            // 标题\n");
      out.write("            title: {\n");
      out.write("                text: '按月统计', // 主标题\n");
      out.write("                subtext: '通过月份查询对应的云记数量', // 副标题\n");
      out.write("                left:'center' // 标题对齐方式，center表示居中\n");
      out.write("            },\n");
      out.write("            // 提示框\n");
      out.write("            tooltip:{},\n");
      out.write("            /*legend:{\n");
      out.write("                data:['月份'],\n");
      out.write("            },*/\n");
      out.write("            // X轴\n");
      out.write("            xAxis: {\n");
      out.write("                data: dataAxis,\n");
      out.write("                axisTick: {\n");
      out.write("                    show: false\n");
      out.write("                },\n");
      out.write("                axisLine: {\n");
      out.write("                    show: false\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            // Y轴\n");
      out.write("            yAxis: {\n");
      out.write("                axisLine: {\n");
      out.write("                    show: false\n");
      out.write("                },\n");
      out.write("                axisTick: {\n");
      out.write("                    show: false\n");
      out.write("                },\n");
      out.write("                axisLabel: {\n");
      out.write("                    textStyle: {\n");
      out.write("                        color: '#999'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            dataZoom: [\n");
      out.write("                {\n");
      out.write("                    type: 'inside'\n");
      out.write("                }\n");
      out.write("            ],\n");
      out.write("            // 系列\n");
      out.write("            series: [\n");
      out.write("                { // For shadow\n");
      out.write("                    type: 'bar', // 柱状图\n");
      out.write("                    data: data, // Y轴的数据\n");
      out.write("                    itemStyle: {\n");
      out.write("                        color: 'rgba(0,0,0,0.05)'\n");
      out.write("                    },\n");
      out.write("                    barGap: '-100%',\n");
      out.write("                    barCategoryGap: '40%',\n");
      out.write("                    data: dataShadow,\n");
      out.write("                    animation: false\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    type: 'bar',\n");
      out.write("                    data: data, // Y轴的数据\n");
      out.write("                    // name:'月份',\n");
      out.write("                    itemStyle: {\n");
      out.write("                        color: new echarts.graphic.LinearGradient(\n");
      out.write("                            0, 0, 0, 1,\n");
      out.write("                            [\n");
      out.write("                                {offset: 0, color: '#83bff6'},\n");
      out.write("                                {offset: 0.5, color: '#188df0'},\n");
      out.write("                                {offset: 1, color: '#188df0'}\n");
      out.write("                            ]\n");
      out.write("                        )\n");
      out.write("                    },\n");
      out.write("                    emphasis: {\n");
      out.write("                        itemStyle: {\n");
      out.write("                            color: new echarts.graphic.LinearGradient(\n");
      out.write("                                0, 0, 0, 1,\n");
      out.write("                                [\n");
      out.write("                                    {offset: 0, color: '#2378f7'},\n");
      out.write("                                    {offset: 0.7, color: '#2378f7'},\n");
      out.write("                                    {offset: 1, color: '#83bff6'}\n");
      out.write("                                ]\n");
      out.write("                            )\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            ]\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        // 使用刚指定的配置项和数据显示图表。\n");
      out.write("        myChart.setOption(option);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * 通过用户发布的坐标查询\n");
      out.write("     */\n");
      out.write("    $.ajax({\n");
      out.write("        type:\"get\",\n");
      out.write("        url:\"report\",\n");
      out.write("        data:{\n");
      out.write("            actionName:\"location\"\n");
      out.write("        },\n");
      out.write("        success:function (result){\n");
      out.write("            console.log(result);\n");
      out.write("            if (result.code == 1) {\n");
      out.write("                // 加载百度地图\n");
      out.write("                loadBaiduMap(result.result)\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * 加载百度地图\n");
      out.write("     */\n");
      out.write("    function loadBaiduMap(markers) {\n");
      out.write("        // 加载地图实例\n");
      out.write("        var map = new BMapGL.Map(\"baiduMap\");\n");
      out.write("        // 设置地图的中心点\n");
      out.write("        var point = new BMapGL.Point(116.404, 39.915);\n");
      out.write("        // 地图初始化，BMapGL.Map.centerAndZoom()方法要求设置中心点坐标和地图级别\n");
      out.write("        map.centerAndZoom(point, 10);\n");
      out.write("        // 开启鼠标滚轮缩放\n");
      out.write("        map.enableScrollWheelZoom(true);\n");
      out.write("        // 添加比例尺控件\n");
      out.write("        var zoomCtrl = new BMapGL.ZoomControl();\n");
      out.write("        map.addControl(zoomCtrl);\n");
      out.write("\n");
      out.write("        // 判断是否有点标记\n");
      out.write("        if (markers != null && markers.length > 0) { // 集合中第一个坐标时用户当前所在位置，其他的事云记记录中的对应的经纬度\n");
      out.write("            // 将用户所在的位置设置为中心点\n");
      out.write("            map.centerAndZoom(new BMapGL.Point(markers[0].lon, markers[0].lat), 10);\n");
      out.write("            // 循环在地图上添加点标记\n");
      out.write("            for (var i = 1; i < markers.length; i++) {\n");
      out.write("                // 创建点标记\n");
      out.write("                var marker = new BMapGL.Marker(new BMapGL.Point(markers[i].lon, markers[i].lat));\n");
      out.write("                // 在地图上添加点标记\n");
      out.write("                map.addOverlay(marker);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
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
}
