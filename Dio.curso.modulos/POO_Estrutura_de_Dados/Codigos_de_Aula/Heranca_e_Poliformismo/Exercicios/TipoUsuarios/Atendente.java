package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Exercicios.TipoUsuarios;

import java.util.Scanner;

public class Atendente extends Gerente{
    Scanner scan = new Scanner(System.in);
    private float valorCaixa;
    private boolean adm = false;

    public Atendente(String nome, String email, int senha, boolean adm){
        super(nome, email, senha, adm);
        this.adm = false;
        this.valorCaixa = valorCaixa;
        }

    public void receberPagamento(){
        System.out.print("Insira o valor da venda: ");
        float valorVenda = scan.nextFloat();
        this.valorCaixa += valorVenda;
    }

    public void fecharCaixa(){
        System.out.println("Caixa fechado com R$" + this.valorCaixa);
    }

    public float getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(float valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
