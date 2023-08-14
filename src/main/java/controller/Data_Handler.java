package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Form_dao.Survey_Form_dao;
import form_bo.SurveyForm_bo;

/**
 * Servlet implementation class Data_Handler
 */
@WebServlet("/Data_Handler")
public class Data_Handler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Data_Handler() {
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
		   
		   
		   pw.print("<body style=\"background-color: rgb(229 208 217 / 18%); backdrop-filter: blur(1px);\">");
		   pw.print("<centre><div style=\"border: solid 2px; background-color: #2dcaf912;color: #c7b0e3; height: fit-content;width: fit-content;margin-left: 250px;margin-top: 100px;border-radius: 20px;padding: 20px;\">");
		   
		   pw.print("<table border='1px' width='100%'> ");
		    
		    pw.print("<tr> <th> Roll No. </th> <th> Name </th> <th> Email </th> <th> Mobile No </th> <th> City </th> <th> Course </th><th>Gender</th><th>Date of Birth</th><th>Age</th> </tr>");
		    
		    List <SurveyForm_bo> list=Survey_Form_dao.getData();
		    for(SurveyForm_bo eb:list)
		    {
		    	pw.print("<tr><td>"+eb.getRollNo()+"</td><td>"+eb.getName()+"</td><td>"+eb.getEmail()+"</td><td>"+eb.getMobNo()+"</td><td>"+eb.getCity()+"</td><td>"+eb.getCourse()+"</td><td>"+eb.getGender()+"</td><td>"+eb.getDob()+"</td><td>"+eb.getAge()+"</td></tr>"); 
		    }
		    
		    pw.print("</table>");
		   
		    
		   
		   
	}

}
