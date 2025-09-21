package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Exercicios.TipoUsuarios;

import java.util.Scanner;

public class Vendedor extends Gerente{
    private boolean adm = false;
    private int quantVendas;

    Scanner scan = new Scanner(System.in);

    public Vendedor(String nome, String email, int senha){
        super(nome, email, senha);
    }
    //metódos de venda
    public void registVenda(int quantVendas){
        System.out.println("Informe quantidade de itens vendidos: ");
        int venda = scan.nextInt();
        this.quantVendas += venda;
    }

    public void consultVendas(){
        System.out.println("Número de vendas realizadas: " + this.quantVendas);
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }
}
