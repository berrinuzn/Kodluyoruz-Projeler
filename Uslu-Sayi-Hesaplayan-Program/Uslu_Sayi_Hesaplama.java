import java.util.Scanner;

public class Uslu_Sayi_Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Taban de�erini giriniz : ");
	int taban = sc.nextInt() ;
	
	System.out.println("�s de�erini giriniz : ");
	int �s = sc.nextInt() ;
	
	int a = 1 ;
	
	for(int i = 1 ; i <= �s ; i++) {
		a *= taban ;
	}
	
	System.out.println(a);
	
	
	
	
}
}
