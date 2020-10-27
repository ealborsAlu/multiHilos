package ejercicio2;

public class hilo1 extends Thread {
	String name;

	public hilo1(String nombre) {
		super();
		this.name = nombre;
	}

	public void run() {
		
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			System.out.println("hola soy el hilo 1");
			
		}
		
}
