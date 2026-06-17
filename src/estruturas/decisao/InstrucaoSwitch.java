package estruturasDecisao;

import java.util.Scanner;


public class InstrucaoSwitch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in, "UTF-8");
		
		
		 String diasDaSemana = ("");	
		 
	 
		System.out.println("Digite o dia da semana : ");
        diasDaSemana = entrada.nextLine();
	 
         
	 switch(diasDaSemana.toLowerCase()) {
	 
	 case "domingo" :
		 System.out.println("vamos à praia!");	
		 break;
		 
	 case "segunda" :
		 System.out.println("iniciamos a rotina semanal.");
		 break;
		 
	 case "terca" :	
	 case "terça" :
		 System.out.println("Há terapias na ONG para Davi e terapias no Altino Ventura. ");
		 System.out.println("Levar Davi para creche após as terapias. ");
		 System.out.println("Levar Theo para o curso às 14h.");
		 System.out.println("Buscar Theo às 17h e logo após Davi às 17h30min.");
         break;
		 
	 case "quarta" :
		 System.out.println("meio da semana.");
		 break;
		 
	 case "quinta" :
		 System.out.println("terapias na Fundação Altino Ventura.");
		 break;
		 
	 case "sexta" :
		 System.out.println("encerramento das atividades semanais.");
		 break;
		 
	 case "sabado" :
	 case "sábado" :
		 System.out.println("dia de levar as crianças para brincarem.");
		 break;
		 
		 default :
			 System.out.println("dia inválido!");
			 
	 }
	 
			 entrada.close();
	 

	}

	}


