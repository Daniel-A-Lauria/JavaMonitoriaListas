import java.util.Scanner;

public class Exercicio8 {
    // Faça um algoritmo que leia o número de dias trabalhados por um funcionário e o valor da sua diária e calcule o seu salário.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os dias trabalhados: ");
        double DiasTrabalhados = sc.nextDouble();
        System.out.print("Digite o valor da diária: ");
        double Diaria = sc.nextDouble();
        sc.close();

        System.out.println(DiasTrabalhados * Diaria);
}
}