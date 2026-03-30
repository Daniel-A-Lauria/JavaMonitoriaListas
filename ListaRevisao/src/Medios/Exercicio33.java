package Medios;

import java.util.Scanner;

public class Exercicio33 {
    //Leia 10 números e conte quantos são maiores que a média.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int somador = 0;
        int acimaMedia = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            numeros[i] += somador;        
        }
        for (int i = 0; i < numeros.length; i++){
            if ((somador/10) > numeros[i]){
                acimaMedia++; 
            }
        }
        System.out.println("Números acima da média: " + acimaMedia);
        sc.close();
    }
}
