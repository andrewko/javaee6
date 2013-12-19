package javaee6.client.controller;

import java.io.IOException;

import javaee6.server.ejb.timer.TimerBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/schedule")
public class ScheduleServlet extends HttpServlet {

	@EJB
	private TimerBean timerBean;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String param = req.getParameter("cancel");
		if ("true".equals(param)) {
			timerBean.stopAllTimers();
		}
		else {
			timerBean.schedule();
		}
	}
}
