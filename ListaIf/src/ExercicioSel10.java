import java.util.Scanner;

public class ExercicioSel10 {
    // Faça um algoritmo que leia a idade de uma pessoa e mostre a sua classificação, de acordo com a seguinte tabela:
    //* até 9 anos: mirim
    //* 10 a 13 anos: infantil
    //* 14 a 17 anos: juvenil
    //* maiores de 18 anos: adulto
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.close();

        if (idade <= 9) {
            System.out.println("Você é Mirim!");
        }
        else if (idade >= 10 && idade <= 13){
            System.out.println("Você é Infantil!");
        }
        else if (idade >= 14 && idade <= 17){
            System.out.println("Você é juvenil");
        }
        else if (idade >= 18) {
            System.out.println("Você é adulto...");
        }
    }
}
