import java.util.Random;
import java.util.Scanner;

public class guessMyNumber {

	
	public void aplikacija() {
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Izaberite broj pokusaja");
		int pokusaji=skener.nextInt();
		if(pokusaji<=0) {
			while(pokusaji<=0) {
				System.out.println("Uneli ste negativan broj");
				System.out.println("Izaberite broj pokusaja");
				pokusaji=skener.nextInt();
			}
		}

		
		System.out.println("Izaberite maksimalan broj");
		int max = skener.nextInt(); 
		if(max<=0) {
			while(max<=0) {
				System.out.println("Uneli ste negativan broj");
				System.out.println("Izaberite maksimalan broj");
				max=skener.nextInt();
			}
		}
		
		Random rand = new Random();
		int broj = rand.nextInt(max)+1;
		
		while(pokusaji!=0) {
			System.out.println("Unesite broj");
			int unetBroj = skener.nextInt();
			
			if(broj==unetBroj) {
				System.out.println("To je taj broj!");
				return;
			}
			if(unetBroj>broj) {
				System.out.println("Uneli ste veliki broj!");
				pokusaji--;
			}
			if(unetBroj<broj) { 
				System.out.println("Uneli ste mali broj!");
				pokusaji--;
			}
		}
		System.out.println("Nazalost, niste pogodili broj!");	
		System.out.println("Broj je bio "+broj);
	}
}
