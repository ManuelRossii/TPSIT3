
public class Secondaria {

	//primno costruttore saluta
	public Secondaria() {
		System.out.print("Ciao dal primo costruttore della seconda classe\n");
	}

	//secondo costruttore esegue la somma dei parametri
	public Secondaria(int a, int b) {
		System.out.printf("La somma di %d e %d è %d\n\n", a, b, a+b);
	}



	public void prova() {
		System.out.print("Ciao dal metodo della seconda classe");
	}
	
	public int somma(int a, int b) {
		
		return a+b;
	}

		
	public int prod(int a, int b, int c) {
		
		return a*b*c;
	}
}
