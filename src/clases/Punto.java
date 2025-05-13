package clases;

public class Punto {
	int x;
	int y;
	public Punto(int x, int y) {
		this.x=0;
		this.y=0;
	}
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
	}
	@Override
	public String toString() {
		String mensaje = "";
		mensaje+="("+this.x+","+this.y+")";
		return mensaje;
	}/*oikjpqkwdkañwñlw*/
}
