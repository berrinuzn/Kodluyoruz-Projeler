import java.util.Scanner;

public class Dordun_Besin_Katlari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("say� gir : ");
	int s = sc.nextInt() ;
	
	System.out.println("D�rd�n Katlar� : ");
	
	for(int i = 1 ; i <= s ; i*=4) {
		
		System.out.println(i);
		
	}
	
	System.out.println("Be�in Katlar� : ");
	
	for(int j = 1 ; j <= s ; j*=5) {
		
		System.out.println(j);
		
	}
	
	
	
	
	
	
	
	
}
}
