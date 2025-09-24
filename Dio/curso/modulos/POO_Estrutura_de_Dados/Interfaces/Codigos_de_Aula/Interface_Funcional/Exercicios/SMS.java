package Dio.curso.modulos.POO_Estrutura_de_Dados.Interfaces.Codigos_de_Aula.Interface_Funcional.Exercicios;

public interface SMS {
    public static void main(String[] args){
        Mensage mensage = new Mensage();

        System.out.println("SMS: " + mensage.getMensage());
    }
}
