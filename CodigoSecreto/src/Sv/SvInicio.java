package Sv;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BLL.NuevaPartidaBLL;
import Beans.*;
import error.GenericException;

/**
 * Servlet implementation class SvInicio
 */
@WebServlet("/SvInicio")
public class SvInicio extends SvBase {
	private static final long serialVersionUID = 1L;
	private String OPERACION;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvInicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws GenericException, ServletException, IOException {
		OPERACION=request.getParameter("oper");
		
		if (OPERACION.equals("inicio"))
		{
			//request.setAttribute("idcliente",idcliente);
			request.getRequestDispatcher("WEB-INF/MenuPrincipal/Menu.jsp").forward(request,response);
		}
		else if (OPERACION.equals("nuevapartida"))
		{
			crearpartida();
		}
		
	}

	public void crearpartida()
	{
		NuevaPartidaBLL npbll=new NuevaPartidaBLL();
		npbll.creartablero();
	}
}
