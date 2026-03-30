package Faceis;
import java.util.Scanner;
public class Exercicio17 {
    //Leia um vetor e calcule a média.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0; 
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();   
            soma += numeros[i];
        }
        System.out.println("A média é" + soma/5);
        sc.close();
    }    
}
