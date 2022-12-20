import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class NumeroFeliz {
    public static boolean ehNumeroFeliz(int n) {
        Set<Integer> numeros = new HashSet<>();

        while (!numeros.contains(n)) {
            numeros.add(n);

            int soma = 0;

            while (n != 0) {
                int temporario = n % 10;
                soma += temporario * temporario;
                n /= 10;
            }
            n = soma;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        System.out.println(ehNumeroFeliz(n));
    }
}