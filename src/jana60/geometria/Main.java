package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Rettangolo myRect = new Rettangolo();
		
		System.out.println("inserisci le dimensioni del rettangolo: ");
		myRect.base = scan.nextInt();
		myRect.altezza = scan.nextInt();
		
		System.out.println("il perimetro del tuo rettangolo è: " + myRect.calcolaPerimetro(myRect.base, myRect.altezza));
		System.out.println("l'area del tuo rettangolo è: " + myRect.calcolaArea(myRect.base, myRect.altezza));
		
		scan.close();

	}

}
