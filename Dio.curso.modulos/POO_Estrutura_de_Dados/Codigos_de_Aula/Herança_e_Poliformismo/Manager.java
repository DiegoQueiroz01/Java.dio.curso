package POO_Estrutura_de_Dados.Codigos_de_Aula.Herança_e_Poliformismo; 

public class Manager extends Employee{
    private String login;
    private String password;
    private double commmission;

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

    public double getCommmission() {
        return commmission;
    }

    public void setCommmission(double commmission) {
        this.commmission = commmission;
    }
}
