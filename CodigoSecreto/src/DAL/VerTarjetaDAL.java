package DAL;

import BD.Conexion;
import Beans.Tarjeta;

public class VerTarjetaDAL {

	Conexion c;
	
	public VerTarjetaDAL() {
	}
	
	public Tarjeta vertarjeta() {
		// TODO Auto-generated method stub
		
		try {
			c=new Conexion();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			c.cerrarConexion();
		}
		
		return null;
	}

}
