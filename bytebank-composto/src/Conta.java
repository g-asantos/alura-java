public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    public void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        boolean contemDinheiro = this.saca(valor);
        
        if(contemDinheiro){
            destino.deposita(valor);
            return true;
        } 
        return false;
        
    }
}
