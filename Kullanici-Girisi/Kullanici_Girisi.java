import java.util.Scanner;

public class Kullanici_Girisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Kullan�c� ad�n�z� giriniz : ");
	String kullaniciAdi = sc.nextLine() ;
	
	System.out.println("�ifrenizi giriniz : ");
	String sifre = sc.nextLine() ;
	
	String ka = "Admin" ;
	String sf = "12345" ;
	
	if(ka.equals(kullaniciAdi) && sf.equals(sifre)) {
		
		System.out.println("Giri� Yapt�n�z.");
		
	}
    else if(ka.equals(kullaniciAdi)) {
		
		System.out.println("�ifrenizi yanl�� girdiniz. S�f�rlamak ister misiniz ? :");
		String secim = sc.nextLine() ;
		
		switch(secim) {
		
		case "yes" :
			System.out.println("Yeni �ifrenizi giriniz : ");
			String yeniSifre = sc.nextLine() ;
			if(yeniSifre.equals(sf)) {
				
				System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				
			}
			else {
				
				System.out.println("�ifre olu�turuldu.");
				
			}
			break ;
			
		case "no" : 
			System.out.println("L�tfen tekrar giri� yapmay� deneyin.");
			break ;
		
		
		}
		
	}
	else {
		
		System.out.println("Giri� yap�lamad�.");
		
	}
	

}
}
