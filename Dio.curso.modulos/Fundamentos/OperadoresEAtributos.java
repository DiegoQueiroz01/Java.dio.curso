import java.util.Scanner;

public class OperadoresEAtributos{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? (true/false)");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated && age >= 16;

        System.out.printf("Você pode dirigir? (%s)\n", canDrive); //caso eu queria mais de um argumento, uso "printf"
    }
}