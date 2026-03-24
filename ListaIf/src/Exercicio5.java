import java.util.Scanner;

public class Exercicio5 {
    //Faça um algoritmo que leia a idade de uma pessoa em anos e mostre a idade em dias
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade ");
        double Idade = sc.nextDouble();
        double ano = 365.25;
        sc.close();
        System.out.println(Idade*ano);   
    }
}
