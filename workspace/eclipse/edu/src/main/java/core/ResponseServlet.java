package core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/getHTML", "/getXML", "/getJSON", "/getImage" })
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String filename = "";
		String contentType = "";
		// uri.endsWith() : uri가 ()안에 있는 주소로 끝나면..
		if (uri.endsWith("getHTML")) {
			filename = getServletContext().getRealPath("/")+"/clientexam/sample.html";	
			contentType = "text/html; charset=utf-8";
		} else if (uri.endsWith("getXML")) {
			filename = getServletContext().getRealPath("/")+"/clientexam/sample.xml";	
			contentType = "text/xml; charset=utf-8";
		} else if (uri.endsWith("getJSON")) {
			filename = getServletContext().getRealPath("/")+"/clientexam/sample.json";	
			contentType = "text/json; charset=utf-8"; // spring에서는 "application/json"
		} else {
			filename = getServletContext().getRealPath("/")+"/images/trans_duke.png";	
			contentType = "image/png";
		}
		
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);
		response.setContentType(contentType);
		if(contentType.startsWith("image")) {
			byte[] content = new byte[(int)f.length()];
			// byte stream을 이용하기 위해서 getOutputStream()을 사용한다.
			ServletOutputStream sos = response.getOutputStream();
			fis.read(content);
			sos.write(content);			
			sos.close();
		} else {
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			PrintWriter out = response.getWriter();
			String line = null; 
			while((line = br.readLine()) != null) 
				out.println(line);
			out.close();
			br.close();
			isr.close();			
		}		
		fis.close();
	}
}
