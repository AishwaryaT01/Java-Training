

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userName=request.getParameter("userId");
		out.print("Welcome "+userName);
		
		HttpSession session=request.getSession();
		session.setAttribute("uname", userName);
		
		out.print("<a href='Servlet2'>vist</a>");
		out.close();
	}catch(Exception excp){
		
	}
	}
}
