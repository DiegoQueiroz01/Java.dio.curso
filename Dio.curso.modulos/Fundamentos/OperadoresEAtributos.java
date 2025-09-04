import java.util.Scanner;

public class OperadoresEAtributos{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        var idade = scanner.nextInt();
        System.out.println("");
        var naoDirige = idade <= 17;
        System.out.printf("Você pode dirigir? (%s)\n", !naoDirige); //caso eu queria mais de um argumento, uso "printf"
    }
}