import java.util.Scanner;

public class Hesap_Makinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Birinci sayýyý giriniz : ");
	int s1 = sc.nextInt() ;
	
	System.out.println("Ýkinci sayýyý giriniz : ");
	int s2 = sc.nextInt() ;
	
	System.out.println("1-Toplama");
	System.out.println("2-Çýkarma");
	System.out.println("3-Çarpma");
	System.out.println("4-Bölme");
	
	System.out.println("Yapacaðýnýz iþlemi seçiniz : ");
	int secim = sc.nextInt() ;
	
	switch(secim) {
	
	case 1 : 
		System.out.println("Toplama : " + (s1+s2));
		break ;
		
	case 2 : 
		System.out.println("Çýkarma : " + (s1-s2));
		break ;
		
	case 3 : 
		System.out.println("Çarpma : " + (s1*s2));
		break ;
		
	case 4 : 
		System.out.println("Bölme : " + (double)s1/s2);
	    break;
	    
	}

		

	}

}
