package bloque16;



public class TestArray {
	public static void main(String[] args) {
		int matriz[][]=new int[4][2];
		
		int matrizMultidimensional[][] =new int [4][];
		matrizMultidimensional[0] = new int[2];
		matrizMultidimensional[1] = new int[5];
		matrizMultidimensional[2] = new int[1];
		matrizMultidimensional[3] = new int[7];
		
		int matrizMultidimensional2[][]= { 
				{3,4},
				{1,2,7,4,5},
				{1},
				{9,8,10,6}
				};
		
		// primer array
				
		for (int i = 0; i < matrizMultidimensional.length; i++) {
			for (int j = 0; j < matrizMultidimensional[i].length; j++) {
				System.out.print(matrizMultidimensional[i][j] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		//segundo array
		
		for (int i = 0; i < matrizMultidimensional2.length; i++) {
			for (int j = 0; j < matrizMultidimensional2[i].length; j++) {
				System.out.print(matrizMultidimensional2[i][j] + " | ");
			}
			System.out.println(" ");
		}
		
		
	}
}

