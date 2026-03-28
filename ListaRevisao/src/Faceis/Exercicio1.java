package Faceis;

import java.util.Scanner;

public class Exercicio1 {
    //Leia um número e informe se ele é par ou ímpar.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.print("O número é par");
        }
        else {
            System.out.print("O número é ímpar");
        }
        sc.close();
    }
}
