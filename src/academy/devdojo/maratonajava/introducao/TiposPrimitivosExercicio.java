package academy.devdojo.maratonajava.introducao;
/**
 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class TiposPrimitivosExercicio {
    static void main(String[] args) {
        String nome = "Nicolas";
        String endereco = "Aurora";
        double salario = 2500;
        String data = "16/10/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data;
        System.out.println(relatorio);
    }
}
