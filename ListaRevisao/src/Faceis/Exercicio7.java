package Faceis;
import java.util.Scanner;
public class Exercicio7 {
    //Leia 5 números e calcule a soma.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeros[] = new int[5];
    for (int i = 0; i < 5; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = sc.nextInt();
        }
        System.out.print(numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]);
        sc.close();
    }
}
