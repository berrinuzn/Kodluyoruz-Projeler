import java.util.Scanner;

public class Vücut_Kitle_Indeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
	double boy = sc.nextDouble() ;
	
	System.out.println("Lütfen kilonuzu giriniz : ");
	double kilo = sc.nextDouble() ;
	
	double VKÝ = kilo / (boy*boy) ;
	
	System.out.println("Vücut Kitle Ýndeksiniz : " + VKÝ);
		
		
		
		
		
		

	}

}
