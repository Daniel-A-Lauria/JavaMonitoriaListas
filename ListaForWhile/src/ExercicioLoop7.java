import java.util.Scanner;

public class ExercicioLoop7 {
        public static void main(String[] args) throws Exception{
        //Leia 10 números e informe quantos valores são iguais ao primeiro elemento.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int first = numeros[0];
        int repeats = 0;
        System.out.println("Digite um número: ");
        first = sc.nextInt();
        for (int i = 1; i < 10; i++) {
           System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] == first){
                repeats++;
            }
        }
        if (repeats >= 1) {
            System.out.println("O elemento (" + first + ") se repete " + repeats + " vezes");
        }
        else {
            System.out.println("O primeiro elemento não se repetiu.");
        }
        sc.close();
    }
}    

