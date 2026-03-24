import java.util.Scanner;

public class Exercicio9 {
    //Faça um algoritmo que leia o preço de um produto e mostre o seu valor com desconto de 10%.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto ");
        double ValorProduto = sc.nextDouble();
        sc.close();
        System.out.println(ValorProduto/1.1);
}
}