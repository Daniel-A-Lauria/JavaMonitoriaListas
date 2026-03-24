import java.util.Scanner;

public class ExercicioSel3 {
    //Faça um algoritmo que leia um número inteiro e mostre se ele é par ou ímpar.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        }  
        else {
            System.out.println("O número é ímpar");
        }
    }
}
