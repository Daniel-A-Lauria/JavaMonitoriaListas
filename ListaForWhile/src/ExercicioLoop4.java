import java.util.Scanner;

public class ExercicioLoop4 {
    public static void main(String[] args) throws Exception {
        //Leia 10 números e conte quantos são múltiplos de 3.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.print(numeros[i]);
            }
        }
        sc.close();
    }
}
