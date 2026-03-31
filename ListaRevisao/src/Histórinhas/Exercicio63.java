package Histórinhas;

import java.util.Scanner;

public class Exercicio63 {
//Sistema de Lâmpadas no Hotel
// O quarto possui dois interruptores:
// I1 → altera apenas o estado da lâmpada A (se estiver apagada, acende; se estiver acesa, apaga)
// I2 → altera o estado das duas lâmpadas (A e B) ao mesmo tempo
// Inicialmente, as duas lâmpadas estão apagadas.
// Seu amigo decidiu fazer uma brincadeira: ele vai pressionar os interruptores 
// várias vezes, em uma determinada sequência, e você precisa
// descobrir como ficam as lâmpadas no final.
// 📌 Entrada:
// Um número inteiro N, representando quantas vezes os interruptores foram pressionados
// Um vetor com N valores, onde:
// 1 representa que o interruptor I1 foi pressionado
// 2 representa que o interruptor I2 foi pressionado
// 📌 Saída:
// Na primeira linha, imprima:
// 1 se a lâmpada A estiver acesa
// 0 se estiver apagada
// Na segunda linha, imprima:
// 1 se a lâmpada B estiver acesa
// 0 se estiver apagada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vezes o Interruptor foi apertado?: ");
        int apertosInt = sc.nextInt(); 
        int[] numeroApertos = new int[apertosInt];
        boolean lampA = false;
        boolean lampB = false;
        for (int i = 0; i < numeroApertos.length; i++){
            System.out.println("Qual Interruptor apertar? (1 pra I1, 2 pra I2): ");
            numeroApertos[i] = sc.nextInt();
            if (numeroApertos[i] == 1) {
                lampA = !lampA;
            }
            else if (numeroApertos[i] == 2) {
                lampA = !lampA;
                lampB = !lampB;
            }
            else {
                System.out.println("número inválido!");
            }
        }
        sc.close();
        System.out.println("Resultado:");
        System.out.println(lampA ? 1 : 0);
        System.out.println(lampB ? 1 : 0);
    }
}
