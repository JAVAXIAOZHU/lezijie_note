package comlezijie.note.web;

import comlezijie.note.po.User;
import comlezijie.note.service.NoteService;
import comlezijie.note.util.JsonUtil;
import comlezijie.note.vo.ResultInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {
    private NoteService noteService=new NoteService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置首页导航栏的高亮值
        request.setAttribute("menu_page","report");
        
        //得到用户行为
        String actionName=request.getParameter("actionName");
        
        //判断用户行为
        if ("info".equals(actionName)){
            //进入报表页面
            reportInfo(request,response);
        }else if("month".equals(actionName)){
            //通过月份查询对应的云记数量
            queryNoteCountByMonth(request,response);
        }
    }

    /**
     * 通过月份查询对应的云记数量
     * @param request
     * @param response
     */
    private void queryNoteCountByMonth(HttpServletRequest request, HttpServletResponse response) {
        //从session作用域中获取用户对象
        User user = (User) request.getSession().getAttribute("user");
        //调用service层的查询方法 返回resultInfo对象
        ResultInfo<Map<String,Object>> resultInfo=noteService.queryNoteCountByMonth(user.getUserId());
        //将ResultInfo对象转换成JSON格式的字符串 响应给Ajax的回调函数
        JsonUtil.toJson(response,resultInfo);
    }

    /**
     * 进入报表页面
     * @param request
     * @param response
     */
    private void reportInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置首页动态包含的页面值
        request.setAttribute("changePage","report/info.jsp");
        //请求转发跳转到index.jsp
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
