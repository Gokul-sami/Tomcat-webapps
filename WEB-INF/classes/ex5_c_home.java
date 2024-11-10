import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/setSessionData")
public class ex5_c_home extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve or set your session data
        HttpSession session = request.getSession();
        session.setAttribute("username", "JohnDoe");

        // Forward the request to the JSP page
        request.getRequestDispatcher("ex5_v_home.jsp").forward(request, response);
    }
}
