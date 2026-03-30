package Medios;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio34 {
    //Leia dois vetores e some elemento a elemento.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];
    int[] numeros2 = new int[5];
    int[] somados = new int[5];
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("((Lista 1) Digite um número: ");
        numeros[i] = sc.nextInt();
    } 
    for (int i = 0; i < numeros2.length; i++) {
        System.out.print("((Lista 2) Digite um número: ");
        numeros2[i] = sc.nextInt();
    } 
    for (int i = 0; i < 5; i++) {
        somados[i] = numeros[i] += numeros2[i];
        } 
        System.out.println(Arrays.toString(somados));
        sc.close();
    }
}
