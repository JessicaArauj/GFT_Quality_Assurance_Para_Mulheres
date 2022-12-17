// Desafio: Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

// Entrada: A entrada consiste em um caractere(char) M , N ou V que informará o turno em que você estuda.

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class QualTurno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        }
        if (turno == 'V') {
            System.out.println("Boa Tarde!");
        }
        if (turno == 'N') {
            System.out.println("Boa Noite!");
        }
        if (turno == 'T') {
            System.out.println("Valor Invalido!");
        }
    }
}