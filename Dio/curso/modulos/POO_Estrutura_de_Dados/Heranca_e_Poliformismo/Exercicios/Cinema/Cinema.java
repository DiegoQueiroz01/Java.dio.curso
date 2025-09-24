package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Exercicios.Cinema;

public class Cinema {
    public static void main(String[] args){
        Ingresso ingresso = new IngressoFamilia(25.00, "Perdidos no Espaço", "dublado", 4);
        IngressoFamilia ingressoFamilia = new IngressoFamilia(25, "Volta ao Mundo em 80 Dias", "Legendado", 2);
        MeiaEntrada meiaEntrada = new MeiaEntrada(12.5, "Super Man", "Dublado");

        System.out.println("Quantidade de ingressos: " + ingressoFamilia.getNumeroPessoas());
        System.out.println("Filme: " + ingressoFamilia.getNomeFilme());
        System.out.println("Valor: R$" + ingressoFamilia.getValor());
    }
}
