import java.util.Scanner;

public class AsalSayi {
	
	public static void asal() {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Sayý giriniz : ");
		int sayi = sc.nextInt() ;
		
		int sayac = 0 ;
		
		for(int i = 2 ; i < sayi ; i++) {
			if(sayi % i == 0) {
				sayac++ ;
			}
		}
		
		if(sayac == 0) {
			System.out.println(sayi + " sayýsý ASALDIR !");
		}
		else {
			System.out.println(sayi + " sayýsý ASAL deðildir !");
		}
		
		asal() ;
		
	}

	public static void main(String[] args) {
	
	asal() ;
	
	}
	
}
