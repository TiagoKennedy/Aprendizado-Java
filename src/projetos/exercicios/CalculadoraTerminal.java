package estruturasDecisao;

import java.util.Scanner;

public class EscolhaOperacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor1;
		double valor2;
		char operacao;	
		char continuar = 's';
		
		while (continuar == 's') {
		
			
			
		System.out.println("digite o primeiro número");
		valor1 = entrada.nextDouble();
		
		
		System.out.println("digite a operação desejada '+', '-', '*', '/' ");
		operacao = entrada.next().charAt(0);
		
		
		System.out.println("digite o segundo número");
		valor2 = entrada.nextDouble();
		
		
		
		if (operacao == '+') {
			System.out.println(valor1 + " " + operacao + " " + valor2 + " = "  + (valor1 + valor2));
			
		}else if(operacao == '-') {
			System.out.println(valor1 + " " + operacao + " " + valor2 + " = "  + (valor1 - valor2));
			
		}else if(operacao == '*') {
			System.out.println(valor1 + " " + operacao + " " + valor2 + " = "  + (valor1 * valor2));
		
		}else if(operacao == '/') {
			if (valor2 == 0) {
				System.out.println("erro,não é possível dividir por zero");
			}else {
				System.out.println(valor1 + " " + operacao + " " + valor2 + " = "  + (valor1 / valor2));
			}
			
		}else{
				System.out.println("operação inválida!");
			}
		
		System.out.println("deseja continuar? (s/n) " );
		continuar = entrada.next().charAt(0);
		
		
		}
		
		entrada.close();
			
		System.out.println("fim da execução do programa!");
		
	}
}	
		
		
		
		
	


