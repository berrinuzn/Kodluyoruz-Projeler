import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	int random = (int) (Math.random()*100) ;
	
	int sayac = 0 ;
	int sayi ;
	int right = 0 ;
	
	while(right < 5) {
		
		System.out.println("Lütfen tahmininizi giriniz : ");
		sayi = sc.nextInt() ;
		
		if(sayi < 0 || sayi > 100) {
			
			System.out.println("Lütfen 0-100 arasý bir sayý giriniz.");
			sayi = sc.nextInt();
			right++;
			System.out.println("Kalan hak : " + (5-right));
			
		}
		
		if(sayi == random) {
			
			System.out.println("Tebrikler, doðru tahmin !");
			break;
			
		}
		else {
			
			System.out.println("Hatalý sayý girdiniz !");
			
			if(sayi < random) {
				
				System.out.println(sayi + " sayýsý, gizli sayýdan küçüktür.");
				
			}else {
				
				System.out.println(sayi + " sayýsý, gizli sayýdan büyüktür.");
				
			}
			
			right++;
			
			System.out.println("Kalan hak : " + (5-right));
			
		}
		
	}
	
	if(right == 5) {
		
		System.err.println("Kaybettiniz !");
		
	}
	
	
	
		
	}

}
