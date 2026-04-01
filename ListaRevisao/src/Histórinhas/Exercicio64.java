package Histórinhas;

import java.util.Scanner;

public class Exercicio64 {
    //Faça um programa que leia dois valores inteiros A e B e calcule a média inteira entre eles.
    //A média inteira significa que o resultado deve ser um número inteiro (ou seja, a divisão deve descartar a parte decimal).
    //📌 Entrada:
    //Um número inteiro A
    //Um número inteiro B
    //📌 Saída:
    //Um único valor inteiro representando a média entre A e B
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.print("Digite um número: ");
        int numero2 = sc.nextInt();
        int media = (numero + numero2) / 2;
        System.out.println(media);
        sc.close();
    } 
}
