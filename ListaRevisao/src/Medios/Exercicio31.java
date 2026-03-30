package Medios;
import java.util.Scanner;
public class Exercicio31 {
     //Leia 10 números e verifique se estão em ordem crescente.
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
    int contador = 0; 
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = sc.nextInt();
    }    
    for (int i = 0; i < numeros.length-1; i++) {
    if(numeros[i+1] > numeros[i]) {
            contador++;
            }
        }
    if (contador == 9) {
        System.out.println("A ordem é crescente");
    }
    else {
        System.out.println("A ordem não é crescente");
    }
    sc.close();
    }
}
