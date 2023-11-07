import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String uname=req.getParameter("val1");
		String pw=req.getParameter("val2");
		
		
		out.println("User Details Page:");
		out.println("Hello "+uname);
		out.println("Your Password is:** "+pw+"**");
		out.close();
	}
}
