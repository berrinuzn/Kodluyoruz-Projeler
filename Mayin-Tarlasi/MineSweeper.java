import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	Scanner sc = new Scanner(System.in);
	
	int rowNumber ;
	int colNumber ;
	int size ;
	int[][] board ;
	int[][] map ;
	boolean game = true;
	int success = 0 ;
	
	Random random = new Random();
	
	public MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.board = new int[rowNumber][colNumber];
		this.map = new int[rowNumber][colNumber];
		this.size = rowNumber*colNumber;
	}

	void putMine() {
		
		int rRow , rCol , count = 0 ;
		while(count != (size/4)) {
			
			rRow = random.nextInt(rowNumber);
			rCol = random.nextInt(colNumber);
			
			if(map[rRow][rCol] != -1) {
				
				map[rRow][rCol] = -1;
				count++;
				
			}
			
		}
		
	}

	void run() {
		
		putMine();
		System.out.println("Oyun Ba�lad� !");
		int row , col ;
		
		while(game) {
			print(board);
			System.out.print("Sat�r : ");
			row = sc.nextInt();
			System.out.print("S�tun : ");
			col = sc.nextInt();
			if(row < 0 || row >= rowNumber) {
				System.out.println("Ge�ersiz koordinat !");
				continue;
			}
			if(col < 0 || col >= colNumber) {
				System.out.println("Ge�ersiz koordinat !");
				continue;
			}
			if(map[row][col] != -1) {
				
				check(row,col);
				success++ ;
				
				if(success == (size - (size/4))) {
					System.out.println("Ba�ard�n�z !");
					break;
				}
				
				}else {
				
				game = false;
				System.out.println("Oyun Bitti !");
				
			}
			
		}
		
	}
	
	void check(int row,int coulumn) {
		
		if(map[row][coulumn] == 0) {
			
			if( (coulumn < colNumber-1) && (map[row][coulumn+1]) == -1 ) {
				
				board[row][coulumn]++;
				
			}
			if( (row < rowNumber-3) && (map[row+1][coulumn]) == -1 ) {
				
				board[row][coulumn]++;
				
			}
			if( (row > 0) && (map[row-1][coulumn]) == -1 ) {
				
				board[row][coulumn]++;
				
			}
			if( (coulumn > 0) && (map[row][coulumn-1]) == -1 ) {
				
				board[row][coulumn]++;
				
			}
			if ((row > 0) && (coulumn < colNumber-1) && map[row - 1][coulumn + 1] == -1) {
	                board[row][coulumn]++;
	            }
			 if ((coulumn < colNumber-1) && (row < rowNumber-1) && map[row + 1][coulumn + 1] == -1) {
	                board[row][coulumn]++;
	            }
			 if ((row > 0) && (coulumn > 0) && map[row - 1][coulumn - 1] == -1) {
	                board[row][coulumn]++;
	            }
			 if ((row < rowNumber-1) && (coulumn > 0) && map[row + 1][coulumn - 1] == -1) {
	                board[row][coulumn]++;
	            }
			
			if(board[row][coulumn] == 0) {
				
				board[row][coulumn] = -2 ;
				
			}
			
		}
		
	}
	
	void print(int[][] arr) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = 0 ; j < arr[0].length ; j++) {
				
				if(arr[i][j] >= 0)
					System.out.print(" ");
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
}
