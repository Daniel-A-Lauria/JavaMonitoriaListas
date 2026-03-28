package Faceis;
import java.util.Scanner;
public class Exercicio2 {
    //Leia dois números e mostre o maior.
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[2];
    for (int i = 0; i < 2; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = sc.nextInt();
        }
    if (numeros[0] > numeros[1]){
        System.out.print(numeros[0] + " é maior");
        }
    else {
        System.out.print(numeros[1] + "é menor");
        } 
        sc.close();
    }
}

