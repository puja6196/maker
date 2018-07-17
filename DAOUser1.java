package com.nucleus.Connection;

import java.util.List;

public interface DAOUser1
{
	public void newUser(UserInfo userInfo);
	public void view(UserInfo userInfo);
	public void delete(UserInfo userInfo);
	/*public void update(UserInfo userInfo);*/
	public List<UserInfo> viewAll();
	
}
