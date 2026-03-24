import java.util.Scanner;

public class ExercicioSel5 {
    //Faça um algoritmo que leia um número inteiro e mostre se ele é múltiplo de 3 e de 5 ao mesmo tempo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é multiplo de 3 e 5 ao mesmo tempo");
        }  
        else {
            System.out.println("O número NÃO é multiplo de 3 e 5 ao mesmo tempo");
        }
    }
}
