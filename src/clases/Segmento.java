package clases;

public class Segmento {
	Punto puntoa;
	Punto puntob;
	public Segmento(Punto puntoa, Punto puntob) {
		this.puntoa=new Punto(0,0);
		this.puntob=new Punto(1,1);
		if(this.puntoa==this.puntob) {			
				System.out.println("IllegalArgumentException");			
		}
	}
	public Punto getPuntoa() {
		return puntoa;
	}
	public void setPuntoa(Punto puntoa) {
		this.puntoa = puntoa;
	}
	public Punto getPuntob() {
		return puntob;
	}
	public void setPuntob(Punto puntob) {
		this.puntob = puntob;
	}
	
	
	public double distancia() {
		double distancia;
			distancia=Math.sqrt(Math.pow((x2-x1,2))+Math.pow((y2-y1,2)));
		return distancia;
		
	}
	@Override
	public String toString() {
		String mensaje="";
		mensaje+="[("+this.puntoa+"),("+this.puntob+")]";
		return mensaje;
	}
	
}
