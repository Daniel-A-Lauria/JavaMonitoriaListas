package Faceis;
import java.util.Scanner;
public class Exercicio10 {
    //Leia 5 números e conte quantos são positivos.
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contPositivo = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > 0) {
                contPositivo++;
            }
        }    
        System.out.println("Existem " + contPositivo + " números positivos.");
        sc.close();
    }
}
