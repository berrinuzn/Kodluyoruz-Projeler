import java.util.Scanner;

public class Ucak_Bileti_Fiyati_Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Mesafeyi km türünden giriniz : ");
	int mesafe = sc.nextInt() ;
	
	System.out.println("Yaşınızı giriniz : ");
	int yas = sc.nextInt() ;
	
	System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
	int secim = sc.nextInt() ;
	
	double tutar ;
	double yasIndirimi ;
	double indirimliTutar ;
	double biletİndirimi ;
	double sonTutar ;
	
	if(mesafe > 0 && yas > 0 && (secim == 1 || secim == 2)) {
		
		if(yas < 12) {
			
			tutar = mesafe*0.10 ;
			yasIndirimi = tutar*0.50 ;
			indirimliTutar = tutar - yasIndirimi ;
			
			switch(secim) {
			
			case 1 :
				System.out.println("Toplam Tutar = " + indirimliTutar);
				break ;
			
			case 2 :
				biletİndirimi = indirimliTutar*0.20 ;
				sonTutar = indirimliTutar - biletİndirimi ;				
				System.out.println("Toplam Tutar = " + 2*sonTutar);
				break ;
				
			}
			
		}
		else if(yas >= 12 && yas <= 24) {
			
			tutar = mesafe*0.10 ;
			yasIndirimi = tutar*0.10 ;
			indirimliTutar = tutar - yasIndirimi ;
			
			switch(secim) {
			
			case 1 :
				System.out.println("Toplam Tutar = " + indirimliTutar);
                break ;
                
			case 2 :
				biletİndirimi = indirimliTutar*0.20 ;
				sonTutar = indirimliTutar - biletİndirimi ;				
				System.out.println("Toplam Tutar = " + 2*sonTutar);
				break ;
				
			}
			
		}
		else if(yas > 65) {
			
			tutar = mesafe*0.10 ;
			yasIndirimi = tutar*0.30 ;
			indirimliTutar = tutar - yasIndirimi ;
			
            switch(secim) {
			
			case 1 :
				System.out.println("Toplam Tutar = " + indirimliTutar);
			    break ;
			    
			case 2 :
				biletİndirimi = indirimliTutar*0.20 ;
				sonTutar = indirimliTutar - biletİndirimi ;				
				System.out.println("Toplam Tutar = " + 2*sonTutar);
				break ;
				
			}
			
		}
		else {
			
			tutar = mesafe*0.10 ;
			
            switch(secim) {
			
			case 1 :
				System.out.println("Toplam Tutar = " + tutar);
			    break ;
			    
			case 2 :
				biletİndirimi = tutar*0.20 ;
				sonTutar = tutar - biletİndirimi ;				
				System.out.println("Toplam Tutar = " + 2*sonTutar);
				break ;
				
			}
		}
		
	}
	else {
		
		System.out.println("Hatalı Veri Girdiniz !");
		
	}
    
    

}
}
