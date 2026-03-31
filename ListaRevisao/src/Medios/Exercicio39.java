package Medios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio39 {
    //Leia 10 números e substitua os pares por -1.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();   
            if (numeros[i] % 2 == 0){
                numeros[i] = -1;
            }
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }
}
