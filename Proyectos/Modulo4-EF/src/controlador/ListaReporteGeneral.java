package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.RGeneralDao;
import modelo.Capacitacion;
import modelo.Visita;

/**
 * Servlet implementation class ListaReporte
 */
@WebServlet("/ListaReporteGeneral")
public class ListaReporteGeneral extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaReporteGeneral() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RGeneralDao vdao = new RGeneralDao();
		List<Visita> listavisitas= new ArrayList<Visita>();
		listavisitas = vdao.listarv();
		request.setAttribute("listareportev", listavisitas);
		List<Capacitacion> listacapacitacion=new ArrayList<Capacitacion>();
		listacapacitacion=vdao.listarc();
		request.setAttribute("listareportec", listacapacitacion);
		request.getRequestDispatcher("MostrarReporteG.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
