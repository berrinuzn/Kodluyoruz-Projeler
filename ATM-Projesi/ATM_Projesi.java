import java.util.Scanner;

public class ATM_Projesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	String userName , password ;
	
	int right = 3 , balance = 1500 , select ;
	
	while(right > 0) {
		
		System.out.println("Kullan�c� Ad�n�z :");
		userName = sc.nextLine() ;
		System.out.println("Parolan�z :");
		password = sc.nextLine() ;
		
		if(userName.equals("patika") && password.equals("dev123")) {
			
			System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
			
			do {
				
				System.out.println("1-Para yat�rma\n" +
				        "2-Para �ekme\n" + 
						"3-Bakiye Sorgula\n" +
				        "4-��k�� Yap" );
				
				System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
				select = sc.nextInt() ;
				
				switch(select) {
				
				case 1 : 
					System.out.println("Para miktar� : ");
					int price = sc.nextInt() ;
					balance += price ;
					
				case 2 :
					System.out.println("Para miktar� : ");
					int price1 = sc.nextInt() ;
					if(price1 > balance) {
						System.out.println("Bakiye yetersiz.");
					} 
					else {
						balance -= price1 ;
					}
					
				case 3 :
					System.out.println("Bakiyeniz : " + balance);
				
				}
				
			}while(select != 4);
			
			System.out.println("Tekrar g�r��mek �zere.");
			break ;
		}
			else {
				
				right-- ;
				System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
				
				switch(right) {
				
				case 0 : 
					System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
				default :
					System.out.println("Kalan Hakk�n�z : " + right);
				}
			}
		}
		
	
	
	
	
	
	
}
}
