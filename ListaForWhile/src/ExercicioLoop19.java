import java.util.Scanner;

public class ExercicioLoop19 {
    //Um jogador teve sua pontuação registrada em 10 partidas.
    //O sistema precisa:
    //Identificar a maior pontuação
    //Contar quantas vezes ele bateu seu próprio recorde (superou todas as anteriores)
    //Verificar se houve alguma queda brusca (diferença maior que 50 pontos entre partidas)
    //📌 Entrada:
    //Vetor com 10 pontuações
    //📌 Saída:
    //Maior pontuação
    //Quantidade de recordes quebrados
    //Se houve queda brusca (sim/não)
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] pontuações = new int[10];
        int queda = 0;
        int HighScores = 0; 
        int HighestScore = 0; 
        for (int i = 0; i < pontuações.length; i++) {
            System.out.print("Digite um número: ");
            pontuações[i] = sc.nextInt();
            if (pontuações[i] > HighestScore) {
                HighestScore = pontuações[i];
                HighScores++;
            }
        }
        for (int i = 0; i < pontuações.length-1; i++){
            if (pontuações[i] - 50 > pontuações[i+1]){         
                queda = 1;
            }
        }
        sc.close();
        if (queda == 1) {
        System.out.println("o número de recordes quebrados foi: " + HighScores +
                         " O maior recorde foi: " + HighestScore + 
                         " Houveram quedas bruscas");
        }
        else {
        System.out.println("o número de recordes quebrados foi: " + HighScores +
                         " O maior recorde foi: " + HighestScore + 
                         " Não houveram quedas bruscas");
        }
    }
}
