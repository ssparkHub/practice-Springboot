package hello.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.security.Principal;

public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        resp.getWriter().println("Hello Servlet!");

        boolean authenticate = req.authenticate(resp);
        String authType = req.getAuthType();
        Principal userPrincipal = req.getUserPrincipal();

        resp.getWriter().println("authenticate : " + authenticate);
        resp.getWriter().println("authType : " + authType);
        resp.getWriter().println("userPrincipal : " + userPrincipal);

    }
}
