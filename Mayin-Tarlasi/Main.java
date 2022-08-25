import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Mayýn tarlasý oyununa hoþ geldiniz !");
	
	System.out.print("Satýr giriniz : ");
	int row = sc.nextInt();
	
	System.out.print("Sütun giriniz : ");
	int col = sc.nextInt();
		
	MineSweeper m = new MineSweeper(row,col);	
	m.run();
		
	}

}
