package Faceis;
import java.util.Scanner;
public class Exercicio9 {
    //Leia 5 números e mostre o menor.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.print("Digite um número: ");
        numeros[0] = sc.nextInt();        
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println(menor);
        sc.close();
    }
}
