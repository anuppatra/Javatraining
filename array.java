package nik;

public class array {
	public static void main(String []ags){
		 int x[][]=new int[3][3];
		 int y[][]={{1,2,3},{4,5,6},{7,8,9}};
		 	for(int i=0;i<3;i++)
		 		for (int j=0;j<3;j++)
		 		{x[i][j]=i+j;
		 		}
		 	
		 	for(int i=0;i<3;i++){
		 		for(int j=0;j<3;j++)
		 			System.out.println(y+" ");
		 		System.out.println();
		 	}
		 	
		 	int [][] result = new int[x.length][y[0].length];

		 	
		 	for (int i = 0; i < x.length; i++) { 
		 	    for (int j = 0; j < y[0].length; j++) { 
		 	        for (int k = 0; k <x[0].length; k++) { 
		 	            result[i][j] += x[i][k] * y[k][j];
		 	        }
		 	    }
		 	}
		 	
		 	System.out.println(result);
	}
	
}
