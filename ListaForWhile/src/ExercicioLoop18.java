import java.util.Scanner;

public class ExercicioLoop18 {
    //Uma loja registrou o valor de 10 compras feitas no dia.
    //O gerente quer:
    //Saber quantas compras foram acima de R$100
    //Calcular o valor médio das compras
    //Verificar se houve alguma sequência de 3 compras consecutivas com valores crescentes
    //📌 Entrada: Vetor com 10 valores (double)
    //📌 Saída: Quantidade de compras > 100
    //Média
    //Se existe sequência crescente (true/false)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compras[]  = new double[10];
        double somador = 0;         
        int aumento = 0;
        int contador = 0;        
        for (int i = 0; i < compras.length; i++) {
           System.out.print("Digite um número: ");
            compras[i] = sc.nextDouble();
            somador += compras[i];            
            if (compras[i] > 100) {
                contador++;            
            }
        }   
        for (int i = 0; i < compras.length-2; i++){
            if (compras[i] < compras[i+1] && compras[i+1] < compras[i+2]){
                aumento = 1;
            }
        }
        if (aumento == 1){
            System.out.print("Houveram " + contador + " compras acima de 100 reais. " + 
            "A média das compras é: " + (somador/10) + ". E houveram aumentos consecutivos."
            );
        }
        else {
            System.out.print("Houveram " + contador + " compras acima de 100 reais." + 
            "A média das compras é: " + (somador/10) + ". E não houve aumentos consecutivos."
        );
        }
        sc.close();
    }
}
