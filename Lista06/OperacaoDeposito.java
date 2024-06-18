public class OperacaoDeposito extends Operacao {

    public String toString()
    {
        String dados_Operacao = " " + getData() + " " + getTipo() + " "  + getValor();

        return  dados_Operacao;
    }

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }
}
