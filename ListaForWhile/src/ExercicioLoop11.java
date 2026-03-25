import java.util.Scanner;

public class ExercicioLoop11 {
    //Leia 10 números e encontre a posição do menor valor.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.print("Digite um número: ");
        numeros[0] = sc.nextInt();       
        int menor = numeros[0];
        int menorIndex = 0;
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] < menor) {
                menor = numeros[i];
                menorIndex = i;
        }
        }        
        System.out.print("menor valor: " + menor + " posição: " + (menorIndex + 1));
        sc.close();
    }
}
