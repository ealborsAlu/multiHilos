//clase contenedora de la gestion de las tarjetas 
public class Coworking {
	Tarjeta tarjetas[];
	int numTrabajadores = 5;
	
	
	
	//Se crean tantas tarjetas como trabajadoreshay 
	public Coworking() {
		tarjetas = new Tarjeta[5];
		for (int i = 0; i < 5; i++) {
			tarjetas[i] = new Tarjeta(i);
			
		}
	
	}
	
	//metodo para devolber la tarjeta 
	public Tarjeta getTarjeta(int x) {
		return tarjetas[x];
	}
	
	//devuelve el numero de la tarjeta derecha
	public int getTarjetaDer(int x ) {
		return (x+1)%numTrabajadores;
	}
	//devuelve el numero de la tarjeta izq
	public int getTarjetaIzq(int x) {
		return x;
	}
	

}
