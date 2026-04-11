package estruturasDecisao;

import java.util.Scanner;

public class EstudosCondicionais {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int idadeUsuario;
		
		
		System.out.println("usuário, digite sua idade por favor!");
		idadeUsuario = entrada.nextInt();
		
		
		if (idadeUsuario < 0){
			System.out.println("idade inválida");
			}
		
		else if (idadeUsuario <= 12){
			System.out.println("usuário é criança");
		}
		
		else if (idadeUsuario < 18){
			System.out.println("usuário é adolescente");
		}
		
		
		else if(idadeUsuario < 60){
			System.out.println("usuário é adulto");
		}
		
		else {
		System.out.println("usuário é idoso");
	}
		
		
	}	

}
