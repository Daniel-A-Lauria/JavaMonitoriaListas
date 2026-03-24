import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia o peso e a altura de uma pessoa e calcule o seu IMC (Índice de Massa Corporal).
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso (KG, use 'x,y' ao invés de 'x.y'): ");
        double Peso = sc.nextDouble();
        System.out.print("Digite a sua altura (M, use 'x,y' ao invés de 'x.y'): ");
        double Altura = sc.nextDouble();
        sc.close();
        
        System.out.print(Peso / (Altura * Altura));
    }
}
