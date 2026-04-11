package operadoresJava;

//classe Scanner importada;

import java.util.Scanner;

public class EstudosOperadores {
  public static void main(String[] args) {

      //objeto de entrada Scanner

      Scanner entrada = new Scanner(System.in);

      //variáveis declaradas
      double valorA;
      double valorB;

      //usuário, digite o valor de A
      System.out.println("digite o primeiro número");
      valorA = entrada.nextDouble();

      //usuário, digite o valor de B
      System.out.println("digite o segundo número");
      valorB = entrada.nextDouble();

      if (valorB == 0){
          System.out.println("digite um valor diferente de zero");
          valorB = entrada.nextDouble();
      }

      //avaliar se A e B são positivos
      if (valorA > 0 && valorB > 0){
          System.out.println("Ambos são positivos");
      }

      //operadores aritméticos
      double resultadoSoma = (valorA + valorB);
      double resultadoSubtracao = (valorA - valorB);
      double resultadoMultiplicacao = (valorA * valorB);
      double resultadoDivisao = (valorA / valorB);
      double resultadoModulo = (valorA % valorB);

      //resultados das operações aritméticas
      System.out.println("soma "  + resultadoSoma );
      System.out.println("subtração " + resultadoSubtracao );
      System.out.println("multiplicação " + resultadoMultiplicacao );
      System.out.println("divisão " + resultadoDivisao );
      System.out.println("módulo " + resultadoModulo);

      //operadores relacionais >que ou ==à
      if (valorA > valorB){
         System.out.println("A é maior que B");
     }
     else if (valorA == valorB){
         System.out.println("A é igual a B");
      }
     else {
         System.out.println("B é maior que A");
     }

     //verificando valores ímpar e par
      if (valorA % 2 == 0 && valorB % 2 == 0) {
          System.out.println("ambos são pares");
      }
      else if (valorA % 2 != 0 && valorB % 2 != 0) {
          System.out.println("ambos são ímpares");
      }
      else if (valorA % 2 == 0 && valorB % 2 != 0){
          System.out.println("valorA é par e o valorB é ímpar");
      }
      else{
          System.out.println("valorA é ímpar e valorB é par");
      }

      //operador lógico OU/OR
      if (valorA > 10 || valorB > 10 ){
          System.out.println("pelo menos um número é maior que 10 ");
      }

      //operadores de incremento e decremento
      valorA++;
      System.out.println("novo valor de A " + valorA);

      valorB--;
      System.out.println("novo valor de B " + valorB );





      }


  }


