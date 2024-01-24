package test;


@WebServlet("/sendredirectlink")
public class RedirectionDemo1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.sendRedirect("https://www.facebook.com/");
	}
}
