package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Exercicios.TipoUsuarios;

import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Gerente gerente = new Gerente("Diêgo","@diego","2345");
        Vendedor vendedor = new Vendedor("Milena", "@mila", "6789");
        Atendente atendente = new Atendente("Sther", "@sther", "4567");

        gerente.Relatorio();
        vendedor.registVenda(vendedor.getQuantVendas());
        atendente.receberPagamento();
    }
}
