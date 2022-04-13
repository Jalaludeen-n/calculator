package com.example.calculator;



import java.io.IOException;


import java.io.PrintWriter;


import javax.servlet.ServletException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

        out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>");
        double numberOne = Double.parseDouble(request.getParameter("numberOne"));
        double numberTwo = Double.parseDouble(request.getParameter("numberTwo"));
        double result =0;
        String opr=request.getParameter("opr");
        if(opr.equals("+")) result=numberOne+numberTwo;
        if(opr.equals("-")) result=numberOne-numberTwo;
        if(opr.equals("*")) result=numberOne*numberTwo;
        if(opr.equals("/")) result=numberOne/numberTwo;

        out.println("<h1> Result = "+result);
        out.println("</body></html>");

    }


}