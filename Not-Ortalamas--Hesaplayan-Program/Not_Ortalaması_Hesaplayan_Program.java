import java.util.Scanner;

public class Not_Ortalamas�_Hesaplayan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("Matematik notunuzu giriniz : ");
	int matematikNotu = sc.nextInt() ;
	
	System.out.println("Fizik notunuzu giriniz : ");
	int fizikNotu = sc.nextInt() ;
	
	System.out.println("Kimya notunuzu giriniz : ");
	int kimyaNotu = sc.nextInt() ;
	
	System.out.println("T�rk�e notunuzu giriniz : ");
	int turkceNotu = sc.nextInt() ;
	
	System.out.println("Tarih notunuzu giriniz : ");
	int tarihNotu = sc.nextInt() ;
	
	System.out.println("M�zik notunuzu giriniz : ");
	int muzikNotu = sc.nextInt() ;
	
	double ortalama = (double)(fizikNotu + kimyaNotu + matematikNotu + muzikNotu + tarihNotu + turkceNotu) / 6 ;
	
	boolean x = ortalama > 60 ;
	
	String str = x ? "S�n�f� Ge�ti" : "S�n�fta Kald�" ;
	
	System.out.println(str);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
