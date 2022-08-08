import java.util.Scanner;

public class Manav_Kasa_Programi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Armut Kaç Kilo ? : ");
	int armut = sc.nextInt() ;
	
	System.out.println("Elma Kaç Kilo ? : ");
	int elma = sc.nextInt() ;
	
	System.out.println("Domates Kaç Kilo ? : ");
	int domates = sc.nextInt() ;
	
	System.out.println("Muz Kaç Kilo ? : ");
	int muz = sc.nextInt() ;
	
	System.out.println("Patlýcan Kaç Kilo ? : ");
	int patlican = sc.nextInt() ;
	
	double armutKilo = 2.14 ;
	double elmaKilo = 3.67 ;
	double domatesKilo = 1.11 ;
	double muzKilo = 0.95 ;
	double patlicanKilo = 5 ;
	
	double toplam = armut*armutKilo + elma*elmaKilo + domates*domatesKilo + muz*muzKilo + patlican*patlicanKilo ;
	
	System.out.println("Toplam Tuta : " + toplam + " TL");
		
		
		
		

	}

}
