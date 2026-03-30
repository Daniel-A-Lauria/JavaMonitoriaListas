package Faceis;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio16 {
    //Leia um vetor de 5 posições e mostre os valores.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }
}
