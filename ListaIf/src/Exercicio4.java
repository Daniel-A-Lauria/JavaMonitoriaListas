import java.util.Scanner;

public class Exercicio4 {
    //Faça um algoritmo que leia três números reais e mostre a média ponderada entre eles, com pesos 2, 3 e 5, respectivamente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o numero 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite o numero 3: ");
        double n3 = sc.nextDouble();
        sc.close();
        
        int p1 = 2;
        int p2 = 3;
        int p3 = 5;

        double media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
        System.out.println(media);
    }
}
