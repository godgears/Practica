package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RClienteDao;
import modelo.Capacitacion;
import modelo.Visita;

/**
 * Servlet implementation class ListadoClientes
 */
@WebServlet("/ListadoReportesClientes")
public class ListadoReportesClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoReportesClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("idc"));		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RClienteDao cdao = new RClienteDao();
		List<Visita> listareporte = new ArrayList<Visita>();
		listareporte = cdao.listarv(id);
		request.setAttribute("listareportev", listareporte);
		request.getRequestDispatcher("ListaReporteCliente.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idc"));		
		RClienteDao cdao = new RClienteDao();
		List<Visita> listareporte = new ArrayList<Visita>();
		listareporte = cdao.listarv(id);
		int idc = Integer.parseInt(request.getParameter("idv"));		
		RClienteDao cdao2 = new RClienteDao();
		List<Capacitacion> listareporte2 = new ArrayList<Capacitacion>();
		listareporte2 = cdao2.listarc(idc);
		request.setAttribute("listareportev", listareporte);
		request.setAttribute("listareportec", listareporte2);
		request.getRequestDispatcher("ListaReporteCliente.jsp").forward(request, response);
	}

}
