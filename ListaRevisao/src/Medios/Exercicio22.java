package Medios;
import java.util.Scanner;
public class Exercicio22 {
    //Leia 10 números e informe a posição do maior valor.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.print("Digite um número: ");
        numeros[0] = sc.nextInt();        
        int maior = 0;
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior) {
                maior = i;
                }
            }       
        System.out.println("maior valor: index" + maior);
        sc.close();
    }
}

