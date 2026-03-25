import java.util.Scanner;

public class ExercicioLoop6 {
    public static void main(String[] args) throws Exception{
        //Leia 10 números e verifique se há números repetidos.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
           System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.print("Existem Números Repetidos! " + numeros[j]);
                }          
            }      
        sc.close();
        }
    }
}
