package com.Listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebsiteListeners implements HttpSessionListener{
	private static int sessionOfAction = 0;
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().getServletContext().log("Session was created!: " + ++sessionOfAction);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		event.getSession().getServletContext().log("Session was destroyed!: " + --sessionOfAction);
	}
}
