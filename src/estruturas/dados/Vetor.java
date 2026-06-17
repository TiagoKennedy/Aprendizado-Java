package ExemplosAulas;

public class Vetor {

	public static void main(String[] args) {
		
		
		
		
		// Manipulação de vetor com o FOR;
		
		System.out.println("----------VETOR-----------");
		//int[] numeros = {1, 2, 3, 4, 5};
		
		int[] numeros = {1, 2, 3, 4, 5};
		for (int i = 0; i < numeros.length; i++) {
		    System.out.println(numeros[i]);
		}

	    //Manipulação de Matriz;
		
		System.out.println("-----------MATRIZ------------");
		int[][] matriz = {
			    {1, 2, 3},
			    {4, 5, 6}
			};
			System.out.println(matriz[0][1]);
			// acessa o elemento na primeira linha e segunda coluna
	
			
			
			// matriz usando repetições aninhadas;
			
			System.out.println("------Elementos da matriz usando repetições aninhadas------");
			for (int i = 0; i < matriz.length; i++) {
			    for (int j = 0; j < matriz[i].length; j++) {
			        System.out.print(matriz[i][j] + " ");
			    }
			    System.out.println();
			}

			
	
	
	
	
	
	
	
	}

}
