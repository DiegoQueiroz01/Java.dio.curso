package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Codigos_de_Aula;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Diêgo");
        manager.setLogin("diêgo");
        manager.setPassword("password");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}
