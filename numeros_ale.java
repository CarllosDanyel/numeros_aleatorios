package aleatorio_q;
import java.util.Arrays;

public class numeros_ale {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = (int) (Math.random() * 19999) - 9999;
        }

        // Imprime os números na ordem que foram gerados
        System.out.println("\nNúmeros gerados:\n");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Imprime o vetor em ordem crescente
        int[] numbersCrescente = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbersCrescente);
        System.out.println("\nVetor em ordem crescente:\n");
        for (int number : numbersCrescente) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Imprime o vetor em ordem decrescente
        System.out.println("\nVetor em ordem decrescente:\n");
        for (int i = numbersCrescente.length - 1; i >= 0; i--) {
            System.out.print(numbersCrescente[i] + " ");
        }
        System.out.println();
    }
}