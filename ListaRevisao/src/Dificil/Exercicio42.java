import java.util.Arrays;
import java.util.Scanner;

public class Exercicio42 {
    //Leia um vetor e separe pares e ímpares em outro vetor.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contPar = 0; 
        int contImpar = 0; 
        int[] pares = new int[5];
        int[] impares = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPar] = numeros[i];
                contPar++;
            } else {
                impares[contImpar] = numeros[i];
                contImpar++;
            }
        }
        System.out.println("Pares: " + Arrays.toString(pares));
        System.out.print("Impares: " + Arrays.toString(impares));
        sc.close();
    }
}
//variavel que só enche quando tem um par ou um impar
