import java.util.Scanner;

public class V�cut_Kitle_Indeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz : ");
	double boy = sc.nextDouble() ;
	
	System.out.println("L�tfen kilonuzu giriniz : ");
	double kilo = sc.nextDouble() ;
	
	double VK� = kilo / (boy*boy) ;
	
	System.out.println("V�cut Kitle �ndeksiniz : " + VK�);
		
		
		
		
		
		

	}

}
