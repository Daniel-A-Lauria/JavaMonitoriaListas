package Histórinhas;

import java.util.Scanner;

public class Exercicio66 {
//Gabriel inventou um código para representar números naturais usando uma sequência de zeros e uns.
// A regra é a seguinte:
// 👉 Um número natural é representado pela quantidade de vezes que o padrão "100" aparece na sequência.
// Seu objetivo é ajudar Gabriel a descobrir quantas vezes esse padrão aparece em uma sequência fornecida.
// 📌 Entrada:
// Um número inteiro N, representando o tamanho da sequência
// Uma linha com N valores (0 ou 1), separados por espaço
// 📌 Saída:
// Um único número inteiro:
//  👉 quantidade de vezes que o padrão "100" aparece na sequência
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in); 
        int contador = 0;
        System.out.print("Digite o tamanho da sequência: ");
        int tamanhoSeq = sc.nextInt();
        int[] numeros = new int[tamanhoSeq];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("1 ou 0: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length-3; i++){
            if (numeros[i] == 1 && numeros[i+1] == 0 && numeros[i+2] == 0){
                contador++;
            }
        }
        System.out.println(contador);
        sc.close();
    }
}
