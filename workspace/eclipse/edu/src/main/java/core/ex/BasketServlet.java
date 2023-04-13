package core.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

@WebServlet("/basket")
public class BasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		String productId = req.getParameter("productId");
		JSONObject json = new JSONObject();
		
		if (session.isNew()) {
			session.setAttribute("selectedProducts", new int[10]);
		}
		
		if(productId == null) {
			session.invalidate();
			json.put("msg", "상품이 모두 삭제되었습니다.");
			out.write(json.toString());
			json.clear();
			out.close();
			return;
		} else {
		int[] cnt = (int[]) session.getAttribute("selectedProducts");
		
		int no = Integer.parseInt(productId.substring(1, productId.length()));
		cnt[no-1]++;
		
		for (int i = 0; i < cnt.length; i++) {
			
			json.put(String.format("p%03d", i+1) , cnt[i]);
		}
		
		String data = json.toString();
		out.write(data);
		out.close();
		}
		
		
	}

}
