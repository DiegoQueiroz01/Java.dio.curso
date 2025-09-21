package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Exercicios.Cinema;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, String dublado){
        super(nomeFilme, valor, dublado);
        setValor(valor /2);
    }
}