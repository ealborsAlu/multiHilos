package ejercicio2;

public class hilo2 extends Thread{
	String name ;
	
	public hilo2(String nombre) {
		super();
		this.name = nombre;
	}
	
	
public void run() {
	System.out.println("Hola soy el hilo 2");
		
	}
	

}
