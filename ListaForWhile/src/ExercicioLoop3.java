import java.util.Scanner;

public class ExercicioLoop3 {
    public static void main(String[] args) throws Exception {
    //Leia 6 números e verifique se existe o número 0 no vetor.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                System.out.println("O número 0 existe no vetor");
            }
            else{
                System.out.println("O número 0 não existe no vetor");
            }
        }
        sc.close();
    }
}