package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PagosDao;
import modelo.Pago;

/**
 * Servlet implementation class AgregarPago
 */
@WebServlet("/AgregarPago")
public class AgregarPago extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarPago() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("AgregarPago.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mesanio = request.getParameter("mesanio");
		int montoregular = Integer.parseInt(request.getParameter("montor"));
		int montoadicionales = Integer.parseInt(request.getParameter("montoa"));
		int clienteid = Integer.parseInt(request.getParameter("idclie"));
		Pago pago = new Pago(mesanio, montoregular, montoadicionales, clienteid);
		PagosDao pagosdao = new PagosDao();
		boolean agregar = false;
		agregar = pagosdao.agregar(pago);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "El Pago ha sido agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("AgregarPago.jsp").forward(request, response);		
		
	}

}
