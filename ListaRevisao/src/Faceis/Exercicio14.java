package Faceis;
import java.util.Scanner;
public class Exercicio14 {
    //Leia uma idade e informe a categoria:
    //Criança
    //Adolescente
    //Adulto
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero <= 12) {
            System.out.print("Criança!");
        }
        if (numero > 12 && numero <= 17) {
            System.out.print("Adolescente!");
        }
        if (numero >= 18) {
            System.out.print("Adulto!");
        }
        sc.close();
    }
}
