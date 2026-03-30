package Faceis;

import java.util.Scanner;

public class Exercicio13 {
    //Leia dois números e mostre o resultado das operações (+, -, *, /).
    
public class Calculadora {
    //a e b n importam pra depois
    static int somar(int a, int b){ 
        return a + b;
    }
    static int subtrair(int a, int b){
        return a - b;
    }
    static int multiplicar(int a, int b){
        return a * b;
    }
    static int dividir(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        y = sc.nextInt();
                System.out.println(somar(x, y));
                System.out.println(subtrair(x, y));
                System.out.println(multiplicar(x, y));
                System.out.println(dividir(x, y));        
        sc.close();
        }
    }
}


