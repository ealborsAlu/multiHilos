//Clase conetenedora de la Tarjeta
public   class Tarjeta {
	//Atributos
	int numero;
	boolean enUso;
	
	//Constructor en el que se le asigna un numero
	public Tarjeta(int x) {
		this.numero = x ; 
	}
	
	//Método sincronizado para cuando se está usando la tarjeta
	synchronized public void usar() {
		if (enUso) {
			System.out.println("Tarjeta "+this.numero+" esta en uso , espera");
		}else {
			enUso = true;
			System.out.println("Se esta usando la tarjeta "+this.numero);
		}
		
	}
	
	//Método sincronizado para cuando se deja de usar .
	synchronized public void dejar() {
		enUso = false;
		System.out.println("Tarjeta "+this.numero+" esta ahora disponible");
		
	}

	
}
