package ejercicio2;

public class Orden {

	public static void main(String[] args) {

		// la opcion 10 es la mas alta y la 1 la mas baja
		hilo1 h1 = new hilo1("hilo1");
		//h1.setPriority(1);
		hilo2 h2 = new hilo2("hilo2");
		//h2.setPriority();
		
		//h1.interrupt();
		h1.start();
		h2.start();

	}

}
