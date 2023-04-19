
public class Main {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
        calculadora.setA(10);
        calculadora.setB(5);

        Adicao adicao = new Adicao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();


        calculadora.setOperacao(subtracao); // qual a estrategia que vai ser usada

        System.out.println(" Resultado da Operacao:" + calculadora.Calculo());



    }
}