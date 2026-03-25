import java.util.Scanner;

public class ExercicioLoop12 {
    public static void main(String[] args) throws Exception{
    //Leia 10 números e reorganize o vetor colocando: primeiro os pares depois os ímpares (mantendo a ordem original entre eles)
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int a = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                pares[a] = numeros[i];
                a++;
            } else {
                impares[b] = numeros[i];
                b++;
            }
        }
        sc.close();
    }
}
