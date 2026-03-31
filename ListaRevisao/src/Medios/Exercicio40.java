package Medios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio40 {
    //Leia um vetor e conte quantas vezes um valor aparece.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            contador = 0;
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]){
                        contador++;
                    }
                }
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }    
}
