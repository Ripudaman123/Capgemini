package com.cg.MyServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServelet")
public class MyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServelet() {
  
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		System.out.println("Hello Servelet");
//		PrintWriter out=response.getWriter();
//		String name= request.getParameter("firstName");
//		out.print("<h1> Hello "+name+"</h1>");
		
		Resume resume=new Resume();
		
		resume.setFirstName(request.getParameter("firstName"));
		resume.setLastName(request.getParameter("lastName"));
		resume.setGender(request.getParameter("gender"));
		resume.setHighestQualification(request.getParameter("hq"));
		resume.setDob(request.getParameter("dob"));
		resume.setAddress(request.getParameter("address"));
		resume.setSkills(request.getParameterValues("skills"));
		resume.setWebsite(request.getParameter("firstName"));
		resume.setSummary(request.getParameter("summary"));
		
		request.setAttribute("ResumeObj", resume);
		RequestDispatcher rd=request.getRequestDispatcher("ResumeDisplay.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
