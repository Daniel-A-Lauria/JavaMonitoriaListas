package Histórinhas;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio70 {
// Seu objetivo é criar um programa que receba uma sequência de números inteiros e os imprima em ordem crescente (do menor para o maior).
// 📌 Entrada:
// Um número inteiro N, representando a quantidade de elementos
// Uma linha com N números inteiros, separados por espaço
// 📌 Saída:
// Uma única linha contendo os N números ordenados em ordem crescente
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos o vetor tem?: ");
        int qtdElementos = sc.nextInt(); 
        int[] numeros = new int[qtdElementos];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }
}
