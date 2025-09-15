package Dio.curso.modulos.POO e Estrutura de Dados.Códigos de Aula;

public class Main {
    public static void main(String[] args){
        Pessoa male = new Pessoa();
        male.setName ("João");
        male.setAge (12);
        
        Pessoa female = new Pessoa();
        female.setName ("Maria");
        female.setAge (10);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

    }
}
