

import java.util.Scanner;

public class SalarioFuncionario{
    Scanner scan = new Scanner(System.in);
    float salario = 0;
    float salarioBruto = 0;
    float adicional = 0;
    float imposto = 0;

    public void calculoSalario(){
        System.out.println("Imprima o valor do seu salário bruto: ");
        salarioBruto = scan.nextFloat();
        System.out.println("Agora informe seu adicional: ");
        adicional = scan.nextFloat();

        if(salarioBruto <= 1100){
            imposto = salarioBruto * 5 / 100;
            salario = (salarioBruto - imposto) + adicional;
            System.out.println("Seu salário é de R$" + salario);
        }
        else if(salarioBruto > 1100 && salarioBruto <= 2500){
            imposto = salarioBruto * 10 / 100;
            salario = (salarioBruto - imposto) * adicional;
            System.out.println("Seu salário é de R$" + salario);
        }
        else if(salarioBruto > 2500){
            imposto = salarioBruto * 15 / 100;
            salario = (salarioBruto - imposto) + adicional;
            System.out.println("Seu salário é de R$" + salario);
        }
        else{
            System.out.println("Valor inserido de forma incorreta.");
        }
    }

    public static void main(String[] args){
        SalarioFuncionario print = new SalarioFuncionario();
        print.calculoSalario();
    }
}