import java.util.Scanner;

public class Sinifi_Gecme_Durumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Matematik notunuzu giriniz : ");
    int matematik = sc.nextInt() ;
    
    System.out.println("Fizik notunuz giriniz : ");
    int fizik = sc.nextInt() ;
    
    System.out.println("Türkçe notunuzu giriniz : ");
    int turkce = sc.nextInt() ;
    
    System.out.println("Kimya notunuzu giriniz : ");
    int kimya = sc.nextInt() ;
    
    System.out.println("Müzik notunuzu giriniz : ");
    int muzik = sc.nextInt() ;
    
    int toplam = 0 ;
    int i= 0 ;
  
    if(matematik >= 0 && matematik <= 100) {
    	
    	toplam += matematik ;
    	i++ ;
    	
    }
    if(fizik >= 0 && fizik <= 100) {
    	
    	toplam += fizik ;
    	i++ ;
    	
    }
    if(kimya >= 0 && kimya <= 100) {
    	
    	toplam += kimya ;
    	i++ ;
    	
    }
    if(muzik >= 0 && muzik <= 100) {
    	
    	toplam += muzik ;
    	i++ ;
    	
    }
    if(turkce >= 0 && turkce <= 100) {
    	
    	toplam += turkce ;
    	i++ ;
    	
    }
    
    double ortalama = (double)toplam/i ;
    
    System.out.println("Ortalamanýz : " + ortalama);
    
    if(ortalama >= 55) {
    	
    	System.out.println("Sýnýfý geçtiniz.");
    	
    }
    else {
    	
    	System.out.println("Sýnýfta kaldýnýz.");
    	
    }
    
    
    
    
    
    
    

}
}
