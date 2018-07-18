package com.nucleus.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOImplUser implements DAOUser1
{
	  
		
		
		ConnectionSetup connectionSetup=new  ConnectionSetup();
	    Connection con= connectionSetup.getConnection();	

		
		public void newUser(UserInfo userInfo)
		{  
			
			  PreparedStatement pstmt=null;
				try {
					 pstmt = con.prepareStatement("insert into pujabook3 values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
					 pstmt.setLong(1,userInfo.getUserCode());
					 pstmt.setString(2,userInfo.getUserName());
					 pstmt.setString(3,userInfo.getUserAddress1());
					 pstmt.setString(4,userInfo.getUserAddress2());
					 pstmt.setLong(5,userInfo.getUserPinCode());
					 pstmt.setString(6,userInfo.getUserEmailAddress());
					 pstmt.setString(7,userInfo.getPrimaryContactPerson());
					 pstmt.setString(8,userInfo.getRecordStatus());
					 pstmt.setString(9,userInfo.getFlag());
					 pstmt.setString(10,userInfo.getCreateDate());
					 pstmt.setString(11,userInfo.getCreatedBy());
					 pstmt.setString(12,userInfo.getModifiedDate());
					 pstmt.setString(13,userInfo.getModifiedBy());
					
					 pstmt.executeUpdate();
			        
				}
				catch (SQLException e) 
				{
		           
					e.printStackTrace();
				}
				finally
				{
					try {
						connectionSetup.closeConnection(); 
						pstmt.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
					
		
			
		}

	}
		public void delete(UserInfo userInfo)
		{   System.out.println("deleteeeee");
			 PreparedStatement pstmt=null;
				try {
					 pstmt = con.prepareStatement("delete from pujabook3 where  BookId=?");
					 pstmt.setLong(1,userInfo.getUserCode());
					 pstmt.executeUpdate();
			        
				}
				catch (SQLException e) 
				{
		           
					e.printStackTrace();
				}
				finally
				{
					try {
						connectionSetup.closeConnection(); 
						pstmt.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
					
		
			
		}
			
		}
		
	/*	public void update(UserInfo userInfo) 
		{
			PreparedStatement pstmt=null;
			try {
				 pstmt = con.prepareStatement("update table pujabook3 where bookid=?" );
				 pstmt.setString(1,newEntry.getBookId());
				 pstmt.setString(2,newEntry.getBookName() );
				 pstmt.setString(3,newEntry.getAuthor());
				 pstmt.setString(4,newEntry.getBook() );
				 pstmt.setString(5,newEntry.getPrice() );
				 pstmt.executeUpdate();
				 
				 
			}
			catch (SQLException e) 
			{
	           
				e.printStackTrace();
			}
			finally
			{
				try {
					connectionSetup.closeConnection(); 
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				

		
	}*/
		
			
		
	
		public void view(UserInfo userInfo)
		{  System.out.println("read book");

			  PreparedStatement pstmt=null;
				try {
					 pstmt = con.prepareStatement("select * from pujabook3 where bookid=?");
					 pstmt.setLong(1,userInfo.getUserCode());
					ResultSet rs= pstmt.executeQuery();
					while(rs.next())
					{
						userInfo.setUserCode(rs.getLong(1));
						userInfo.setUserName(rs.getString(2) );
						userInfo.setUserAddress1(rs.getString(3));
						userInfo.setUserAddress2(rs.getString(4) );
						userInfo.setUserPinCode(rs.getLong(5) );	
						userInfo.setUserEmailAddress(rs.getString(6) );
						userInfo.setPrimaryContactPerson(rs.getString(7));
						userInfo.setRecordStatus(rs.getString(8) );
						userInfo.setFlag(rs.getString(9) );	
						userInfo.setCreateDate(rs.getString(10) );
						userInfo.setCreatedBy(rs.getString(11));
						userInfo.setModifiedDate(rs.getString(12) );
						userInfo.setModifiedBy(rs.getString(13) );	
						
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
		/*@Override
		public List<UserInfo> viewall() 
		{  
			List<UserInfo> list=new ArrayList<>();
			 PreparedStatement pstmt=null;
				try {
					 
					 pstmt = con.prepareStatement("select * from pujabook3 ");				
					 ResultSet rs= pstmt.executeQuery();
					while(rs.next())
					{
					UserInfo userInfo=new UserInfo();
					userInfo.setBookId(rs.getString(1));
					userInfo.setBookName(rs.getString(2) );
					userInfo.setAuthor(rs.getString(3));
					userInfo.setBook(rs.getString(4) );
					userInfo.setPrice(rs.getString(5) );		
					 list.add(userInfo);
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
				return list;
			
		}
	}
}*/
}
