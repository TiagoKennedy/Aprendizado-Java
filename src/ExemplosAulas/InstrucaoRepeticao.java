package ExemplosAulas;

public class InstrucaoRepeticao {

	public static void main(String[] args) {
		
		
		 // Exemplo de FOR - imprime números de 1 a 5
        
		System.out.println("Exemplo FOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
      
        
        // Exemplo de FOR-EACH
        
        System.out.println("Exemplo FOR-EACH: ");       
        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros) {
            System.out.println(num);
        }
        
        
         // Exemplo de WHILE - imprime números de 1 a 5
        System.out.println("\nExemplo WHILE:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        
    
       // Exemplo de DO-WHILE - imprime números de 1 a 5
        System.out.println("\nExemplo DO-WHILE:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }

        
      }


	




