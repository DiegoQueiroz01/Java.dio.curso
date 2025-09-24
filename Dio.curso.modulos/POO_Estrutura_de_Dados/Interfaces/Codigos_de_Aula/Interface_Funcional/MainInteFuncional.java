package Dio.curso.modulos.POO_Estrutura_de_Dados.Interfaces.Codigos_de_Aula.Interface_Funcional;

import java.util.List;
import java.util.function.Consumer;

public class MainInteFuncional {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Diego", 21), new User("Milena", 21),
                new User("Maria", 55), new User("Jamile", 34));
        var consumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };
        users.forEach(consumer); //pode-se simplificar tudo colocando a var consummer (e o que vem em seguida), dentro do forEach
    }
}
