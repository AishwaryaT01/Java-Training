

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		try{
			String userName=request.getParameter("userId");
			String passWord=request.getParameter("passWord");
			if(passWord.equals("admin")){
				rd=request.getRequestDispatcher("ServletTwo");
				rd.forward(request, response);
			}
			else{
				out.println("<font color='red'><b>You have entered invalid password");
				rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}finally{
			out.close();
		}
	}

}
