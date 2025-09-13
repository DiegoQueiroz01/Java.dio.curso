/*Desafio
*Você é o novo gerente de uma rede de lojas de departamento e precisa organizar o estoque de produtos. Cada loja possui um código único e você deve calcular o 
*total de produtos disponíveis em cada uma delas. Aceite o desafio e ajude a empresa a otimizar seu estoque!
*Entrada
*A entrada deve receber uma string contendo os códigos das lojas e a quantidade de produtos, separados por vírgulas. Cada loja e sua quantidade devem ser 
*representadas no formato "codigo:quantidade". A entrada terá no máximo 1000 caracteres.
*Saída
*Deverá retornar uma string com os códigos das lojas e o total de produtos disponíveis em cada uma, no formato "codigo:total", separados por vírgulas.*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrganizandoEstoque {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        String entrada = ent.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        ent.close();
    }

    public static String organizarEstoque(String entrada) {
        Map<String, Integer> estoque = new LinkedHashMap<>();
        String[] lojas = entrada.split(",");

        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0];
            int quantidade = Integer.parseInt(partes[1]);

            estoque.put(codigo, estoque.getOrDefault(codigo, 0) + quantidade);
        }

        StringBuilder saida = new StringBuilder();
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            if (saida.length() > 0) saida.append(",");
            saida.append(entry.getKey()).append(":").append(entry.getValue());
        }

        return saida.toString();
    }
}
