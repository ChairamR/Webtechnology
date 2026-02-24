import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/methodDemo")
public class MethodDemoServlet extends HttpServlet {

    // Handles GET request
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Data Received Using GET Method</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p><b>Note:</b> Data is visible in the URL.</p>");
        out.println("</body></html>");
    }

    // Handles POST request
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Data Received Using POST Method</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p><b>Note:</b> Data is NOT visible in the URL.</p>");
        out.println("</body></html>");
    }
}