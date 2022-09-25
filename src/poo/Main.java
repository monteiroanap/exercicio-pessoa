package poo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("ana", 25, 1);
        Pessoa pessoa2 = new Pessoa("william", 2, 28, 1.70, 80.0);

        System.out.println(pessoa2.toString());
        int resultado = pessoa2.calcularImc();
        if(resultado < 0){
            System.out.println("Abaixo do peso");
        } else if (resultado >= 20 && resultado <= 25) {
            System.out.println("Peso Saudavel");
        } else {
            System.out.println("o resultado foi maior que 25, ou seja Sobrepeso");
        }

        pessoa2.ehMaiorIdade();
        if(pessoa2.ehMaiorIdade()){
            System.out.println("é maior de idade");
        } else{
            System.out.println("não é maior de idade");
        }

    }
}
