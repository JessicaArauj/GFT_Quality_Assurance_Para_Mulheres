import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

      
        int produto = 1;
        int soma = 0;
        int resultado = 0;
        
        for (int number : ints){
            produto*= number;
            soma += number;
        }
        System.out.println(produto - soma);
        
    }
}