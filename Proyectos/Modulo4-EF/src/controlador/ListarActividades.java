package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ActividadesDao;
//import modelo.Cliente;
import modelo.Visita;

/**
 * Servlet implementation class ListarActividades
 */
@WebServlet("/ListarActividades")
public class ListarActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListarActividades() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int clienteid = Integer.parseInt(request.getParameter("id"));
		
				
			ActividadesDao actdao = new ActividadesDao();
			
			List<Visita> listavisita = new ArrayList<Visita>();
			
			listavisita = actdao.listarA(clienteid);
			
			request.setAttribute("cantidad", listavisita.size());
			
			request.setAttribute("listadovisitas", listavisita);
			request.getRequestDispatcher("VerActividades.jsp").forward(request, response);			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
