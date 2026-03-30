package Faceis;
import java.util.Scanner;
public class Exercicio12 {
    //Leia um número e verifique se ele é múltiplo de 5.
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 5 == 0) {
            System.out.print("O número é multiplo de 5");
        }
        sc.close();
    }
}
