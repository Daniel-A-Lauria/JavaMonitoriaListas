import java.util.Scanner;

public class Exercicio2 {
    //Faça um algoritmo que leia um número inteiro e mostre o seu dobro, triplo e quadruplo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = sc.nextInt();
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(num * 4);
        sc.close();
    }
}
