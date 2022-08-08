import java.util.Scanner;

public class ATM_Projesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
  
	String userName , password ;
	
	int right = 3 , balance = 1500 , select ;
	
	while(right > 0) {
		
		System.out.println("Kullanýcý Adýnýz :");
		userName = sc.nextLine() ;
		System.out.println("Parolanýz :");
		password = sc.nextLine() ;
		
		if(userName.equals("patika") && password.equals("dev123")) {
			
			System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
			
			do {
				
				System.out.println("1-Para yatýrma\n" +
				        "2-Para Çekme\n" + 
						"3-Bakiye Sorgula\n" +
				        "4-Çýkýþ Yap" );
				
				System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
				select = sc.nextInt() ;
				
				switch(select) {
				
				case 1 : 
					System.out.println("Para miktarý : ");
					int price = sc.nextInt() ;
					balance += price ;
					
				case 2 :
					System.out.println("Para miktarý : ");
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
			
			System.out.println("Tekrar görüþmek üzere.");
			break ;
		}
			else {
				
				right-- ;
				System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
				
				switch(right) {
				
				case 0 : 
					System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
				default :
					System.out.println("Kalan Hakkýnýz : " + right);
				}
			}
		}
		
	
	
	
	
	
	
}
}
