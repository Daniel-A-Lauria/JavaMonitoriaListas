import java.util.Scanner;

public class ExercicioLoop2 {
        public static void main(String[] args) throws Exception {
        //Leia 8 números e exiba apenas os que estão entre 10 e 30.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 10 && numeros[i] <= 30) {
                System.out.print(numeros[i]);
            }
        }
        sc.close();
    }
}
