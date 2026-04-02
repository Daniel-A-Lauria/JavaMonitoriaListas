package Histórinhas;

import java.util.Scanner;

public class Exercicio68 {
//Em um sorteio, um participante realiza o seguinte processo:
// Primeiro, ele sorteia um número inteiro N
// Depois, ele sorteia N valores inteiros, em sequência
// A pontuação do participante é definida como:
// 👉 o tamanho da maior sequência de valores iguais consecutivos

// 🧠 Exemplo explicado
// Se o participante sorteou:
// 30, 30, 30, 30, 40, 40, 40, 40, 40, 30, 30
// Existem 4 valores consecutivos 30
// Depois 5 valores consecutivos 40
// Depois 2 valores consecutivos 30
// 👉 Mesmo que o número 30 apareça mais vezes no total, não estão todos juntos
// ✔ Portanto, a maior sequência consecutiva é 5

// 📌 Entrada:
// Um número inteiro N (quantidade de valores)
// Um vetor com N números inteiros, separados por espaço

// 📌 Saída:
// Um único número inteiro:
// 👉 o tamanho da maior sequência de valores iguais consecutivos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos valores serão sorteados");
        int valores = sc.nextInt();
        int[] sorteio = new int[valores];
        int maiorSequencia = 1; 
        int contador = 1;
        for (int i = 0; i < valores; i++) {
        sorteio[i] = sc.nextInt();  
        }
        for (int i = 0; i < valores - 1; i++) {
        if (sorteio[i] == sorteio[i + 1]) {
        contador++;
        } else {
        if (contador > maiorSequencia) {
        maiorSequencia = contador;
            }
            contador = 1;
        }
    }
        if (contador > maiorSequencia) {
        maiorSequencia = contador;
    }
        System.out.println();
        sc.close();
    }
}
