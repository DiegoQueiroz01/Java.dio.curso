/*Desafio
*Na loja de departamentos "SuperCompras", o gerente decidiu fazer uma promoção especial. Dependendo do valor da compra, os clientes receberão diferentes descontos. 
*Sua missão é implementar um programa que determine o desconto aplicado com base no valor gasto!
*Entrada
*A entrada deve receber uma string representando o valor da compra em reais, utilizando duas casas decimais. O valor será sempre positivo e não conterá 
*caracteres especiais.
*Saída
*Deverá retornar uma string informando o desconto aplicado. As regras são: se o valor for menor que 50, o desconto é de 0%. Se estiver entre 50 e 100, o desconto é 
*de 10%. Acima de 100, o desconto é de 20%.*/

import java.math.BigDecimal;
import java.util.Scanner;

public class SuperCompras {
    Scanner scan = new Scanner(System.in);
    String valorCompra = scan.nextLine();

    public void calcularDesconto(String valorCompra){
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal cinquenta = new BigDecimal("50.00");
        BigDecimal cem = new BigDecimal("100.00");
        int desconto;

        if(valor.compareTo(cinquenta) >= 0 && valor.compareTo(cem) <= 0){
            desconto = 10;
        }
        else if(valor.compareTo(cem) >= 0){
            desconto = 20;
        }
        else{
            desconto = 0;
        }

        System.out.println("Desconto aplicado: " + desconto + "%");
    }

    public static void main(String[] args) {
        SuperCompras total = new SuperCompras();
        total.calcularDesconto(total.valorCompra);
    }
}

