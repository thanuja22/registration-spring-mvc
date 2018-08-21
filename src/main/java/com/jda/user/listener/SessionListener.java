package com.jda.user.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener 
{
	int session = 1;
	int c = 0;
	int d = 0;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("session created : :" + se.getSession().getId());
		session++;
		c++;
		System.out.println("no.of active sessions :" + session);
		System.out.println("number of sessions created :" + c);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("session destroyed : :" + se.getSession().getId());
		session--;
		d++;
		System.out.println("no.of active sessions :" + session);
		System.out.println("number of sessions destroyed :" + d);
	}

}
