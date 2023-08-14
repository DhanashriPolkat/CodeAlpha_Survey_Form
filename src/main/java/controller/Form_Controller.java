package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Form_dao.Survey_Form_dao;
import form_bo.SurveyForm_bo;

/**
 * Servlet implementation class Form_Controller
 */
@WebServlet("/Form_Controller")
public class Form_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String rollno=request.getParameter("r");
		String name=request.getParameter("n");
		String mail=request.getParameter("e");
		String mob=request.getParameter("m");
		String city=request.getParameter("c");
		String course=request.getParameter("co");
		String gender=request.getParameter("g");
		String dob=request.getParameter("dob");
		String age=request.getParameter("age");
		
		
		SurveyForm_bo sb=new SurveyForm_bo(rollno,name,mail,mob,city,course,gender,dob,age);
		int status=Survey_Form_dao.insert(sb);
		
		if(status>0)
		{
			pw.print("Data inserted successfully");
			
			RequestDispatcher rd=request.getRequestDispatcher("Data_Handler");
			
			rd.include(request, response);
		}
		
		else
		{
			pw.print("Something went wrong please try again");
			
			RequestDispatcher rd=request.getRequestDispatcher("Form2.html");
			
			rd.include(request, response);
		}
	}

}
