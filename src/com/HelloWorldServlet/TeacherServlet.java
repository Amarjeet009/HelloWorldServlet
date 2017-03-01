package com.HelloWorldServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherServlet
 */
@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());*/
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		
		 //1.set content type
		response.setContentType("text/html");
		//2.get the printwriter
				PrintWriter out= response.getWriter();
		//3.generate the html content
	   out.println("<html><body>");
	   
	   out.println("The student is confirmed : "
			       +request.getParameter("fname")+ " "
			       +request.getParameter("lname")+" "
			       +request.getParameter("mobile")+" "
			       +request.getParameter("email") );
	   
	   
	   
	   out.println("</body></html>");
	}

}
