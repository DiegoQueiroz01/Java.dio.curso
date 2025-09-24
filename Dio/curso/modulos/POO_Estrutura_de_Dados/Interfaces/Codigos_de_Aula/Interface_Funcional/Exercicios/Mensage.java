package Dio.curso.modulos.POO_Estrutura_de_Dados.Interfaces.Codigos_de_Aula.Interface_Funcional.Exercicios;

import java.util.Scanner;

public class Mensage {
    Scanner scan = new Scanner(System.in);
    public String mensage;

    public String getMensage() {
        System.out.println("Hello World!");
        return mensage;
    }

    public void setMensage(String mensage) {

        this.mensage = mensage;
    }
}
