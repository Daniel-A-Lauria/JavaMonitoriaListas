package Faceis;

import java.util.Scanner;

public class Exercicio3 {
    //Leia 3 números e exiba a média.
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[3];
    for (int i = 0; i < 3; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = sc.nextInt();
        }
    System.out.println("A média é " + (numeros[0] + numeros[1] + numeros[2])/numeros.length);
    sc.close();
    }
}
