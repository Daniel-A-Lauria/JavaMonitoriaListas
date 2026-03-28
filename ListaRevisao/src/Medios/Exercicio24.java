package Medios;
import java.util.Scanner;
public class Exercicio24 {
    //Leia um vetor e inverta os valores.
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] invertido = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        invertido[0] = numeros[4];
        invertido[1] = numeros[3];
        invertido[2] = numeros[2];
        invertido[3] = numeros[1];
        invertido[4] = numeros[0];
        for (int i = 0; i < invertido.length; i++){
            System.out.print(invertido[i]);
        }
        sc.close();
    }
}
