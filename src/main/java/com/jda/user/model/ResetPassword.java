package com.jda.user.model;

public class ResetPassword {
private String username;
private String password;
private String newpassword;
private String resetToken;
public String setUserName()
{
	return username;
}
public void getUserName(String username)
{
	this.username=username;
}
public String setPassword()
{
	return password;
}
public void getPassword(String password){
	this.password=password;
}
public String setNewPassword()
{
	return newpassword;
}
public void getNewPassword(String newpassword)
{
	this.newpassword=newpassword;
}
public String getResetToken()
{
	return resetToken;
}
public void setResetToken(String resetToken)
{
	this.resetToken=resetToken;
}
}
