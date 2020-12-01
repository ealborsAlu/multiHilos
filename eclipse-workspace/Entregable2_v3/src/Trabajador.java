//Clase contenedora de Trabajador
public class Trabajador implements Runnable {
	//Atributos
	private Thread hilo2;
	protected Coworking cowork;
	protected int tIzq, tDer;
	protected int numero;
	//protected Ordenador ord;

	//Constructor de la clase
	public Trabajador(int x, Coworking cowo ) {
		this.numero = x;
		this.cowork = cowo;
		this.tDer = cowork.getTarjetaDer(numero);
		this.tIzq = cowork.getTarjetaIzq(numero);
		hilo2 = new Thread(this);
		hilo2.start();
	}
	//Metodo para indicar que el hilo está activo
	public void sentarse() {
		try {
			System.out.println("Trabajador "+numero+" se sienta");
			int espera = (int)(Math.random()*100);
			hilo2.sleep(espera);
		}catch (InterruptedException  e) {
			e.printStackTrace();
	}}
	
	//metodo que simula que el trabajador está pensando
	public void pensar() {
		try {
			System.out.println("Trabajador "+numero+" pensando");
			int espera = (int)(Math.random()*100);
			hilo2.sleep(espera);
			//System.out.println("Trabajador "+numero+" esperando");
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
	}
	//método en al trabajador se le asigna dos tarjetas
	public void cogerTarjetas() {
		System.out.println("trabajador "+numero+" cogiendo Tarjetas");
		Tarjeta t1 = cowork.getTarjeta(tIzq);
		Tarjeta t2 = cowork.getTarjeta(tDer);
		t1.usar();
		t2.usar();
		
		
	}
	
	//metodo en el que al tener dos tarjetas el trabajador podría usar el ordenador 
	public void usarPC() {
		try {
			System.out.println("Trabajador "+this.numero+" tiene dos tarjetas");
			int espera = (int)(Math.random()*200);
			hilo2.sleep(espera);
			//aqui habria que insertar el codigo para usar decidir si se puede usar o no el pc 
			
			//ord.entraPC();
			System.out.println("Trabajador "+numero+" termina con tarjetas");
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//metodo en el que se liberan las dos tarjetas
	public void sueltaTarjeta() {
		System.out.println("Soltando las tarjetas");
		Tarjeta t1 = cowork.getTarjeta(tIzq);
		Tarjeta t2 = cowork.getTarjeta(tDer);
		//ord.dejaPC();
		t1.dejar();
		t2.dejar();
		
	}

	//metodo implementado de la interfaz Runnable
	@Override
	public void run() {
		while(true) {
			sentarse();
			pensar();
			cogerTarjetas();
			usarPC();
			sueltaTarjeta();
		}

	}

}
