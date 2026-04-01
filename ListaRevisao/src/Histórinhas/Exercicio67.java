package Histórinhas;

import java.util.Scanner;

public class Exercicio67 {
//A sequência de Sequência de Fibonacci é uma das mais famosas da matemática.
// Ela é definida da seguinte forma:
// Os dois primeiros valores são:
// fib(0) = 1
// fib(1) = 1
// A partir disso:
// cada termo é a soma dos dois anteriores
// 📌 Definição matemática:
// f(0)=1,  f(1)=1,  f(n)=f(n−1)+f(n−2)f(0)=1,\;f(1)=1,\;f(n)=f(n-1)+f(n-2)f(0)=1,f(1)=1,f(n)=f(n−1)+f(n−2)
// 📌 Objetivo:
// Dado um número inteiro N, você deve calcular e exibir o N-ésimo termo da sequência de Fibonacci.
// 📌 Entrada:
// Um único número inteiro N
// 📌 Saída:
// O valor do termo fib(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(1);
            } else {
            long[] fib = new long[n + 1]; 
            fib[0] = 1;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        System.out.println(fib[n]);
        }
        sc.close();
    }
}
