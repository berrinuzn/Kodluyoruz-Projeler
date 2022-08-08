import java.util.Scanner;

public class HesapMakinesi {
	
	static void plus() {
		
		Scanner sc = new Scanner(System.in) ;
		int number , result = 0 , i = 1 ;
		
		while(true) {
			
			System.out.print(i++ + ". sayý :");
			number = sc.nextInt() ;
			if(number == 0) {
				break ;
			}
			result += number ;
			
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void minus() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Kaç adet sayý gireceksiniz :");
		int counter = sc.nextInt() ;
		int number , result = 0 ;
		
		for(int i = 1 ; i <= counter ; i++) {
			
			System.out.print(i + ". sayý :");
			number = sc.nextInt() ;
			
			if(i == 1) {
				result += number ;
				continue ;
			}
			result -= number ;
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void times() {
		
		Scanner sc = new Scanner(System.in) ;
		int number , result = 1 , i = 1 ;
		
		while(true) {
			
			System.out.print(i++ + ". sayý :");
			number = sc.nextInt() ;
			
			if(number == 1)
				break;
			if(number == 0) {
				result = 0 ;
				break ;
			}
			result *= number ;
			
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void divided() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Kaç adet sayý gireceksiniz :");
		int counter = sc.nextInt() ;
		double number , result = 0.0 ;
		
		for(int i = 1 ; i <= counter ; i++) {
			
			System.out.print(i + ". sayý :");
			number = sc.nextDouble() ;
			
			if(i != 1 && number == 0) {
				
				System.out.println("Böleni 0 giremezsiniz.");
				continue ;
			}
			
			if(i == 1) {
				result = number ;
				continue ;
			}
			result /= number ;
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void power() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Taban deðeri giriniz :");
		int base = sc.nextInt() ;
		System.out.print("Üs deðeri giriniz :");
		int exponent = sc.nextInt() ;
		int result = 1 ;
		
		for(int i = 1 ; i <= exponent ; i++) {
			
			result *= base ;
			
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void factorial() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Sayý giriniz :");
		int n = sc.nextInt() ;
		int result = 1 ;
		
		for(int i = 1 ; i <= n ; i++) {
			
			result *= i ;
			
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void modding() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Kaç adet sayý gireceksiniz : ");
		int counter = sc.nextInt() ;
		double number , result = 0.0 ;
		
		for(int i = 1 ; i <= counter ; i++) {
			
			System.out.print(i + ". sayý :");
			number = sc.nextDouble() ;
			
			if(i != 1 && number == 0) {
				
				System.out.println("Böleni 0 giremezsiniz.");
				continue ;
			}
			
			if(i == 1) {
				result = number ;
				continue ;
			}
			result %= number ;
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void areaPerimeter() {
		
		Scanner sc = new Scanner(System.in) ;
		double length1 , length2 , area , perimeter ;
		
		System.out.print("Birinci kenar uzunluðunu giriniz : ");
		length1 = sc.nextDouble() ;
		System.out.print("Ýkinci kenar uzunluðunu giriniz : ");
		length2 = sc.nextDouble() ;
		
		area = length1*length2 ;
		perimeter = 2*(length1 + length2) ;
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	int select ;
	
	String menu = "1- Toplama Ýþlemi\n"
			+ "2- Çýkarma Ýþlemi\n"
			+ "3- Çarpma Ýþlemi\n"
			+ "4- Bölme Ýþlemi\n"
			+ "5- Üslü Sayý Hesaplama\n"
			+ "6- Faktoriyel Hesaplama\n"
			+ "7- Mod Alma\n"
			+ "8- Dikdötgen Alan ve Çevre Hesabý\n"
			+ "0- Çýkýþ Yap" ;
	
	
	do {
		
		System.out.println(menu);
		System.out.print("Lütfen bir iþlem seçiniz :");
		select = sc.nextInt() ;
		
		switch(select) {
		
		case 1 : 
			plus() ;
			break ;
			
		case 2 : 
			minus() ;
			break ;
			
		case 3 :
			times() ;
			break ;
			
		case 4 : 
			divided() ;
			break ;
			
		case 5 :
			power() ;
			break ;
			
		case 6 :
			factorial() ;
			break ;
			
		case 7 :
			modding() ;
			break ;
			
		case 8 :
			areaPerimeter() ;
			break ;
			
		case 0 : 
			break ;
			
		default :
			System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
		
		}
		
	}while(select != 0) ;
	
	
}
}
