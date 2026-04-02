package Histórinhas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio69 {
//Bino quer calcular a área de um círculo e pediu sua ajuda.
// Você deve criar um programa que leia um valor real R, representando o raio do círculo, e calcule sua área.
// 📌 Fórmula da área do círculo:
// A=πR2A = \pi R^2A=πR2
// rrr
// A=πr2≈28.27A = \pi r^2 \approx 28.27A=πr2≈28.27
// C=2πr≈18.85C = 2\pi r \approx 18.85C=2πr≈18.85
// r = 3.00
// 👉 Considere:
// π = 3.1416
// 📌 Entrada:
// Um número real R (raio do círculo)
// 📌 Saída:
// Um único valor representando a área do círculo
// O resultado deve ter 2 casas decimais
// 💡 Dicas de lógica:
// Leia o valor como double ou float
// Use a fórmula: area = 3.1416 * R * R
// Formate a saída para duas casas decimais
// 💻 Exemplo:
// Entrada:
// 2.00
// Saída:
// 12.57
// 👉 Explicação:
//  3.1416 × 2² = 3.1416 × 4 = 12.5664 → arredondado = 12.57
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double R = sc.nextDouble();
        double area = 3.1416 * (R * R); 
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println("Area: " + df.format(area)); 
        sc.close();
    }
}
