public class ContaCorrente extends Cliente {
    private float limiteEspecial;


    public ContaCorrente(float deposito, float saques, int agencia,String nome, int numConta,int cpf,float limiteEspecial) {
        super(deposito, saques, agencia, numConta, nome, cpf);
        this.limiteEspecial = limiteEspecial;
    }



    public float getLimiteEspecial() {
        return limiteEspecial;
    }


    public void setLimiteEspecial(float limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    
    
    
}