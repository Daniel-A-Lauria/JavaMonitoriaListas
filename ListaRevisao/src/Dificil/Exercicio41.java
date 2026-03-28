import java.util.Arrays;
import java.util.Scanner;
public class Exercicio41 {
    static void sortuah(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; //key =?
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    //Ordene um vetor sem usar função pronta. (Dica: Algoritmo de Sort)
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        sortuah(numeros);
        System.out.print(Arrays.toString(numeros));
        sc.close();
    }
}
