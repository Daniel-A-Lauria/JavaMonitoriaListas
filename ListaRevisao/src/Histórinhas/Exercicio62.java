package Histórinhas;

import java.util.Scanner;

public class Exercicio62 {
    //Frequência de Alunos
    //📌 Entrada:
    //vetor de presenças (1/0)
    //📌 Saída:
    //total de presenças
    //faltas
    //percentual
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int presenças = 0;
        int faltas = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite 1 para presença, digite 0 para falta: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                faltas++;
            }
            else {
                presenças++;
            }
        }       
        System.out.println("total de presenças: " + presenças + " faltas: " + faltas + " porcentagem: " + (presenças/10)*100 +"");
        sc.close();
    }
}
