package Faceis;

import java.util.Scanner;

public class Exercicio5 {
    //Leia um número e conte de 1 até ele usando for.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
