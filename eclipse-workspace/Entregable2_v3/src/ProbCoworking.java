
public class ProbCoworking {

	//clase a ejecutar para desarrollar el programa 
	public static void main(String[] args) {
		
		System.out.println("Primera parte ");
		Coworking co = new Coworking();
		for (int i = 0; i < 5; i++) {
			Trabajador traba = new Trabajador(i, co);
		}

	}

}
