package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        // +, -, /, *
        int numero1 = 10;
        int numero2 = 20;
        double numero3 = 20;
        int resultadoSoma = numero1+numero2;
        int subtracao = numero2 - numero1;
        int resultadoMultiplicacao = numero1*numero2;
        double resultadoDivisao = numero1 /numero3;

        System.out.println("Soma: "+resultadoSoma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+resultadoMultiplicacao);
        System.out.println("Divisão: "+resultadoDivisao);

    }
}
