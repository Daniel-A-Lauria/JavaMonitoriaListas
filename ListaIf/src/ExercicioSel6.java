import java.util.Scanner;

public class ExercicioSel6 {
    //Faça um algoritmo que leia dois números inteiros e mostre o resultado da multiplicação entre eles, se ambos forem positivos; ou a soma, se pelo menos um deles for negativo.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o numero 2: ");
        int numero2 = sc.nextInt();
        sc.close();

        if (numero1 >= 0 && numero2 >= 0) {
            System.out.println(numero1 * numero2);
        }
        else {
            System.out.println(numero1 + numero2);
        }
}
}