import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: mborisovsky
 * Date: 18.02.14
 * Time: 16:44
 * To change this template use File | Settings | File Templates.
 */
public class Redirect extends HttpServlet {
    private static int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setAttribute("current_count",count);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
