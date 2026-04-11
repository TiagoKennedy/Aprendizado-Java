
public class SistemaAluno {

	public static void main(String[] args) {
		
		
		
		String[] nome = {"Tiago", "Theo", "Davi"};
		double[] nota = {6, 8, 9};
		
		
		
		for (int i  = 0 ; i < 3; i++) {
			
			
	
			if(nota[i] >= 7) {
				System.out.println( nome [i] + " - Nota: " + nota [i] + " Aprovado! " );
				
			}else if (nota[i] >= 5 && nota[i] <7) {
				System.out.println( nome [i] + " - Nota: " + nota [i] + " Recuperação! ");
				
				}else {
					System.out.println( nome [i] + " - Nota: " + nota [i] + " Reprovado! ");
				}
		}
		
		
		

	}
}

