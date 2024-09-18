/**
 * 1. Compiliamo tutti i file .java
 * 	javac *.java
 * 2 eseguiami l'oggetto che contien il main
 * 	java primary
 */


public class primary {
	
	public static void main(String[] args) {
		//instanziamo la callsse secondaria
		Secondaria oggetto_second = new Secondaria();
		
		//invochiami il metodoi provas di secondari
		oggetto_second.prova();
		
		//Proviamo il metordo somma di secondari
		int ris = oggetto_second.somma(12, 7);
		System.out.printf("\n\nLa somma di %d e %d è %d\n\n", 12, 7, ris);
	
				
		//Proviamo il metordo 
		ris = oggetto_second.prod(2, 3, 4);
		System.out.printf("Il prodotto di 2*3*4 è %d", ris);
	}

}
