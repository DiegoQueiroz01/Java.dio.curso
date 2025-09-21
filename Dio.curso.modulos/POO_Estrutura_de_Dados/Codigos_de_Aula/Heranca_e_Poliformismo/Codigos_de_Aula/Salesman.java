package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Codigos_de_Aula;

public class Salesman extends Employee {
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    private double percentPerSold;
}
