package Medios;
import java.util.Scanner;

public class Exercicio40 {
    //Leia um vetor e conte quantas vezes um valor aparece.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean[] visto = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (visto[i]) {
                continue;
            }        
            int contador = 1;
                    for (int j = i + 1; j < numeros.length; j++) {
                        if (numeros[i] == numeros[j]){
                            visto[j] = true;
                            contador++;
                        }
                    } 
                    System.out.println(numeros[i] + " aparece " + contador + " vezes.");
                }
        sc.close();
    }
}
