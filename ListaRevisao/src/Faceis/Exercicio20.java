package Faceis;

import java.util.Scanner;

public class Exercicio20 {
    //Crie uma função que recebe um número e retorna seu dobro.
    static int duplicar(int a){ 
        return a*2;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        duplicar(numero);
        System.out.println(numero);
        sc.close();
    }
}
