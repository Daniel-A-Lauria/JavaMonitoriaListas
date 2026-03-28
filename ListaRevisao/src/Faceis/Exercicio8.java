package Faceis;

import java.util.Scanner;

public class Exercicio8 {
    //Leia 5 números e mostre o maior.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.print("Digite um número: ");
        numeros[0] = sc.nextInt();        
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println(maior);
        sc.close();
    }
}