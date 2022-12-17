// Desafio: Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.

// Entrada: A entrada será o nome de três pessoas (clientes do banco).

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class FilaDoBanco {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner scan = new Scanner(System.in);
        String nome;


        for (int i = 0; i < nomesFila.length; i++) {
            nome = scan.next();
            nomesFila[i] = nome;
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
        }
    }
}



