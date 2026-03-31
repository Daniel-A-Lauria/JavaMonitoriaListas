package Medios;
import java.util.Scanner;
public class Exercicio29 {
    //Leia uma matriz e mostre a diagonal principal.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Digite a 'altura': ");
        int x = sc.nextInt();
        System.out.println("Digite a 'largura': ");
        int y = sc.nextInt();
        int[][] matriz = new int[x][y];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite um número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }        
        System.out.println("Elementos da diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        sc.close();
    }
}
