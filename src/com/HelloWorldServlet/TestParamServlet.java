package com.HelloWorldServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */
@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());*/

     
		         //1.set content type
		
				response.setContentType("text/html");
				
				//2.get the printwriter
				
						PrintWriter out= response.getWriter(); 
						
				//3.read the param configuration
					
						ServletContext context=getServletContext();//inherit from HttpSevlet
					    
						String  project =context.getInitParameter("MyWorld");
						String projectDev=context.getInitParameter("Project-Developer");
						
				//4.generate the html content
						
			   out.println("<html><body>");
			   
			   out.println("Project Name  :"+ project);
			   
			   out.println("<br/></br/>");
			   
			   out.println("Project Developer :"+ projectDev);
			   
			   
			   
			   out.println("</body></html>");
	
	
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
