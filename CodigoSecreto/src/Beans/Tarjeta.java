package Beans;

public class Tarjeta {
	
	private int oid_tarjeta;
	private int oid_tablero;
	private String valor;
	private String color;
	
	public int getOid_tarjeta() {
		return oid_tarjeta;
	}
	public void setOid_tarjeta(int oid_tarjeta) {
		this.oid_tarjeta = oid_tarjeta;
	}
	public int getOid_tablero() {
		return oid_tablero;
	}
	public void setOid_tablero(int oid_tablero) {
		this.oid_tablero = oid_tablero;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Tarjeta [oid_tarjeta=" + oid_tarjeta + ", oid_tablero=" + oid_tablero + ", valor=" + valor + ", color="
				+ color + "]";
	}
	
	

}
