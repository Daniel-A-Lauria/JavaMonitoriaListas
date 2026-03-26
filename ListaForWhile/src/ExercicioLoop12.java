import java.util.Scanner;

public class ExercicioLoop12 {
    public static void main(String[] args) throws Exception{
    //Leia 10 números e reorganize o vetor colocando: primeiro os pares depois os ímpares (mantendo a ordem original entre eles)
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contaPar = 0;
        int contaImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                pares[contaPar] = numeros[i];
                contaPar++;
            } else {
                impares[contaImpar] = numeros[i];
                contaImpar++;
            }
        }

        for (int i = 0; i < contaPar; i++) {
            numeros[i] = pares[i];
        }
        for (int i = 0; i < contaImpar; i++) {
        numeros[contaPar + i] = impares[i];
        }
        sc.close();
        for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
        }
    }
}
