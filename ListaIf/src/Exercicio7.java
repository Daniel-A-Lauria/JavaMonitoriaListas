import java.util.Scanner;
public class Exercicio7 {
    //Faça um algoritmo que leia um número inteiro e mostre o seu sucessor e antecessor.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.println(numero + 1);
        System.out.println(numero - 1);
    }
}
