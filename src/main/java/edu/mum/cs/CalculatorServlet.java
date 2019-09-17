package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String num3 = req.getParameter("num3");
        String num4 = req.getParameter("num4");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        int res = Integer.valueOf(num1) + Integer.valueOf(num2);
        int res2 = Integer.valueOf(num3) * Integer.valueOf(num4);

        out.println("<input type='text' value="+num1+"> + ");
        out.println("<input type='text' value="+num2+"> = ");
        out.println("<input type='text' value="+res+"><br>");

        out.println("<input type='text' value="+num3+"> + ");
        out.println("<input type='text' value="+num4+"> = ");
        out.println("<input type='text' value="+res2+"><br>");

        out.println("<input type='submit' value='Submit'>");
    }
}
