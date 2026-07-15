/*
 * Calculadora de IMC
 * 
 * O Índice de Massa Corporal (IMC) 
 * Calcula se o peso está adequado para a sua altura.
 * 
 * Fórmula:
 * IMC = peso / (altura * altura)
 *
 * Tabela de classificação da Organização Mundial da Saúde (OMS):
 *
 * IMC (kg/m²)          Classificação                  Risco de Doenças
 * ------------------------------------------------------------------------
 * Menor que 18,5       Abaixo do peso                 Alto
 * 18,5 a 24,9          Peso normal                    Baixo
 * 25,0 a 29,9          Sobrepeso                      Elevado
 * 30,0 a 34,9          Obesidade Grau I               Muito alto
 * 35,0 a 39,9          Obesidade Grau II              Severo
 * 40,0 ou mais         Obesidade Grau III (Grave)     Muito severo
 *
 * Fonte: Organização Mundial da Saúde (OMS).
 */

package projetos.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {
	
	public static void main (String[]args) {
		
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Informe o seu nome : ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe a sua altura (m) (use ponto. Ex.: 1.75) : ");
		double altura = entrada.nextDouble();
		
		System.out.println("Informe o seu peso (kg) (use ponto. Ex.: 64.7) : ");
		double peso = entrada.nextDouble();
		
		System.out.printf("%nNome: %s%nAltura: %.2f m%nPeso: %.1f kg%n",
				nome, altura, peso);
		
		double imc = peso/(altura*altura);
		System.out.printf("Seu IMC é: %.2f%n", imc);
		
		if(imc < 18.5) {
        System.out.println("Você está abaixo do peso.");			
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Você está com o peso ideal.");
		}
		else if(imc <= 29.9) {
			System.out.println("Você está com sobrepeso.");
		}
		else if(imc <= 34.9) {
			System.out.println("Você está com obesidade Grau I");
		}
		else if(imc <=39.9) {
			System.out.println("Você está com obesidade Grau II");
		}
		else {
			System.out.println("Você está com obesidade Grau III");
	}
		
		entrada.close();
		}
	}
	

