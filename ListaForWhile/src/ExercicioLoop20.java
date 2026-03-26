import java.util.Scanner;

public class ExercicioLoop20 {
    //Um cliente teve seu saldo registrado ao longo de 10 dias.
    //O banco quer analisar:
    //Quantos dias o saldo ficou negativo
    //O maior saldo já atingido
    //Se o cliente ficou 3 dias consecutivos no negativo
    //📌 Entrada:
    //Vetor com 10 valores (saldo diário)
    //📌 Saída:
    //Quantidade de dias negativos
    //Maior saldo
    //Se houve sequência de 3 dias negativos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoDiario[]  = new double[10];
        double maiorSaldo = 0;        
        int sequenciaNeg = 0;
        int contador = 0;        
        for (int i = 0; i < saldoDiario.length; i++) {
           System.out.print("Digite um número: ");
            saldoDiario[i] = sc.nextDouble();          
            if (saldoDiario[i] < 0) {
                contador++;            
            }
            if (saldoDiario[i] > maiorSaldo){
                maiorSaldo = saldoDiario[i];
            }
        }   
        for (int i = 0; i < saldoDiario.length-2; i++){
            if (saldoDiario[i] > saldoDiario[i+1] && saldoDiario[i+1] > saldoDiario[i+2]){
                sequenciaNeg = 1;
            }
        }
        if (sequenciaNeg == 1){
            System.out.print("Houveram " + contador + " dias negativos. " + 
            " O maior saldo foi: " +  maiorSaldo + ". E houveram 3 dias negativos consecutivos."
            );
        }
        else {
            System.out.print("Houveram " + contador + " dias negativos. " + 
            " O maior saldo foi: " + maiorSaldo + ". E não houveram 3 dias negativos consecutivos.");
        }
        sc.close();
    }
}
