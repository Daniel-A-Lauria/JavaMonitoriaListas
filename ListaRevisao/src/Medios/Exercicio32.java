package Medios;
import java.util.Scanner;
public class Exercicio32 {
    //Leia 10 números e encontre o segundo maior.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.print("Digite um número: ");
        numeros[0] = sc.nextInt();        
        int maior = numeros[0];
        int SegMaior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
        }
            if (numeros[i] > SegMaior && numeros[i] < maior) {
                SegMaior = numeros[i];
        }
        }        
        System.out.println("Segundo maior valor: " + SegMaior);
        sc.close();
    }
}
