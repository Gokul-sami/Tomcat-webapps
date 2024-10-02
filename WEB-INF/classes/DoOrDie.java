import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deathWish")
public class DoOrDie extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Retrieve parameters from the form submission
        String title = "Your Life Span";
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String food[] = request.getParameterValues("food");
    
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generate the HTML response
        out.println("<html><head><title>" + title + "</title></head>");
    }
}
