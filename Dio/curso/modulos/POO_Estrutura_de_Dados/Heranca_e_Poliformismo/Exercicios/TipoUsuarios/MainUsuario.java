package Dio.curso.modulos.POO_Estrutura_de_Dados.Heranca_e_Poliformismo.Exercicios.TipoUsuarios;

import java.util.Scanner;

public class MainUsuario {
    private final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        var option = -1;

        Gerente gerente = new Gerente("Diêgo","@diego",2345, true);
        Vendedor vendedor = new Vendedor("Milena", "@mila", 6789, false);
        Atendente atendente = new Atendente("Sther", "@sther", 4567, false);

        do{
            System.out.println("====== Escolha uma opção ======");
            System.out.println("1. Registrar Venda.");
            System.out.println("2. Consultar número de vendas.");
            System.out.println("3. Receber pagamento.");
            System.out.println("4. Fechar caixa.");
            //System.out.println("5. Realizar Cadastro.");
            System.out.println("0. Sair.");

            System.out.print("\ninsira a opção: ");
            option = scan.nextInt();

            switch (option) {
                case 1 -> vendedor.registVenda(vendedor.getQuantVendas());
                case 2 -> vendedor.consultVendas();
                case 3-> atendente.receberPagamento();
                case 4 -> atendente.fecharCaixa();
                case 5 -> seguranca();
                case 0 -> System.exit(0);
            }
        }while(option != 0);


        }
        public static void seguranca(){

        }
}
