package Capitulo1.Exercicios;

import java.util.Scanner;

public class IMC
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua altura -> ");
        double altura = entrada.nextDouble();

        System.out.print("Informe seu peso -> ");
        double peso = entrada.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("IMC é %.2f", imc);

        entrada.close();
    }
}
