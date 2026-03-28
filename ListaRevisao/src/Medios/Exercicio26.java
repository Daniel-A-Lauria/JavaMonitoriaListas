package Medios;
import java.util.Scanner;
public class Exercicio26 {
    //Leia 10 números e conte pares e ímpares.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contaPar = 0;
        int contaImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                pares[contaPar] = numeros[i];
                contaPar++;
            } else {
                impares[contaImpar] = numeros[i];
                contaImpar++;
            }
        }
        System.out.println("Existem " + contaPar + " pares e " + contaImpar + " impares.");
        sc.close();
    }
}
