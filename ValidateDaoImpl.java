package com.nucleus.ValidateDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.nucleus.Connection.ConnectionSetup;
import com.nucleus.Login.LoginUser;






public  class ValidateDaoImpl implements ValidateDao
{
	ConnectionSetup connectionSetup=new  ConnectionSetup();
    Connection con= connectionSetup.getConnection();	
    LoginUser loginUser=new LoginUser();
    
   
	
	public void viewdetails(LoginUser loginUser)
	{
	  PreparedStatement pstmt=null;
		try {
			 pstmt = con.prepareStatement("select * from table78 where username=?,password=?");
			
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{
			loginUser.setUsername(rs.getString(1));
			loginUser.setPassword(rs.getString(2) );
						
			} 
	         
		}
		catch (SQLException e) 
		{
         
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				connectionSetup.closeConnection(); 
				pstmt.close();
			} catch (SQLException e) 
			{

				e.printStackTrace();
			}	
	
      }
	
		
}



	
	}

