package BLL;

import Beans.Tarjeta;
import DAL.VerTarjetaDAL;

public class TarjetaBLL {
	
	public int creartarjeta()
	{
		
		return 1;
	}
	
	public Tarjeta vertarjeta()
	{
		VerTarjetaDAL vdal=new VerTarjetaDAL();
		return vdal.vertarjeta();
	}
	
}
