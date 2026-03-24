import java.util.Scanner;

public class Exercicio10 {
    //Faça um algoritmo que leia o peso de uma pessoa em quilos e converta para libras.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso em KG: ");
        double Kilo = sc.nextDouble();
        sc.close();
        System.out.println(Kilo*2.205);
}
}