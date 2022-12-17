//Desafio: Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
//Entrada: A entrada consiste em três números inteiros que representam a idade das pessoas.
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class MediaDeIdade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        int somaIdades = idade1 + idade2 + idade3;
        int mediaIdades = somaIdades / 3;

        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("Jovem!");
        }
        if (mediaIdades >= 26 && mediaIdades <= 60) {
            System.out.println("Adulta!");
        }
        if (mediaIdades > 60) {
            System.out.println("Idosa!");
        }
    }
}