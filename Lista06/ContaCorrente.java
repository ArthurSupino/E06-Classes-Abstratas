public class ContaCorrente extends Conta {

    private double limite;
    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);
    }
    public void setLimite(double limite) {
        if(limite > -100)
        {
            this.limite = limite;
        }
        
    }
    public double getLimite() {
        return limite;
    }
}
