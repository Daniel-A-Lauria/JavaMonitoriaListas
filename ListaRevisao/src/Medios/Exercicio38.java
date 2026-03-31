package Medios;

import java.util.Scanner;

public class Exercicio38 {
    //Crie uma função que calcula média de um vetor.
    public static int mediaVetor(int[] numeros) {
        int soma = 0;
        int quantiaVetor = 0; 
         for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }    
        int média = soma /= quantiaVetor;
        return média;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do Vetor");
        int x = sc.nextInt();
        int[] numeros = new int[x];        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(mediaVetor(numeros));
    }
}

