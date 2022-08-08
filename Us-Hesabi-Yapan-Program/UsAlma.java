import java.util.Scanner;

public class UsAlma {
	
	public static void usAlma() {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Taban deðeri giriniz : ");
		int taban = sc.nextInt() ;
		System.out.print("Üs deðeri giriniz : ");
		int us = sc.nextInt() ;
		
		int sonuc = 1 ;
		
		for(int i = 1 ; i <= us ; i++) {
			sonuc *= taban ;
		}
		
		System.out.println("Sonuç : " + sonuc);
		
		usAlma() ;
		
	}

	public static void main(String[] args) {
	
	usAlma() ;
	
	}
	
}
