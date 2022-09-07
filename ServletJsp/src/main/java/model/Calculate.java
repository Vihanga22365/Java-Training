package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calculate", value = "/Calculate")
public class Calculate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer="Please Check";
        int number1=Integer.parseInt(request.getParameter("number1"));
        int number2=Integer.parseInt(request.getParameter("number2"));
        String sign= request.getParameter("sign");

        System.out.println(sign);
       try {

           if (sign.equals("+")){

               answer=String.valueOf(number1+number2);
           }

           if(sign.equals("-")){
               answer=String.valueOf(number1-number2);

           }

           if(sign.equals("*")){
               answer=String.valueOf(number1*number2);

           }

           if(sign.equals("/")){
               answer=String.valueOf(number1/number2);

           }


       }catch (Exception e){
    	   answer="Exception Occured";

       }

       request.setAttribute("answer",answer);

      request.getRequestDispatcher("display.jsp").forward(request,response);



	}

}
