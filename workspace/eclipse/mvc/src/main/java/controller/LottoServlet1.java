package controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.TimeVO;
@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int no1 = Integer.parseInt(req.getParameter("no"));
		int hour = LocalDateTime.now().getHour();
		int minute = LocalDateTime.now().getMinute();
		
		RequestDispatcher rd = null;
		TimeVO timeVO = new TimeVO();
		
		timeVO.setHour(hour);
		timeVO.setMinute(minute);
		
		req.setAttribute("timeVO", timeVO);
		
		int no2 = (int)(Math.random()*6)+1;
			System.out.println("전달된 값 : " + no1 + "추출된 값 : " + no2);
			
		if(no1 == no2) {
			rd = req.getRequestDispatcher("/jspexam/success.jsp");
		} else {
			rd = req.getRequestDispatcher("/jspexam/fail.jsp");
		}
		rd.forward(req, resp);
		}
	
}


