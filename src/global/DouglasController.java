package global;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GlobalController
 */
@WebServlet("/douglas.do")
public class DouglasController extends HttpServlet {
 private static final long serialVersionUID = 1L;
   
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  System.out.println("===Douglas 컨트롤러 진입===");
  DispatcherServlet.send(request, response, Seperator.init(request, response));
 }
}
