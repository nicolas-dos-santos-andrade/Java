package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        //int,double,float,char,byte,short,long,boolean

        int idade = 10;
        long numeroGrande = 2000000000L;
        double salarioDouble = 2500.0D;
        float salarioFloat = 250000000;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Nícolas";
        System.out.println("O int é: "+idade);
        System.out.println("O long é: "+numeroGrande);
        System.out.println("O double é: "+salarioDouble);
        System.out.println("O float é: "+salarioFloat);
        System.out.println("O byte é: "+idadeByte);
        System.out.println("O boolean é: "+verdadeiro+" ou "+falso);
        System.out.println("Meu nome é: "+nome);
    }
}

