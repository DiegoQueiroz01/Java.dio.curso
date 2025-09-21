package Dio.curso.modulos.POO_Estrutura_de_Dados.Codigos_de_Aula.Heranca_e_Poliformismo.Exercicios.TipoUsuarios;

import java.util.Scanner;

public class Gerente {
    private String nome;
    private String email;
    private int senha;
    private boolean adm = true;

    Scanner scan = new Scanner(System.in);

    public Gerente(String nome, String email, int senha, boolean adm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = true;
    }

    //metódos para pedir que o gerente faça seu registro
    public void registNome (String nome){ //insere que o gerente faça o primeiro registro.
        System.out.print("Insira seu nome de usuário: ");
        this.nome = scan.nextLine();
    }
    public void registEmail (String email){
        System.out.print("Insira seu e-mail: ");
        this.email = scan.nextLine();
    }
    public void criarSenha ( int senha){
        System.out.print("Crie uma senha: " +
                "(use somente números inteiros)");
        this.senha = scan.nextInt();
    }

    //metódos para alterar informações de login
    public void mudetNome(String nome){
        System.out.print("Nome atual: " + this.nome);
        System.out.print("\nNovo nome: ");
        this.nome = scan.nextLine();
    }
    public void mudeSenha(int senha){
        System.out.print("Senha atual: " + this.senha);
        System.out.println("\nNova senha: ");
        this.senha = scan.nextInt();
    }
    public void mudeEmail(String email){
        System.out.print("Deseja alterar seu e-mail[S/N]: ");
        String res = String.valueOf(scan.next().equalsIgnoreCase("S/N"));
        if(res == "S"){
            System.out.print("E-mail atual: ");
            System.out.println("\nNovo e-mail: ");
            this.email = scan.nextLine();
        } else{
            System.out.println("");
        }
    }

    public void Relatorio(){
        System.out.println("===== Relatório =====");
    }
    public void imprimirRelatorio(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Scanner getScan() {
        return scan;
    }
}
