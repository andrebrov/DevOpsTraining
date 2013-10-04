package com.scrumtrek.devops;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 * User: andrebrov
 * Date: 04.10.13
 * Time: 10:25
 */
public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello "+ InetAddress.getLocalHost());
    }
}

