package Faceis;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
    //Leia 10 números e exiba apenas os pares
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPar = 0; 
        int[] pares = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPar] = numeros[i];
                contPar++;
            }
        } 
        System.out.println("Pares: " + Arrays.toString(pares));
        sc.close();
    }
}
