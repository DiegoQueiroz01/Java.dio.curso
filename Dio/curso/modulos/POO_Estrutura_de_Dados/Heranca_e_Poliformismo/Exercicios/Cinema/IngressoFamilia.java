package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Exercicios.Cinema;

import java.util.Scanner;

public class IngressoFamilia extends Ingresso{
    Scanner scan = new Scanner(System.in);
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, String dublado, int numeroPessoas){
        super(nomeFilme, valor, dublado);
        this.numeroPessoas = numeroPessoas; //atributo especifico da classe.
    }

    public void IngressoFamilia(){
        System.out.print("Digite quantos ingressos você deseja: ");
        numeroPessoas = scan.nextInt();
    }

    @Override
    public double getValor() {
        double valorTotal = super.getValor() * this.numeroPessoas;

        if (this.numeroPessoas > 3) {
            valorTotal = valorTotal * 0.95;
        }
        return valorTotal;
    }
    public int getNumeroPessoas(){
        return numeroPessoas;
    }
}
