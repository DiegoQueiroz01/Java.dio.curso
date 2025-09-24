package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Codigos_de_Aula;

public class Manager extends Employee {
    private String login;
    private String password;
    private double commission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commmission) {
        this.commission = commmission;
    }
}
