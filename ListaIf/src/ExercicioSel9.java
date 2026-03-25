import java.util.Scanner;

public class ExercicioSel9 {
    //Faça um algoritmo que leia três números reais e mostre-os em ordem crescente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int c = sc.nextInt();
        sc.close();
        if (a > b && b > c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if (a > c && c > b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if (b > a && a > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if (b > c && c > a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if (a > c && c > b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        else if (a > c && c > b) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
