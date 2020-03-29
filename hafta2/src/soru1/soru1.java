package soru1;

public class soru1 {

	public static void main(String[] args) {
		// create matrix
		int[][] matrix = {   
				
                {1,0,1},	
                {1,1,0},
                {1,0,1}
            }; 
		
		int[][] nMatrix = new int[matrix.length][matrix[0].length];
		int lifeCell = 0;
		
		for(int i = 0 ; i < matrix.length  ; i++) {
			
			for(int j = 0 ; j < matrix[0].length  ; j++) {
				
				
				if(i > 0 && j > 0) {
					
					if(i == matrix.length -1 && j == matrix[0].length-1) {
						
						lifeCell = matrix[i][j-1] + matrix[i-1][j];
					}
				
					else if(i < matrix.length -1 && j == matrix[0].length -1) {
						
						lifeCell = matrix[i][j-1] + matrix[i-1][j];
						
					}
					
					else if(i == matrix.length -1  && j < matrix[0].length -1)
					{
						lifeCell = matrix[i][j-1] + matrix[i][j+1] + matrix[i-1][j];
					}
					else
						lifeCell = matrix[i][j+1] + matrix[i][j-1] + matrix[i+1][j] + matrix[i-1][j];
			
		}
               else if(i == 0 && j < matrix[0].length) {
					
					if(j == matrix.length -1) {
						
						lifeCell = matrix[i][j-1] + matrix[i+1][j];

					}
					else if(j==0){
						
						
						lifeCell = matrix[i][j+1] + matrix[i+1][j]; 
					}
					else
						
						lifeCell = matrix[i][j-1] + matrix[i][j+1] + matrix[i+1][j];
				}
				
				else
					if(i > 0 && j == 0) {
						
						if(i==matrix.length-1) {
							
							lifeCell = matrix[i-1][j] + matrix[i][j+1];
						}
						else
							
							lifeCell = matrix[i-1][j] + matrix[i][j+1];
					}
				
				
				if(matrix[i][j] == 1) {
					
					if(lifeCell < 2 )
						
						nMatrix[i][j] = 0;
					
					else if(lifeCell == 2 || lifeCell == 3) 
						
						nMatrix[i][j] = 1;
						
					else if(lifeCell > 3)
						
						nMatrix[i][j] = 0;

				}
				else
					
					nMatrix[i][j]  = 1;
										
		}
		}
		
		outin.InMatrix(matrix);
		outin.OutMatrix(nMatrix);
		 
		
		
			
	}



}
