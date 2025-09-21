package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Exercicios;

import java.util.Scanner;

public class DiferencaIdade {
    Scanner scan = new Scanner(System.in);
    String nome1, nome2;
    int idade1, idade2, diferenca;

    public void calcularDiferenca(){
            System.out.print("Olá, informe seu nome: ");
            nome1 = scan.nextLine();
            System.out.print("Informe sua idade: ");
            idade1 = scan.nextInt();

            System.out.println("Agora informe o segundo nome: ");
            nome2 = scan.nextLine();
            System.out.print("Informe a segunda idade: ");
            idade2 = scan.nextInt();

            diferenca = idade1 - idade2;
    }

    public void imprimirDiferenca(){
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " ,é de " + diferenca + " anos.");
    }

    public static void main(String[] args){
        DiferencaIdade diferencaIdade = new DiferencaIdade();
            diferencaIdade.calcularDiferenca();
            diferencaIdade.imprimirDiferenca();
    }
}
