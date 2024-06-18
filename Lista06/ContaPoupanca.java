public class ContaPoupanca extends Conta {

    private double limite;

   
    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);
    }
    public void setLimite(double limite) 
    {
        if(limite <= 1000 && limite >=100)
        {
            this.limite = limite;
        }
        
    }
    public double getLimite() {
        return limite;
    }
}
