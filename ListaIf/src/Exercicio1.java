import java.util.Scanner;

public class Exercicio1 {
    //Faça um algoritmo que leia três números inteiros e mostre a soma entre eles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o número 2: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o número 3: ");
        int num3 = sc.nextInt();
        System.out.println(num1 + num2 + num3);
        sc.close();
    }
    }