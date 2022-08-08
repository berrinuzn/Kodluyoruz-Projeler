import java.util.Scanner;

public class Hava_Sicakligina_Gore_Etkinligi_Onerme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Hava sýcaklýðýný gririniz : ");
	int sicaklik = sc.nextInt() ;
	
	if(sicaklik < 5) {
		
		System.out.println("Kayak yapabilirsiniz.");
		
	}
	else if(sicaklik >= 5 && sicaklik < 15) {
		
		System.out.println("Sinemaya gidebilirsiniz.");
		
	}
	else if(sicaklik >= 15 && sicaklik < 25) {
		
		System.out.println("Pikniðe gidebilirsiniz.");
		
	}
	else {
		
		System.out.println("Yüzmeye gidebilirsiniz.");
		
	}
    
    
    
    

}
}
