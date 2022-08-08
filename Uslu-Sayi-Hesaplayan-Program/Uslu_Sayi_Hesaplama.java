import java.util.Scanner;

public class Uslu_Sayi_Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	System.out.println("Taban deðerini giriniz : ");
	int taban = sc.nextInt() ;
	
	System.out.println("Üs deðerini giriniz : ");
	int üs = sc.nextInt() ;
	
	int a = 1 ;
	
	for(int i = 1 ; i <= üs ; i++) {
		a *= taban ;
	}
	
	System.out.println(a);
	
	
	
	
}
}
