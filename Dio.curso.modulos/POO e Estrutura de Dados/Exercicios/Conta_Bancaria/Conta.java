package Dio.curso.modulos.POO e Estrutura de Dados.Exercicios.Conta_Bancaria;

public class Conta {
    private String name;
    private float saldo;
    private float chequeEspecial;
    private float depositar;
    private float sacar;
    private float pagarBoleto;
    private boolean usoChequeEspecial;

    //cnstrutor
    public Conta(float chequeEspecial, float depositar, String name, float pagarBoleto, float sacar, float saldo, boolean usoChequeEspecial) {
        this.chequeEspecial = chequeEspecial;
        this.depositar = depositar;
        this.name = name;
        this.pagarBoleto = pagarBoleto;
        this.sacar = sacar;
        this.saldo = saldo;
        this.usoChequeEspecial = usoChequeEspecial;
    }

    //metódos get e set
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public Float getChequeEspecial(){
        return chequeEspecial;
    }
    public void setChequeEspecial(float chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    public Float getDepositar(){
        return depositar;
    }
    public void setDepositar(float depositar){
        this.depositar = depositar;
    }

    public Float getSacar(){
        return sacar;
    }
    public void setSacar(float sacar){
        this.sacar = sacar;
    }

    public Float getPagarBoleto(){
        return pagarBoleto;
    }
    public void setPagarBoleto(float pagarBoleto){
        this.pagarBoleto = pagarBoleto;
    }

    public Boolean getUsoChequeEspecial(){
        return usoChequeEspecial;
    }
    public void setUsoChequeEspecial(boolean usoChequeEspecial){
        this.usoChequeEspecial = usoChequeEspecial;
    }
}
