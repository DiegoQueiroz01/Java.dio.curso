package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Exercicios.Cinema;

import java.util.Scanner;

public class Ingresso {
    Scanner scan = new Scanner(System.in);
    private String nomeFilme;
    private double valor;
    private String dublado;
    
    public Ingresso(String nomeFilme, double valor, String dublado) {
        this.nomeFilme = nomeFilme;
        this.valor = valor;
        this.dublado = dublado;
    }
    
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String isDublado() {
        return dublado;
    }

    public void setDublado(String dublado) {
        this.dublado = dublado;
    }
}
