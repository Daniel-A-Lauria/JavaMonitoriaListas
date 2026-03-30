package Faceis;

import java.util.Scanner;

public class Exercicio15 {
    //Leia um número e verifique se ele está entre 10 e 50
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero >= 10 && numero <= 50) {
            System.out.print("Entre 10 e 50");
        }
        sc.close();
    }
}