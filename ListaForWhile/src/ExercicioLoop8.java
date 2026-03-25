import java.util.Scanner;

public class ExercicioLoop8 {
        public static void main(String[] args) throws Exception{
        //Leia 10 números e encontre o maior e o menor valor sem usar variáveis prontas (Math).
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }    
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
        }
            if (numeros[i] > menor) {
                menor = numeros[i];
        }
        System.out.println("maior valor: " + maior);
        System.out.println("menor valor: " + menor);
        sc.close();
        }
    }
}