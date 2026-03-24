import java.util.Scanner;

public class ExercicioSel4 {
    //Faça um algoritmo que leia a altura e o sexo de uma pessoa e mostre se ela está abaixo, dentro ou acima do peso ideal, 
    // utilizando as fórmulas do exercício 3 da lista de algoritmos sequenciais.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso (KG, use 'x,y' ao invés de 'x.y'): ");
        double Peso = sc.nextDouble();
        System.out.print("Digite a sua altura (M, use 'x,y' ao invés de 'x.y'): ");
        double Altura = sc.nextDouble();
        sc.close();
        double IMC = Peso / (Altura * Altura);

        if (IMC > 25) {
            System.out.println("Gordão!!!");
        }
        else if (IMC < 18){
            System.out.println("Palitinho!!!");
        }
        else {
            System.out.println("Super humano");   
        }
    }
}
