package poo;

public class Pessoa {
    private String nome;
    private int id;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int id, int idade, double altura, double peso) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int calcularImc() {
        double resultado = peso / (Math.pow(this.altura, 2));
        if (resultado < 20) {
            return -1;
        } else if (resultado >= 20 && resultado <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public  boolean ehMaiorIdade() {
        //return idade >= 18;
        if (idade >= 18) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", id = " + id + " idade = " + idade + "peso = " + peso + " altura = " + altura;
    }
}
