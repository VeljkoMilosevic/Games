import java.util.Random;
import java.util.Scanner;

public class Bingo {
	
	public int[] uplata() {
		
		Scanner skener = new Scanner(System.in);
		int niz[] = new int[7];
		
		for(int i=0;i<7;i++) {
			
			System.out.println("Unesite broj koji zelite da uplatite");
			int broj = skener.nextInt();
			
			int brojac=0;
			
			for(int j=0;j<i;j++) {
				
			       if(broj==niz[j]) brojac++;
			}
			if(broj>39)  {
				System.out.println("Uneli ste veliki broj");
				i--;
			}
			else if(brojac!=0) {
				System.out.println("Taj broj ste vec uplatili");
				i--;
			}
			else niz[i]=broj;
			
		}
		System.out.println("Uplatili ste brojeve");
		for(int i=0;i<7;i++) System.out.print(" "+niz[i]);
		System.out.println();
		return niz;
	}

	public int izvlacenje() {
	      Random rand = new Random();
	      int broj = rand.nextInt(39)+1;
	      return broj; 
	}
	
	public void aplikacija() {
		int[] niz = uplata();
		int brojac=7;
		int i=0;
		int[] brojevi = new int[39];
		int brojIzvucenih=0;
		
		while(brojac!=0) {
			int izvuceniBroj=izvlacenje();
			int brojac2=0;
			for(int k=0;k<=i;k++) {
				if(izvuceniBroj==brojevi[k]) brojac2++;
			}
			if(brojac2==0) { 
			System.out.println("Izvucen " +(i+1)+". broj je "+izvuceniBroj);
			for(int k=0;k<7;k++) {
				if(niz[k]==izvuceniBroj) brojac--;
			} 
			brojIzvucenih++; 
			brojevi[i]=izvuceniBroj;
			i++;
		}
			//else System.out.println(izvuceniBroj);
		} 
		System.out.println("Dobili ste posle " +brojIzvucenih);

	}
}
