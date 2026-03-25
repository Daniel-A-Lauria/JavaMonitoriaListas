import java.util.Scanner;

public class ExercicioLoop1 {
    public static void main(String[] args) throws Exception {
        //Leia 10 números e informe quantos são maiores que 50
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int grande = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 50) {
                grande++;
            }
        }
        System.out.print(grande + " números são maiores que 50");
        sc.close();
    }
}
