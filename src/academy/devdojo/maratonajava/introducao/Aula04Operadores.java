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

        System.out.println("-----------------------------------------");

        // %

        int resto1 = 20%2;
        int resto2 = 21%4;

        System.out.println(resto1);
        System.out.println(resto2);

        System.out.println("-----------------------------------------");

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        System.out.println("-----------------------------------------");

        // && (AND) ||(OR) !(NOT)

        // && (AND)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        System.out.println("-----------------------------------------");

        // || (OR)

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation5 = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation5 || valorTotalContaPoupanca > valorPlaystation5;
        System.out.println("isPlaystationCompravel "+isPlaystationCompravel);

        System.out.println("-----------------------------------------");

        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        System.out.println("-----------------------------------------");

        //
        int contador = 0;
        contador += 1; // forma simplificada de "contador= contador + 1;" 0+1 == 1
        contador ++; // forma mais simplificada de "contador += 1;" 1+1 == 1
        contador --; // 2 - 1 == 1
        System.out.println(contador);

        System.out.println("-----------------------------------------");

        int contador2 = 0;

        System.out.println(contador2++); //0
        System.out.println(contador2++); //1
        System.out.println(contador2++); //2 ...

        //ele executa o que tem que ser executado e depois incrementa.

        System.out.println("-----------------------------------------");

        int contador3 = 0;
        System.out.println(++contador3);
        System.out.println(++contador3);
        System.out.println(++contador3);

        //ele incrementa e depois executa.


    }

}
