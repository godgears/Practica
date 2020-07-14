package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccidenteDao;
//import dao.ClienteDao;
import modelo.Accidente;
//import modelo.Cliente;

/**
 * Servlet implementation class ListarAccidente
 */
@WebServlet("/ListarAccidente")
public class ListarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAccidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccidenteDao cdao = new AccidenteDao();
		List<Accidente> listaacc = new ArrayList<Accidente>();
		listaacc = cdao.listar();
		request.setAttribute("listadoaccidente", listaacc);
		request.getRequestDispatcher("MostrarAccidente.jsp").forward(request, response);	
	}

}
