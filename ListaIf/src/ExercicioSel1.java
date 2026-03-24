import java.util.Scanner;

public class ExercicioSel1 {
    public static void main(String[] args) throws Exception {
        //Faça um algoritmo que leia dois números inteiros e mostre o maior deles.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o numero 2: ");
        int numero2 = sc.nextInt();
        sc.close();

        if (numero1 > numero2) {
            System.out.println(numero1);
        }
        else {
            System.out.println(numero2);
        }
    }
}
