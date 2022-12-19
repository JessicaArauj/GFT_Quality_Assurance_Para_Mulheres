import java.util.*;

public class Main {
    static int sumDigitSquare(int n) {
        int digit, sq = 0;
        while (n > 0) {
            digit = n % 10;
            sq += digit * digit;
            n /= 10;
        }
        return sq;
    }

    static boolean isHappy(int n) { // Retorna verdadeiro se n for um número feliz, senão retorna falso.
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(n);
        while (n != 0) { // Qual o critério de parada ???
            if (n == 1) return true;
            n = sumDigitSquare(n);
            if ((s.contains(n) && n != (int) s.toArray()[s.size() - 1])) return false;
            s.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        System.out.println(isHappy(n));
    }
}