import java.util.Scanner;

public class KDV_Tutar�_Hesaplayan_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("KDV'siz fiyat = ");
	int KDVsiz = sc.nextInt() ;
	
	double KDVtutar� ;
	double KDVli ;
	
	if(KDVsiz > 0 && KDVsiz <= 1000) {
		
		 KDVtutar� = (double)KDVsiz*18/100 ;
		 KDVli = KDVsiz + KDVtutar� ;
		
	}
	else {
		
	    KDVtutar� =(double) KDVsiz*8/100 ;
		KDVli = KDVsiz + KDVtutar� ;
		
	}
	
	System.out.println("KDV'li Fiyat = " + KDVli);
	System.out.println("KDV tutar� = " + KDVtutar�);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
