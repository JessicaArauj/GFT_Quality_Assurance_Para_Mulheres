// Descrição: Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de e n .

// Entrada: A entrada consiste em um int, do qual podemos calcular seu menor multiplo.


// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class MenorMultiplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
            minimoMultiplo = numero;
        } else {
            minimoMultiplo = numero * 2;
        }
        System.out.println("O resultado eh:" + minimoMultiplo);
    }
}