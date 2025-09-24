package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Exercicios.TipoUsuarios;

import java.util.Scanner;

public class Vendedor extends Gerente{
    private boolean adm = false;
    private int quantVendas;

    Scanner scan = new Scanner(System.in);

    public Vendedor(String nome, String email, int senha, boolean adm){
        super(nome, email, senha, adm);
        this.adm = false;
    }
    //metódos de venda
    public void registVenda(int quantVendas){
        System.out.print("Informe quantidade de itens vendidos: ");
        int venda = scan.nextInt();
        this.quantVendas += venda;
        System.out.print("Informe o vendedor: ");
        //String vendedor = scan.nextLine();
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
