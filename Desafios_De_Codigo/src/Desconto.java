// Desafio: O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 

// Entrada: A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;
 
public class Desconto {

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    int X = (S*100)/M;
    
    System.out.println("O desconto foi de " + (100 - X) + "%");
    }
}