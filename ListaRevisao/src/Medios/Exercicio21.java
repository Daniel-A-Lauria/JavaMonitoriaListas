package Medios;

import java.util.Scanner;

public class Exercicio21 {
    //Leia 10 números e calcule a média dos pares.
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
    int somaPares = 0;
    int contPares = 0; 
    for (int i = 0; i < 10; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = sc.nextInt();
        if (numeros[i] % 2 == 0) {
            somaPares += numeros[i];
            contPares++;
            }
        }
    System.out.println("A média dos pares é: " + (somaPares/contPares));
    sc.close();
    }
}
