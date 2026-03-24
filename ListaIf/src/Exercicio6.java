import java.util.Scanner;

public class Exercicio6 {
        //Faça um algoritmo que leia o salário de um funcionário e calcule o seu novo salário com um aumento de 15%.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu Salario: ");
        Double Salario = sc.nextDouble();
        sc.close();
        System.out.println(Salario * 1.15);
    }
}
