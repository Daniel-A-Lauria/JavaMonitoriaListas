package Histórinhas;

import java.util.Scanner;

public class Exercicio65 {
//Alice e Bia criaram um site com informações sobre o macaco-prego-de-peito-amarelo, uma espécie em extinção. 
// A página mostra como as pessoas podem ajudar a preservar o habitat natural do animal.
// Uma empresa gostou tanto da iniciativa que prometeu dar um prêmio para que elas continuem com projetos semelhantes. Porém, existe uma condição:
// 👉 O prêmio será entregue quando o número total de acessos ao site atingir 1.000.000 (um milhão).
// Você deve ajudar a descobrir em quantos dias isso aconteceu.
// 📌 Entrada:
// Um número inteiro N, representando a quantidade de dias
// Em seguida, N linhas, cada uma com um número inteiro A, representando a quantidade de acessos naquele dia
// 📌 Saída:
// Um único número inteiro:
// 👉 a quantidade de dias necessários para que a soma dos acessos atinja 1.000.000 ou mais
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int soma = 0; 
        System.out.print("Digite a quantia de dias: ");
        int dias = sc.nextInt();
        int[] acessos = new int[dias];
        for (int i = 0; i < acessos.length; i++){
            System.out.println("Quantas pessoas acessaram?: ");
            acessos[i] = sc.nextInt();
            soma += acessos[i];
        }
        int diasNecessarios = (1000000 - soma)/dias;
        System.out.println("faltarão: " + diasNecessarios + " dias.");
        sc.close();
    } 
}
