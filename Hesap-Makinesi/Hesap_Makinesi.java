import java.util.Scanner;

public class Hesap_Makinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Birinci say�y� giriniz : ");
	int s1 = sc.nextInt() ;
	
	System.out.println("�kinci say�y� giriniz : ");
	int s2 = sc.nextInt() ;
	
	System.out.println("1-Toplama");
	System.out.println("2-��karma");
	System.out.println("3-�arpma");
	System.out.println("4-B�lme");
	
	System.out.println("Yapaca��n�z i�lemi se�iniz : ");
	int secim = sc.nextInt() ;
	
	switch(secim) {
	
	case 1 : 
		System.out.println("Toplama : " + (s1+s2));
		break ;
		
	case 2 : 
		System.out.println("��karma : " + (s1-s2));
		break ;
		
	case 3 : 
		System.out.println("�arpma : " + (s1*s2));
		break ;
		
	case 4 : 
		System.out.println("B�lme : " + (double)s1/s2);
	    break;
	    
	}

		

	}

}
