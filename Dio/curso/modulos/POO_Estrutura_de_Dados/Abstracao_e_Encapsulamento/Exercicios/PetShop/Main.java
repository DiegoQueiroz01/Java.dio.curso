package Dio.curso.modulos.POO_Estrutura_de_Dados.Abstracao_e_Encapsulamento.Exercicios.PetShop;

import java.util.Scanner;

public class Main {
        private final static Scanner scan = new Scanner(System.in);
        private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args){
        var option = -1;

        do{
            System.out.println("=====*** Escolha uma das opções ***=====");
            System.out.println("1. Dar banho no pet.");
            System.out.println("2. Abastecer a máquina com água.");
            System.out.println("3. Abastecer a máquina com shampoo.");
            System.out.println("4. Verificar água da máquina.");
            System.out.println("5. Verificar shampoo da máquina.");
            System.out.println("6. Verificar se tem pet no banho.");
            System.out.println("7. Colocarr pet na máquina.");
            System.out.println("8. Retirar pet da máqquina.");
            System.out.println("9. Limpar máquina.");
            System.out.println("0. Sair.");

            option = scan.nextInt();

            switch(option){
                case 1 -> {
                    petMachine.takeAShower();
                }
                case 2 -> setWater();
                case 3-> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        }while (option != 0);
    }

    private static void checkIfHasPetInMachine() {
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina.");
        petMachine.addShampoo();
    }

    private static void setWater(){
        System.out.println("Tentando colocar água na máquina.");
        petMachine.addWater();
    }

    private static void verifyWater(){
        var amout = petMachine.getWater();
        //System.out.println("A máquna está no momento com " + amount + " litrros(s) e água.");
    }

    private static void verifyShampoo(){
        var amout = petMachine.getShampoo();
        //System.out.println("A máquna está no momento com " + amount + " litrros(s) e shampoo.");
    }

    private static void checkIfHasPetMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.print("informe o nome do pet: ");
            name = scan.next();
        }
        System.out.print("Informe o nome do pet: ");
        name = scan.next();
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }
}
