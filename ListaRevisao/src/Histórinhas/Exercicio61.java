package Histórinhas;

import java.util.Scanner;

public class Exercicio61 {
    //Uma escola registrou notas de 10 alunos.
    //📌 Entrada:
    //vetor de notas
    //📌 Saída:
    //média
    //quantos aprovados (> 6)
    //maior nota
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.print("Digite uma nota: ");
        numeros[0] = sc.nextInt();        
        int somador = 0;
        int passou = 0;
        int maior = 0;
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            somador += numeros[i];
            if (numeros[i] > maior) {
                maior = i;
                }
            if (numeros[i] > 6) {
                passou++;
            }
        }       
        System.out.println("maior nota: " + maior + " média: " + (somador/10) + " Pessoas que passaram: " + passou);
        sc.close();
    }
}
