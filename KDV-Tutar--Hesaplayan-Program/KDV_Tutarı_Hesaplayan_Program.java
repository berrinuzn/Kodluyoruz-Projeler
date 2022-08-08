import java.util.Scanner;

public class KDV_Tutarý_Hesaplayan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("KDV'siz fiyat = ");
	int KDVsiz = sc.nextInt() ;
	
	double KDVtutarý ;
	double KDVli ;
	
	if(KDVsiz > 0 && KDVsiz <= 1000) {
		
		 KDVtutarý = (double)KDVsiz*18/100 ;
		 KDVli = KDVsiz + KDVtutarý ;
		
	}
	else {
		
	    KDVtutarý =(double) KDVsiz*8/100 ;
		KDVli = KDVsiz + KDVtutarý ;
		
	}
	
	System.out.println("KDV'li Fiyat = " + KDVli);
	System.out.println("KDV tutarý = " + KDVtutarý);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
