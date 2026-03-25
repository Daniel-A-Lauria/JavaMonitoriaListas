import java.util.Scanner;

public class ExercicioLoop10 {
    public static void main(String[] args) throws Exception{
    //Leia 8 números e verifique se o vetor é um palíndromo (igual de trás pra frente).
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        if ((numeros[0] == numeros[7]) && (numeros[1] == numeros[6]) && (numeros[2] == numeros[5]) && (numeros[3] == numeros[4])) {
            System.out.print("Este vetor é um palíndromo");
        }
        else {
            System.out.print("Este vetor NÃO é um palíndromo");
        }
        sc.close();
    }    
}
