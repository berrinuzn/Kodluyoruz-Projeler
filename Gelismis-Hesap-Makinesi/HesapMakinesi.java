import java.util.Scanner;

public class HesapMakinesi {
	
	static void plus() {
		
		Scanner sc = new Scanner(System.in) ;
		int number , result = 0 , i = 1 ;
		
		while(true) {
			
			System.out.print(i++ + ". say? :");
			number = sc.nextInt() ;
			if(number == 0) {
				break ;
			}
			result += number ;
			
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void minus() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Ka? adet say? gireceksiniz :");
		int counter = sc.nextInt() ;
		int number , result = 0 ;
		
		for(int i = 1 ; i <= counter ; i++) {
			
			System.out.print(i + ". say? :");
			number = sc.nextInt() ;
			
			if(i == 1) {
				result += number ;
				continue ;
			}
			result -= number ;
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void times() {
		
		Scanner sc = new Scanner(System.in) ;
		int number , result = 1 , i = 1 ;
		
		while(true) {
			
			System.out.print(i++ + ". say? :");
			number = sc.nextInt() ;
			
			if(number == 1)
				break;
			if(number == 0) {
				result = 0 ;
				break ;
			}
			result *= number ;
			
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void divided() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Ka? adet say? gireceksiniz :");
		int counter = sc.nextInt() ;
		double number , result = 0.0 ;
		
		for(int i = 1 ; i <= counter ; i++) {
			
			System.out.print(i + ". say? :");
			number = sc.nextDouble() ;
			
			if(i != 1 && number == 0) {
				
				System.out.println("B?leni 0 giremezsiniz.");
				continue ;
			}
			
			if(i == 1) {
				result = number ;
				continue ;
			}
			result /= number ;
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void power() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Taban de?eri giriniz :");
		int base = sc.nextInt() ;
		System.out.print("?s de?eri giriniz :");
		int exponent = sc.nextInt() ;
		int result = 1 ;
		
		for(int i = 1 ; i <= exponent ; i++) {
			
			result *= base ;
			
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void factorial() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Say? giriniz :");
		int n = sc.nextInt() ;
		int result = 1 ;
		
		for(int i = 1 ; i <= n ; i++) {
			
			result *= i ;
			
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void modding() {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Ka? adet say? gireceksiniz : ");
		int counter = sc.nextInt() ;
		double number , result = 0.0 ;
		
		for(int i = 1 ; i <= counter ; i++) {
			
			System.out.print(i + ". say? :");
			number = sc.nextDouble() ;
			
			if(i != 1 && number == 0) {
				
				System.out.println("B?leni 0 giremezsiniz.");
				continue ;
			}
			
			if(i == 1) {
				result = number ;
				continue ;
			}
			result %= number ;
		}
		System.out.println("Sonu? : " + result);
	}
	
	static void areaPerimeter() {
		
		Scanner sc = new Scanner(System.in) ;
		double length1 , length2 , area , perimeter ;
		
		System.out.print("Birinci kenar uzunlu?unu giriniz : ");
		length1 = sc.nextDouble() ;
		System.out.print("?kinci kenar uzunlu?unu giriniz : ");
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
	
	String menu = "1- Toplama ??lemi\n"
			+ "2- ??karma ??lemi\n"
			+ "3- ?arpma ??lemi\n"
			+ "4- B?lme ??lemi\n"
			+ "5- ?sl? Say? Hesaplama\n"
			+ "6- Faktoriyel Hesaplama\n"
			+ "7- Mod Alma\n"
			+ "8- Dikd?tgen Alan ve ?evre Hesab?\n"
			+ "0- ??k?? Yap" ;
	
	
	do {
		
		System.out.println(menu);
		System.out.print("L?tfen bir i?lem se?iniz :");
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
			System.out.println("Yanl?? bir de?er girdiniz, tekrar deneyiniz.");
		
		}
		
	}while(select != 0) ;
	
	
}
}
