package com.plm.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author penglimei
 */

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取前端参数
        String method = req.getParameter("method");
        String addStr = "add";
        String delStr = "delete";
        if(addStr.equals(method)) {
            req.getSession().setAttribute("msg","add function run");
        } else if(delStr.equals(method)) {
            req.getSession().setAttribute("msg","delete function run");
        }

        // 调取业务层

        // 试图转发或重定向
        req.getRequestDispatcher("/WEB-INF/jsp/helloTest.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
