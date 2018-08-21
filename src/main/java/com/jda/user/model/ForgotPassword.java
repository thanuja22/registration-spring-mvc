package com.jda.user.model;

public class ForgotPassword {
private String username;
private String newpassword;

public String getUserName()
{
	return username;
}
public void setUserName(String username)
{
	this.username=username;
}
public String getNewPassword()
{
	return newpassword;
}
public void setNewPassword(String newpassword)
{
	this.newpassword=newpassword;
}
}
