package Exercicios;

import java.util.Scanner;

public class AreaQuadrado {
    Scanner scan =  new Scanner(System.in);
    float lado, area;

    public void calcularArea(){
        System.out.print("Olá, informe a medida do lado do quadrado que deseja saber a área: ");
        lado = scan.nextFloat();

        area = lado * lado;
        }

        public void imprimirArea(){
            System.out.println("A área do quadrado é: " + area);
        }

        public static void main(String[] args) {
            AreaQuadrado areaQuadrado = new AreaQuadrado();
            areaQuadrado.calcularArea();
            areaQuadrado.imprimirArea();
        }
}
