package Medios;

import java.util.Scanner;

public class Exercicio30 {
    //Leia 10 números e calcule a soma dos ímpares
        public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
    int somaImpares = 0;
    for (int i = 0; i < 10; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = sc.nextInt();
        if (numeros[i] % 2 != 0) {
            somaImpares += numeros[i];
            }
        }
    System.out.println("A soma dos Impares é: " + (somaImpares));
    sc.close();
    }


}
