package soru1;

public class outin {
public static void InMatrix(int[][] list) {
		
		
		System.out.println("Input");
		
		for(int i = 0; i < list.length ; i++ ) {
			
			for(int j = 0; j < list[0].length ; j++ ) {
				
				System.out.print(list[i][j]);
				
			}
			System.out.println("  ");
		}
		
		System.out.println();
		
	}
public static void OutMatrix(int[][] list) {
	
	
	System.out.println("Output");
	
	for(int i = 0; i < list.length ; i++ ) {
		
		for(int j = 0; j < list[0].length ; j++ ) {
			
			System.out.print(list[i][j]);
			
		}
		System.out.println(" ");
	}
}
}
