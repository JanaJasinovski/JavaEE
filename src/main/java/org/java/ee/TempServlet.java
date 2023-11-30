package org.java.ee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String one = req.getParameter("one");
//        String two = req.getParameter("two");
//        System.out.println(one);
//        String[] ones = req.getParameterValues("one");
//        for (String s: ones) {
//            System.out.println(s);
//        }

//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()) {
//            String element = parameterNames.nextElement();
//            System.out.println(element + " = " + req.getParameter(element));
//        }
//
//        Map<String, String[]> parameterMap = req.getParameterMap();

        System.out.println(req.getRequestURL());
        System.out.println(req.getServletPath());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getRequestURI());
        System.out.println(req.getLocalPort());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
