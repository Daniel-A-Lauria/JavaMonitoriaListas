package Faceis;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio19 {
    //Leia 5 números e substitua negativos por 0.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();   
            if (numeros[i] < 0){
                numeros[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }
}
