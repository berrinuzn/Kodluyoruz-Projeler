import java.util.Scanner;

public class Artik_Yil_Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
    
	System.out.println("Y�l giriniz : ");
	int yil = sc.nextInt() ;
	
	if(yil % 4 == 0) {
		System.out.println(yil + " bir art�k y�ld�r !");
	}
	else {
		System.out.println(yil + " bir art�k y�l de�ildir !");
	}
  
	

    

}
}
