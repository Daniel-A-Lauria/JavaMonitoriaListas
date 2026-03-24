import java.util.Scanner;

public class ExercicioSel2 {
    //Faça um algoritmo que leia três números inteiros e mostre o menor deles.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o numero 2: ");
        int numero2 = sc.nextInt();
        System.out.print("Digite o numero 3: ");
        int numero3 = sc.nextInt();
        sc.close();

        if (numero1 > numero3 && numero2 > numero3) {
            System.out.println(numero3);
        }
        else if (numero1 > numero2 && numero3 > numero2){
            System.out.println(numero2);
        }
        else if (numero2 > numero1 && numero3 > numero1){
            System.out.println(numero1);
        }
    }
}
