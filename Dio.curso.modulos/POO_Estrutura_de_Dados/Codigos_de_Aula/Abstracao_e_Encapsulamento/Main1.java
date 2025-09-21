package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Abstracao_e_Encapsulamento;

public class Main1 {
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
