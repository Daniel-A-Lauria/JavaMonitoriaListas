package Medios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio27 {
    //Leia 10 números e ordene em ordem crescente.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.print(Arrays.toString(numeros));
        sc.close();
    }
}
