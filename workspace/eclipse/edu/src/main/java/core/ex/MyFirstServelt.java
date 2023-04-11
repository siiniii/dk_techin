package core.ex;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myfirst")
public class MyFirstServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		String name = req.getParameter("name");
        if (name == null) {
            name = "GUEST";
        }
        
        LocalDate date = LocalDate.now();
        String day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
        
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<h2>" + name + " 님 반가워요.. 오늘은 " + day + "입니다!! </h2>");
		
	}

}
