package controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UltimoPagoDao;
import modelo.Pago;

/**
 * Servlet implementation class UltimoPago
 */
@WebServlet("/UltimoPago")
public class UltimoPago extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UltimoPago() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());	
		
		//Recupero Mes y año del sistema.
		Calendar c = new GregorianCalendar();
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		
		int mesString = Integer.parseInt(mes);
		String mesok = "";
		if(mesString<10) {
			mesok= "0" + mesString;
		}else {
			mesok= mes;
		}
		
		int clienteid = Integer.parseInt(request.getParameter("id"));		
		UltimoPagoDao ultimo = new UltimoPagoDao();
		Pago ultpago = ultimo.buscar(clienteid);
		
		//Recupero mes y año del cliente y Agrego un día para setearlo como fecha
		String fpago= "01-"+ultpago.getMesanio();	
		String fpago2= ultpago.getMesanio();
		//Junto mes y año del sistema para su comparación y Agrego un día para setearlo como fecha
		String fhoy= "01-"+mesok+"-"+annio;
		
		//Seteo los datos a fecha.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate fecha1 = LocalDate.parse(fhoy, formatter);
		LocalDate fecha2 = LocalDate.parse(fpago, formatter);		
		
		
		String mensaje = "";
		
		//Comparo Fechas
		if(fecha1.equals(fecha2)) {
			mensaje="Cliente se encuentra al día en sus pagos";
		}else if(fecha1.isAfter(fecha2)){
			mensaje="El cliente se encuentra atrasado en sus pagos";
		}else if(fecha1.isBefore(fecha2)) {
			mensaje="El Cliente tiene Cancelado hasta el mes de: "+ fpago2;
		}
		
		
		//Envio el mensaje y los datos solicitados.
		request.setAttribute("mensaje", mensaje);
		request.setAttribute("ultimopago", ultpago);
		request.getRequestDispatcher("UltimoPago.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
