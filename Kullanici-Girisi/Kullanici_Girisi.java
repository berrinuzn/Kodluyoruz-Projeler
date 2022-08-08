import java.util.Scanner;

public class Kullanici_Girisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Kullanýcý adýnýzý giriniz : ");
	String kullaniciAdi = sc.nextLine() ;
	
	System.out.println("Þifrenizi giriniz : ");
	String sifre = sc.nextLine() ;
	
	String ka = "Admin" ;
	String sf = "12345" ;
	
	if(ka.equals(kullaniciAdi) && sf.equals(sifre)) {
		
		System.out.println("Giriþ Yaptýnýz.");
		
	}
    else if(ka.equals(kullaniciAdi)) {
		
		System.out.println("Þifrenizi yanlýþ girdiniz. Sýfýrlamak ister misiniz ? :");
		String secim = sc.nextLine() ;
		
		switch(secim) {
		
		case "yes" :
			System.out.println("Yeni þifrenizi giriniz : ");
			String yeniSifre = sc.nextLine() ;
			if(yeniSifre.equals(sf)) {
				
				System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				
			}
			else {
				
				System.out.println("Þifre oluþturuldu.");
				
			}
			break ;
			
		case "no" : 
			System.out.println("Lütfen tekrar giriþ yapmayý deneyin.");
			break ;
		
		
		}
		
	}
	else {
		
		System.out.println("Giriþ yapýlamadý.");
		
	}
	

}
}
