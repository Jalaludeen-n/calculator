package com.example.calculator;



import java.io.IOException;


import java.io.PrintWriter;


import javax.servlet.ServletException;


import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;


public class CalculatorServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            double n1 = 0;
        request.setAttribute("name", n1);
        request.getRequestDispatcher("calculator.jsp").forward(request, response);

        n1 = Double.parseDouble(request.getParameter("txtN1"));


//        double n2 = Double.parseDouble(request.getParameter("txtN2"));
//        double result =0;
//        String opr=request.getParameter("opr");
//        if(opr.equals("+")) result=n1+n2;
//        if(opr.equals("-")) result=n1-n2;
//        if(opr.equals("*")) result=n1*n2;
//        if(opr.equals("/")) result=n1/n2;


    }

}