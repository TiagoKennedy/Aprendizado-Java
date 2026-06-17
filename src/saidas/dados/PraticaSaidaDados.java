package ExemplosAulas;

import java.io.PrintWriter;

public class PraticaSaidaDados {

    public static void main ( String[] args) {

        // --- NOSSOS DADOS ---
        String produto = "mouse";
        double preco = 12.50;
        int estoque = 10;

        // ==========================================
        // 1. SAÍDA COM println()
        // (Adiciona uma linha nova automaticamente ao final)
        // ==========================================
        System.out.println("--- USANDO PRINTLN ---");
        System.out.println("O produto " + produto + " custa R$ " + preco + " e temos " + estoque + " unidades no estoque");
        System.out.println(); // Pula linha em branco


        // ==========================================
        // 2. SAÍDA COM print() 
        // (Não pula linha, você precisa montar a frase aos poucos)
        // ==========================================
        System.out.println("--- USANDO PRINT ---");
        System.out.print("O produto ");
        System.out.print(produto);
        System.out.print(" custa R$ ");
        System.out.print(preco);
        System.out.print(" e temos ");
        System.out.print(estoque);
        System.out.println(" unidades no estoque"); // println aqui só para encerrar a linha
        System.out.println(); 


        // ==========================================
        // 3. SAÍDA COM printf()
        // (Usa máscaras %s, %f, %d para formatar)
        // ==========================================
        System.out.println("--- USANDO PRINTF ---");
        // %s = String | %.2f = Double com 2 casas | %d = Inteiro | %n = Pula linha
        System.out.printf("O produto %s custa R$ %.2f e temos %d unidades no estoque%n", produto, preco, estoque);
        System.out.println();


        // ==========================================
        // 4. SAÍDA COM PrintWriter
        // (Uma forma mais profissional e rápida de saída)
        // ==========================================
        System.out.println("--- USANDO PRINTWRITER ---");
        PrintWriter escritor = new PrintWriter(System.out, true);
        escritor.println("O produto " + produto + " custa R$ " + preco + " e temos " + estoque + " unidades no estoque");
        
    }
}