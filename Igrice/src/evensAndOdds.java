import java.util.Random;
import java.util.Scanner;

public class evensAndOdds {

	public int jednaPartija() {
		
		Scanner skener = new Scanner(System.in);
		Random rand = new Random();
		
		
		
		System.out.println("Izaberite broj");
		int broj = skener.nextInt();
		if(broj!=1 && broj!=2)  {
			System.out.println("Pogresan unos");
			return -1;
		   
		}
		int kompjuterovBroj = rand.nextInt(2)+1;
		System.out.println("Kompjuterov broj "+kompjuterovBroj);
		
	     return broj+kompjuterovBroj;  
		
	}
	
	public void aplikacija() {
		
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Da li igrate u 3 ili 5 partija");
		
		int partije = skener.nextInt();
		
		if(partije!=5 || partije!=3) {
			while(partije!=3 && partije!=5) {
				System.out.println("Pogresan unos partija");
				partije=skener.nextInt();
			}
		}
		
        int kompjuter=0;
		int igrac=0;
		
		while(igrac!=partije/2+1 && kompjuter!=partije/2+1) {
			
			System.out.println("Par 0 ili nepar 1");
			int odluka = skener.nextInt();
			int broj = jednaPartija();
			
			if(odluka!=1 && odluka!=0) {
				System.out.println("Pogresan unos para ili nepara");
			}
			
			
			else if(broj==-1)  {}
			else if(broj%2==0 && odluka==0) igrac++;
			else if(broj%2==1 && odluka==1) igrac++;
			else kompjuter++;
			System.out.println("Kompjuter "+kompjuter+ " Igrac "+igrac);
		}
		if(kompjuter==partije/2+1) System.out.println("Kompjuter je pobedio!");
		else System.out.println("Vi ste pobedili!");
	}
	
} 
