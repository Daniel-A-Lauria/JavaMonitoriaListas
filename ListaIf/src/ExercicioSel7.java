import java.util.Scanner;

public class ExercicioSel7 {
    //Faça um algoritmo que leia o salário de um funcionário e calcule o seu novo salário com um aumento de 10% se o salário for menor que R$ 1000,00; 
    // ou de 5% se o salário for maior ou igual a R$ 1000,00.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário ");
        double salario = sc.nextDouble();
        sc.close();
        if (salario < 1000.00){
            System.out.println(salario * 1.1);
        }
        else {
            System.out.println(salario * 1.05);
        }
    }
}
