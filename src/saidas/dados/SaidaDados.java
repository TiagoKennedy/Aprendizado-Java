package ExemplosAulas;

public class SaidaDados{
	
public static void main(String[]args) {



String produto = "mouse";
double preco = 12.50;
int estoque = 10;

System.out.println("O produto " + produto + " custa R$ " + preco + " e temos " + estoque + " unidades no estoque");


System.out.printf("O produto %s custa R$ %.2f e temos %d unidades no estoque", produto, preco, estoque);


// %s → Enxerga a variável produto (Texto).

// %.2f → Enxerga a variável preco (Número com vírgula).

// %d → Enxerga a variável estoque (Número inteiro).   

}

    }