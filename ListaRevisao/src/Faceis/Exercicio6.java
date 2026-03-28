package Faceis;

import java.util.Scanner;

public class Exercicio6 {
    //Leia um número e conte regressivamente até 0.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }    
}
