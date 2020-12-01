
public class Trabajador implements Runnable {
	private Thread hilo2;
	protected Coworking cowork;
	protected int tIzq, tDer;
	protected int numero;
	//protected Ordenador ord;

	public Trabajador(int x, Coworking cowo ) {
		this.numero = x;
		this.cowork = cowo;
		this.tDer = cowork.getTarjetaDer(numero);
		this.tIzq = cowork.getTarjetaIzq(numero);
		hilo2 = new Thread(this);
		hilo2.start();
	}
	public void sentarse() {
		try {
			System.out.println("Trabajador "+numero+" se sienta");
			int espera = (int)(Math.random()*100);
			hilo2.sleep(espera);
		}catch (InterruptedException  e) {
			e.printStackTrace();
	}}
	
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
	public void cogerTarjetas() {
		System.out.println("trabajador "+numero+" cogiendo Tarjetas");
		Tarjeta t1 = cowork.getTarjeta(tIzq);
		Tarjeta t2 = cowork.getTarjeta(tDer);
		t1.usar();
		t2.usar();
		
		
	}
	
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
	
	public void sueltaTarjeta() {
		System.out.println("Soltando las tarjetas");
		Tarjeta t1 = cowork.getTarjeta(tIzq);
		Tarjeta t2 = cowork.getTarjeta(tDer);
		//ord.dejaPC();
		t1.dejar();
		t2.dejar();
		
	}

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
