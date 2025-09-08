package Exercicios;

import java.util.Scanner;

public class AreaRetangulo {
    Scanner scan = new Scanner(System.in);
    float base, altura, area;

    public void calcularAreaRetangulo(){
        System.out.print("Olá, informe a medida da base do retângulo: ");
        base = scan.nextFloat();
        System.out.print("Informe a altura do retângulo: ");
        altura = scan.nextFloat();

        area = base * altura;
    }

    public void imprimirAreaRetangulo(){
        System.out.println("A área do retângulo é dada por: " + area + "cm²");
    }

    public static void main(String [] args){
        AreaRetangulo areaRetangulo = new AreaRetangulo();
        areaRetangulo.calcularAreaRetangulo();
        areaRetangulo.imprimirAreaRetangulo();
    }
}
