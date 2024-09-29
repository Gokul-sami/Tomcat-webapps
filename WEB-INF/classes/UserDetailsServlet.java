import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class UserDetailsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Retrieve parameters from the form submission
        String name = request.getParameter("userName");
        String email = request.getParameter("userEmail");
        String age = request.getParameter("userAge");
        String artist = request.getParameter("favoriteArtist");
        String genre = request.getParameter("userGenre");
        String comments = request.getParameter("userComments"); // Add this if you have a comments field

        // Redirect to result.html with query parameters
        response.sendRedirect("result.html?name=" + URLEncoder.encode(name, "UTF-8") +
                "&email=" + URLEncoder.encode(email, "UTF-8") +
                "&age=" + URLEncoder.encode(age, "UTF-8") +
                "&artist=" + URLEncoder.encode(artist, "UTF-8") +
                "&genre=" + URLEncoder.encode(genre, "UTF-8") +
                "&comments=" + URLEncoder.encode(comments, "UTF-8"));
    }
}
