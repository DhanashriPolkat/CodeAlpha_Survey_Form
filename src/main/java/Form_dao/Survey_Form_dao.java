package Form_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import form_bo.SurveyForm_bo;

public class Survey_Form_dao {
	
	public static Connection connect()
	{
		Connection cn=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/survey_form";
			String un="root";
			String pss="Pass@123";
			
			cn=DriverManager.getConnection(url, un, pss);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return cn;
	}
	
	public static int insert(SurveyForm_bo sb)
	{
		int status=0;
		
		try 
		{
			Connection cn=Survey_Form_dao.connect();
			
			String query="insert into student_survey (rollNo,name,email,mobileNo,city,course,gender,date_of_birth,age) values(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps=cn.prepareStatement(query);
			
			ps.setString(1, sb.getRollNo() );
			ps.setString(2, sb.getName());
			ps.setString(3, sb.getEmail());
			ps.setString(4, sb.getMobNo());
			ps.setString(5, sb.getCity());
			ps.setString(6, sb.getCourse());
			ps.setString(7, sb.getGender());
			ps.setString(8, sb.getDob());
			ps.setString(9, sb.getAge());
			
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		return status;
	}
	
	public static List getData( ) {
		   
        List<SurveyForm_bo> list= new ArrayList<SurveyForm_bo>();
  try {
	    Connection con=Survey_Form_dao.connect();
        PreparedStatement ps=con.prepareStatement("select * from student_survey");
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()) {
        	SurveyForm_bo eb=new SurveyForm_bo();
        	
        	eb.setRollNo(rs.getString(1));
        	eb.setName(rs.getString(2));
        	eb.setEmail(rs.getString(3));
        	eb.setMobNo(rs.getString(4));
        	eb.setCity(rs.getString(5));
        	eb.setCourse(rs.getString(6));
        	eb.setGender(rs.getString(7));
        	eb.setDob(rs.getString(8));
        	eb.setAge(rs.getString(9));
        	
        	
            list.add(eb);
        	
        }
	  
} catch (Exception e) {
	System.out.println(e);
}
   
   return list;
   
}

}
