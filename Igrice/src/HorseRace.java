import java.util.Random;
import java.util.Scanner;

public class HorseRace {

	public void HorseRaceGame() {
		
		Scanner skener = new Scanner(System.in);
		System.out.println("Unesite pocetni ulog");
		int ulog = skener.nextInt();
		
		
		double prviKonj=3.2;
		double drugiKonj=2.5;
		double treciKonj=4;
		
		System.out.println("Konj broj jedan ima kvotu 3.2");
		System.out.println("Konj broj dva ima kvotu 2.5");
		System.out.println("Konj broj tri ima kvotu 4");
		
		int nastavi =1;
		
		while(nastavi==1) {
			
			
			
			
			System.out.println("Unesite svotu");
			int svota = skener.nextInt();
			
			if(svota>ulog)  {
				while(svota>ulog)  {
					System.out.println("Uneli ste vise nego sto imate");
					svota=skener.nextInt();
				}
			}
			
			
			ulog-=svota;
		
		System.out.println("Na kog konja zelite da se kladite?");
		
		int konj = skener.nextInt();
		
		if(konj>3 || konj<1) {
			while(konj>3 || konj<1) {
			System.out.println("Ne postoji taj konj");
			konj=skener.nextInt();
		}
		}
		
		Random rand = new Random();
		int dobitanKonj = rand.nextInt(3)+1;
		
		if(dobitanKonj==konj)  {
			System.out.println("Cestitamo!");
			if(dobitanKonj==1) ulog+=prviKonj*svota;
			if(dobitanKonj==2) ulog+=drugiKonj*svota;
			if(dobitanKonj==3) ulog+=treciKonj*svota; 
		}
		else {
			System.out.println("Nazalost, izgubili ste.");
			System.out.println("Dobitan konj je konj s brojem " +dobitanKonj);
		}
		
		if(ulog<1)  {
			System.out.println("Izgubili ste!");
			return;
		}
		
		System.out.println("Trenutna suma je " +ulog);
		System.out.println("Da li zelite da nastavite? 1/0");
		nastavi=skener.nextInt();
	} 
		System.out.println("Igra je zavrsena!");
	}
}
