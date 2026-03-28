package Medios;
import java.util.Scanner;
public class Exercicio25 {
    //Leia 10 números e verifique se há repetidos.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
           System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.print("Existem Números Repetidos! " + numeros[j]);
                }          
            }      
        sc.close();
        }
    }
}
