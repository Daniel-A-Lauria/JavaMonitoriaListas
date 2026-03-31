import java.util.Scanner;

public class Exercicio44 {
    //Leia uma matriz e calcule a soma das diagonais.
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
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][y - 1 - i];
        }
        System.out.println("Soma Principal: " + somaPrincipal);
        System.out.println("Soma Principal: " + somaSecundaria);
        sc.close();
    }
}