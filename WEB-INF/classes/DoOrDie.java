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
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String[] food = request.getParameterValues("food");

        // Predefined toxicity and energy levels for the food items
        Object[][] foodValues = {
            {"Chappathi", 4, 4},  // {food item, toxicity, energy}
            {"Idly", 2, 5},
            {"Dosai", 2, 6},
            {"Cornflex", 4, 8},
            {"Salad", 1, 7},
            {"Noodles", 5, 5},
            {"Bread and Jam", 3, 5},
            {"Pasta", 3, 6},
            {"Parotta", 8, 5},
            {"Upma", 3, 5}
        };
        
        int totalToxicity = 0;
        int totalEnergy = 0;

        // Calculate total toxicity and energy from selected food items
        if (food != null) {
            for (String selectedFood : food) {
                for (Object[] item : foodValues) {
                    if (item[0].equals(selectedFood)) {
                        totalToxicity += (int)item[1];  // Cast to int
                        totalEnergy += (int)item[2];    // Cast to int
                        break;
                    }
                }
            }
        }

        // Calculate expected lifespan
        int A = Integer.parseInt(age);
        int G = "Male".equals(gender) ? 1 : 2; // Male = 1, Female = 2
        double expectedLifespan = (80 - A) * (1 - (totalToxicity / 50.0)) + (totalEnergy / 2.0 * G / 2.0) + A;
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generate the HTML response
        out.println("<html><head><title>" + title + "</title></head>");
        out.println("<body><h2>Form Submission Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        
        // Display selected food items
        out.println("<p>Selected Food Items: </p>");
        if (food != null && food.length > 0) {
            out.println("<ul>");
            for (String item : food) {
                out.println("<li>" + item + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No food items selected.</p>");
        }

        // Display expected lifespan
        out.println("<p>Expected Lifespan: " + expectedLifespan + " years</p>");
        out.println("</body></html>");
    }
}
