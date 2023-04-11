package core.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String memo = req.getParameter("memo");
		
		LocalDate date = LocalDate.now();
		int yy = date.getYear();
		int MM = date.getMonthValue();
		int dd = date.getDayOfMonth();
		
		out.print("<h2>" + name + "님이 " + yy + "년 " + MM + "월 " + dd + "일에 남긴 글입니다.</h2>");
		out.print("<hr>");
		out.print("<h3>" + memo + "</h3>");
		out.print("<a href='"+req.getHeader("referer")+"'>입력화면으로 가기</a>");
		out.close();
	}

}
