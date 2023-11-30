package org.java.ee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie: cookies) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
            System.out.println(cookie.getMaxAge() );
        }

        Cookie cookie = new Cookie("testCookie", "abc");
//        cookie.setPath("/temp.html");
//        cookie.setDomain("my.localhost.com");
//        cookie.setSecure(true);
        cookie.setMaxAge(5);
        resp.addCookie(cookie);

    }

}
