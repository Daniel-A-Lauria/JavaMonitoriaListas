import java.util.Scanner;

public class ExercicioSel8 {
    //Faça um algoritmo que leia um número inteiro entre 1 e 7 e mostre o dia da semana correspondente (1 = domingo, 2 = segunda-feira, etc.).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();
        sc.close();
        if (dia == 1) {
            System.out.println("Hoje é Domingo");
        }
        if (dia == 2) {
            System.out.println("Hoje é Segunda");
        }
        else if (dia == 3) {
            System.out.println("Hoje é Terça");
        }
        else if (dia == 4) {
            System.out.println("Hoje é Quarta");
        }
        else if (dia == 5) {
            System.out.println("Hoje é Quinta");
        }
        else if (dia == 6) {
            System.out.println("Hoje é Sexta");
        }
        else if (dia == 7) {
            System.out.println("Hoje é Sábado");
        }
        else {
            System.out.println("Inválido");
        }
    }
}