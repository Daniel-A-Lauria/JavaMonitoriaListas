import java.util.Scanner;

public class ExercicioLoop5 {
    public static void main(String[] args) throws Exception {
        //Leia 5 números e informe se todos são positivos.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean Positividade = true;
        for (int i = 0; i < 5; i++) {
           System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= 0) {
                Positividade = false;
                break;
            }          
        }      
        if (Positividade) {
            System.out.print("Todos os números são positivos!");
        }
        else {
            System.out.print("Há um número negativo");
        }
        sc.close();
    }
}