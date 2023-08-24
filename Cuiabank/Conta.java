public class Conta {
    private float deposito;
    private float saques;
    private int agencia;
    private int numConta;

    public Conta(float deposito, float saques, int agencia, int numConta) {
        this.deposito = deposito;
        this.saques = saques;
        this.agencia = agencia;
        this.numConta = numConta;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getSaques() {
        return saques;
    }

    public void setSaques(float saques) {
        this.saques = saques;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    

    
}