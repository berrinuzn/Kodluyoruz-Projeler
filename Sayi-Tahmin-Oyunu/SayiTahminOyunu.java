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
		
		System.out.println("L�tfen tahmininizi giriniz : ");
		sayi = sc.nextInt() ;
		
		if(sayi < 0 || sayi > 100) {
			
			System.out.println("L�tfen 0-100 aras� bir say� giriniz.");
			sayi = sc.nextInt();
			right++;
			System.out.println("Kalan hak : " + (5-right));
			
		}
		
		if(sayi == random) {
			
			System.out.println("Tebrikler, do�ru tahmin !");
			break;
			
		}
		else {
			
			System.out.println("Hatal� say� girdiniz !");
			
			if(sayi < random) {
				
				System.out.println(sayi + " say�s�, gizli say�dan k���kt�r.");
				
			}else {
				
				System.out.println(sayi + " say�s�, gizli say�dan b�y�kt�r.");
				
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
