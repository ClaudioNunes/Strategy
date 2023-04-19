public class Multiplicacao implements  IOperacao{
    @Override
    public int Calcular(int a, int b) {
        return a * b;
    }

    @Override
    public String Desricao() {
        return "Operação Descrição";
    }
}
