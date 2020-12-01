//clase contenedora de la  ordenador

public class Ordenador {
	
	//atributos
	private Object objeto;
	private boolean ocupado;
	
	//metodo constructor que crea un ordenador que no está en uso
	public Ordenador() {
		this.setOcupado(false);
		this.objeto = new Object();
	
	}
	
	//metodo sincronizado para la entrada del pc 
	public synchronized void entraPC(){
		if (ocupado) {
			System.out.println("El ordenador está en uso , debe esperar");
		}else {
			ocupado = false;
			System.out.println("El ordenador esta siendo usado ");
		}
		
	}
	
	//metodo sincronizado para dejar el pc 
	public synchronized void dejaPC(){
		ocupado = false;
		System.out.println("El ordenador está disponible ");
		
		
	}

	//devuelve el estado de la variable 
	public boolean isOcupado() {
		return ocupado;
	}

	//para cambiar el estado de la variable
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

}
