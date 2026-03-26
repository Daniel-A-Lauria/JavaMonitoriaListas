import java.util.Scanner;

public class ExercicioLoop17 {
    public static void main(String[] args) throws Exception{
        //Um laboratório registrou a temperatura de um experimento ao longo de 10 horas.
        //Os cientistas querem saber:
        //Se houve risco (temperatura acima de 80)
        //Quantas vezes a temperatura subiu em relação à hora anterior
        //Qual foi a maior queda de temperatura entre duas medições consecutivas
        //📌 Entrada:
        //10 valores de temperatura (vetor)
        //📌 Saída:
        //Quantas vezes ultrapassou 80
        //Quantas vezes aumentou
        //Maior queda registrada
        Scanner sc = new Scanner(System.in);
        int[] valoresHora = new int[10];
        int[] diferencas = new int[valoresHora.length - 1];
        int aumentos = 0;
        int risco = 0;
        int maiorQueda = diferencas[0];
        for (int i = 0; i < valoresHora.length; i++) {
           System.out.print("Digite um valor de temperatura: ");
            valoresHora[i] = sc.nextInt();
            if (valoresHora[i] > 80){
                risco++;
            }
        }
        for (int i = 0; i < valoresHora.length-1; i++) {
            diferencas[i] = valoresHora[i+1] - valoresHora[i];             
            if (valoresHora[i] < valoresHora[i+1]){
                aumentos++;
            }
            if (diferencas[i] < maiorQueda) {
                maiorQueda = diferencas[i];
            }
        }
        sc.close();
        System.out.print("A temperatura ultrapassou 80 graus " + risco + " vezes, e ela aumentou " + aumentos + " vezes. A maior queda registrada foi " + maiorQueda);
    }
}
