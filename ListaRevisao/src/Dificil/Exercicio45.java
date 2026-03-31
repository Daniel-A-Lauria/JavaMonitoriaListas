import java.util.Scanner;
public class Exercicio45 {
    //Leia 10 números e encontre o valor mais frequente.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int valorFrequente = 0;
        int maiorFrequencia = 0;
        boolean[] visto = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (visto[i]) {
                continue;
            }        
            int contador = 1;
                    for (int j = i + 1; j < numeros.length; j++) {
                        if (numeros[i] == numeros[j]){
                            visto[j] = true;
                            contador++;
                        }
                        if (contador > maiorFrequencia) {
                        maiorFrequencia = contador;
                        valorFrequente = numeros[i];
                    } 
                }
        }        
        sc.close();
        System.out.println("O valor mais frequente é: " + valorFrequente +  " (apareceu " + maiorFrequencia + " vezes)");
    }
}