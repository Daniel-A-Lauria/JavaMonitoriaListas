package Faceis;

import java.util.Scanner;

public class Exercicio18 {
    //Leia 5 números e conte quantos são maiores que 100.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int contador = 0; 
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > 100) {
                contador++;
            }
        }
        System.out.println(contador + "números são maiores que 100");
        sc.close();
    }
}
