package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturasCondicionais03 {
    static void main(String[] args) {
        // Doar, se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;
        if(salario >= 5000) {
            resultado = mensagemDoar;
        } else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
