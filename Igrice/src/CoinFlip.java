import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

	public void CoinFlip() {
		
		Scanner skener = new Scanner(System.in);
		int glava=0;
		int pismo=0;
		Random rand = new Random();
		
		System.out.println("Unesite broj bacanja");
		int broj=skener.nextInt();
		
		for(int i=1;i<=broj;i++) {
			System.out.println();
			int  n = rand.nextInt(2) + 1;
			
			if(n==1) {
				System.out.println("Pala je glava");
				glava++;
			}
			
			if(n==2) { 
				System.out.println("Palo je pismo");
			    pismo++;
			}
		}
		System.out.println();
		double zbir=glava+pismo;
		System.out.println("Broj pojavljivanja glave "+glava);
		System.out.println("Procenat pojavaljivanja glave "+glava/zbir*100);
		System.out.println("Broj pojavljivanja pisma "+pismo);
		System.out.println("Procenat pojavaljivanja glave "+pismo/zbir*100);
	}
	
}
