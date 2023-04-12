package core.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=utf-8");
		req.setCharacterEncoding("utf-8");
		RequestDispatcher rd = req.getRequestDispatcher("first.html");

		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String pw = req.getParameter("pw");
		String room = req.getParameter("room");
		String aRequest[] = req.getParameterValues("aRequest");

		String date = req.getParameter("date");
		LocalDate lDate = LocalDate.parse(date);
		String yMd = lDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));

		if (name.isEmpty()) {
			rd.forward(req, resp);
			return;
		}
		if (pw.isEmpty()) {
			resp.sendRedirect("http://www.daum.net/");
			return;
		}
		out.print("<h1>" + name + "님의 예약내용</h1><hr>");
		out.print("<ul>");
		out.print("<li> 룸 : " + room + "</li>");
		if (aRequest != null && aRequest.length != 0) {
			String result = String.join(", ", aRequest);
			out.print("<li> 추가 요청 사항 : " + result + "</li>");
		} else {
			out.print("<li> 추가 요청 사항 : 없음</li>");
		}
		out.print("<li> 예약날짜 : " + yMd + "</li>");
		out.print("</ul><br>");
		out.print("<a href='" + req.getHeader("referer") + "'>예약입력화면으로</a>");
		out.close();
	}

}

