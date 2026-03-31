package Medios;

import java.util.Scanner;

public class Exercicio28 {
    //Leia uma matriz 3x3 e calcule a soma dos elementos.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j]; 
            }
        }
        System.out.println("Soma dos elementos: " + soma);
        sc.close();
    }
}
