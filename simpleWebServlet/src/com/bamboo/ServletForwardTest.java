package com.bamboo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/test")
public class ServletForwardTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("hello,world,this is get,bamboo");
//        resp.sendRedirect("/simpleWebServlet_war_exploded/hello.jsp");
//        System.out.println(req);
        try {
            Connection conn = null;
            Context context = new InitialContext();
            DataSource dataSource = null;
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/UserPlatformDataSource");
            conn=dataSource.getConnection();
            System.out.println("conn="+conn);
            conn.close();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello,world,this is post,bamboo");
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req,resp);
        System.out.println(req);
    }
}
