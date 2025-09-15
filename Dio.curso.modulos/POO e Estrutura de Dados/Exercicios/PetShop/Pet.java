package Dio.curso.modulos.POOeEstruturadeDados.Exercicios.PetShop;

public class Pet {
    private final String name;

    private boolean clean;

    //construtor da classe.
    public Pet(String name){
        this.name = name;
        this.clean = false;
    }

    //metódos get.
    public String getName(){
        return name;
    }
    public boolean isClean(){
        return clean;
    }

    public void setClean(boolean clean){
        this.clean = clean;
    }
}
