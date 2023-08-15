package resolucion;
import java.math.*;

public class Punto {
	double x;
	double y;
	 //A)
    // public Punto(){
    //     this.x = 0;
    //     this.y = 0;
    // }
	//B)
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}

	//C)
	public void imprimir(){
		System.out.println("X = " + this.x);
		System.out.println("Y = " + this.y);
	}

	//D)
	public void desplazar (double desp_x, double desp_y){
		this.x = desp_x;
		this.y = desp_y;
	}

	//E)
	public static double distancia(Punto p1, Punto p2){
		double dist_x = p1.x - p2.x;
		double dist_y = p1.y - p2.y;
		return Math.sqrt(dist_x * dist_x + dist_y * dist_y);
	}
}
