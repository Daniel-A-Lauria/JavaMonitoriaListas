import java.util.Scanner;
public class Exercicio43 {
    //Leia uma matriz e verifique se é simétrica.
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean simetria = true;
        System.out.print("Digite a 'altura': ");
        int x = sc.nextInt();
        System.out.print("Digite a 'largura': ");
        int y = sc.nextInt();
        int[][] matriz = new int[x][y];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) { 
                System.out.print("Digite um número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
            if (matriz[i][j] != matriz[j][i]){
                simetria = false;
                break; 
                }
            if (!simetria) break; 
            }
        }
        if (simetria) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }    
        sc.close();
    }
}
