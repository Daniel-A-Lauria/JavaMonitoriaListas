package Faceis;

import java.util.Scanner;

public class Exercicio4 {
    //Leia um número e mostre sua tabuada (1 a 10).
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = sc.nextInt();
    System.out.println(numero);
    System.out.println(numero * 2);
    System.out.println(numero * 3);
    System.out.println(numero * 4);
    System.out.println(numero * 5);
    System.out.println(numero * 6);
    System.out.println(numero * 7);
    System.out.println(numero * 8);
    System.out.println(numero * 9);
    System.out.println(numero * 10);
    sc.close();
    }
}
