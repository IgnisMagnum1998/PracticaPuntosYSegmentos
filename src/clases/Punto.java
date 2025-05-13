package clases;

public class Punto {
	/*Declaramos las variables del punto, tanto eje x como y*/
	int x;
	int y;
	public Punto(int x, int y) {
		this.x=0;
		this.y=0;
	}//Creamos el método constructor
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}//Creamos los getters y setters
	@Override
	public String toString() {
		String mensaje = "";
		mensaje+="("+this.x+","+this.y+")";
		return mensaje;
	}//Creamos el método toString
}
