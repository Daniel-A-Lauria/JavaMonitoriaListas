import java.util.Scanner;

public class ExercicioLoop9 {
     public static void main(String[] args) throws Exception{
    //Leia 10 números e conte quantos estão acima da média.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        double somador = 0;         
        for (int i = 0; i < 10; i++) {
           System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            somador += numeros[i];
        }
        double media = somador / 10;
        int AcimaMedia = 0; 
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > media) {
                    AcimaMedia++;
            }
        }
        System.out.print("Números acima da média: " + AcimaMedia);        
        sc.close();             
    }
}                                     

