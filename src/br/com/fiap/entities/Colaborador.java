package br.com.fiap.entities;

public class Colaborador {

    // visibilidade, tipo de dados e atributo
    private String nome;
    private int QtdDeHoras;
    private double valorHora;
    private double salario;
    private double percentual;


    // metodo construtor com parametro vazio
    public Colaborador() {
    }

    // metodo construtor com parametro cheio, sem atributo de referencia


    public Colaborador(String nome, int qtdDeHoras, double valorHora, double salario) {
        this.nome = nome;
        QtdDeHoras = qtdDeHoras;
        this.valorHora = valorHora;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDeHoras() {
        return QtdDeHoras;
    }

    public void setQtdDeHoras(int qtdDeHoras) {
        QtdDeHoras = qtdDeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


// getters e setters


    // toString
    @Override
    public String toString() {
        return "Colaborador " +
                "\nnome= " + nome +
                "\nQtdDeHoras= " + QtdDeHoras +
                "\nvalorHora= " + valorHora+
                "\nsalario= " + salario +
                "\ncalcularSalario= " ;
    }

    //workers

    public double calcularSalario(){
        return valorHora * QtdDeHoras;

    }


    public double calcularIr(){
        double salario = calcularSalario();
        double imposto;
     if (salario <=5000.00){
         this.percentual = 0;
         return 0;
     }else{
            this.percentual = 7.5;
            imposto = salario * (this.percentual /100);
     }
        return imposto;
    }




}
