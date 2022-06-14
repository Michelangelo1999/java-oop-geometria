package jana60.geometria;

import java.util.Scanner;

public class MainBonus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Rettangolo myRect = new Rettangolo();
		
		int biggestArea = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = i+1;
			System.out.println(n + " - inserisci le dimensioni del rettangolo: ");
			myRect.base = scan.nextInt();
			myRect.altezza = scan.nextInt();
			
			if(myRect.calcolaArea(myRect.base, myRect.altezza) > biggestArea) {
				biggestArea = myRect.calcolaArea(myRect.base, myRect.altezza);
			}
		}
		
		System.out.println("l'area del rettangolo più grande misura: " + biggestArea);
		
		scan.close();

	}

}
