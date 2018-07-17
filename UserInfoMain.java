
       
	package com.nucleus.controller;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Arrays;
	import java.util.List;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


import com.nucleus.Connection.DAOImplUser;
import com.nucleus.Connection.DAOUser1;
import com.nucleus.Connection.UserInfo;



	@WebServlet("/CS")
	public class UserInfoMain extends HttpServlet 
	{   
		
		private static final long serialVersionUID = 1L;
		
		
		protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{   DAOUser1 daoUser1=new DAOImplUser();
	     	UserInfo userInfo=new UserInfo();
	     	
			PrintWriter out=response.getWriter();
			out.println("book deleted");
			String usercode=request.getParameter("usercode");		
			userInfo.setUserCode(usercode);
			daoUser1.delete( userInfo);
			
			
			
			
		}
		protected void doview(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{   PrintWriter out=response.getWriter();
		
			
		UserInfo userInfo=new UserInfo();	
		DAOUser1 daoUser1=new DAOImplUser();
			
			String usercode=request.getParameter("usercode");
			userInfo.setUserCode(usercode);
			 daoUser1.view( userInfo);
			out.println(userInfo.getUserCode());
			out.println(userInfo.getUserName());
			out.println(userInfo.getUserAddress1());
			out.println(userInfo.getUserAddress2());
			out.println(userInfo.getUserPinCode() );
			out.println(userInfo.getUserCode());
			out.println(userInfo.getUserEmailAddress());
			out.println(userInfo. getPrimaryContactPerson() );
			out.println(userInfo.getRecordStatus());
			out.println(userInfo.getFlag());
			out.println(userInfo. getCreateDate());
			out.println(userInfo.getCreatedBy());
			out.println(userInfo. getModifiedDate() );
			out.println(userInfo.getModifiedBy());
			
			
			
			
		}

		protected void doNewEntry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{  
			
			UserInfo userInfo=new UserInfo();	
			PrintWriter out=response.getWriter();
			DAOUser1 daoUser1=new DAOImplUser();
			String usercode=request.getParameter("usercode");
		    String username=request.getParameter("username");
		    String useraddress1=request.getParameter("useraddress1");	    
		    String useraddress2=request.getParameter("useraddress2");
		    String userpincode=request.getParameter("userpincode");
		    String useremailadd=request.getParameter("useremailadd");
		    String usercontactno=request.getParameter("usercontactno");
		    String primarycontactperson=request.getParameter("primarycontactperson");	    
		    String recordstatus=request.getParameter("recordstatus");
		    String flag=request.getParameter("flag"); 
		    String createdate=request.getParameter("createdate");
		    String createdby=request.getParameter("createdby");	    
		    String modifieddate=request.getParameter("modifieddate");
		    String modifiedby=request.getParameter("modifiedby");
		    
		    
		    
		    userInfo.setUserCode(usercode);
			userInfo.setUserName(username);
			userInfo.setUserAddress1(useraddress1);
			userInfo.setUserAddress2(useraddress2);
			userInfo.setUserPinCode(userpincode) ;
			userInfo.setUserEmailAddress(useremailadd);
			userInfo.setUserContactNo(usercontactno);
			userInfo.setPrimaryContactPerson( primarycontactperson);
			userInfo.setRecordStatus(recordstatus);
			userInfo.setFlag(flag);
			userInfo.setCreateDate(createdate);
			userInfo.setCreatedBy(createdby);
			userInfo.setModifiedDate(modifieddate);
			userInfo.setModifiedBy(modifiedby);
			
			
			
		    
		    
			daoUser1.newUser(userInfo);
		    
	        out.println("new book entry");
		
		}
		protected void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
		}

		protected void doviewall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{  
			
			PrintWriter out=response.getWriter();
			
			UserInfo userInfo=new UserInfo();	
			DAOUser1 daoUser1=new DAOImplUser();
			List<UserInfo> list=daoUser1.viewAll();
			
			for(UserInfo NE:list)
			{
				
				out.println("NewEntry"+NE.toString());
				
			}
			
			
		}
	   

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{   PrintWriter out=response.getWriter();
		  
			if(request.getParameter("NEW") != null)
			   {     
				response.sendRedirect("NEW.jsp");	
			   }		         
		       if(request.getParameter("Save")!=null)
			      {		
			        doNewEntry(request,response);
			      }
		    if(request.getParameter("VIEW") != null)
		       {
		    	response.sendRedirect("VIEW.jsp");	
		       }
		       if(request.getParameter("VIEW")!=null)
		       {
			    	response.sendRedirect("view.jsp");	
			   }
		       
		       if(request.getParameter("submit")!=null)
			      {		
			       doview(request,response);		       
			      }
		       if(request.getParameter("viewall")!=null)
		       {
			    	response.sendRedirect("view2.html");	
			   }
		       
		       if(request.getParameter("viewallinfo")!=null)
			      {		
			       doviewall(request,response);		       
			      }
		       
		    if(request.getParameter("UPDATE") != null)
		       {
		    	response.sendRedirect("update.html");	
		       }
		       if(request.getParameter("Save")!=null)
			      {		
			       doUpdate(request,response);		       
			      }
		    if(request.getParameter("DELETEBOOK") != null)
		       {
		    	response.sendRedirect("delete.html");	
		       }
		       if(request.getParameter("delete")!=null)
			      {		
		    	   doDelete(request,response);		       
			      }
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
		}

	}
