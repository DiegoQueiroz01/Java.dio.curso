package Exercicios;

import java.util.Scanner;

public class AnoNascimento {

    Scanner scan = new Scanner(System.in);
    int anoAtual = 2025;
    int idade, anoNascimento = 0;
    String nome;

    public void calcularIdade(){
        System.out.print("Olá, informe seu nome: ");
        nome = scan.nextLine();
        System.out.println("Muito prazer " + nome + ", por favor informe seu ano de nascimento: ");
        anoNascimento = scan.nextInt();
        idade = anoAtual - anoNascimento;
    }

    public void imprimirIdade(){
        System.out.printf("Você tem %d anos de idade.\n", idade);
    }

    public static void main(String [] args){
        AnoNascimento anoNascimento = new  AnoNascimento();
        anoNascimento.calcularIdade();
        anoNascimento.imprimirIdade();
    }
}
