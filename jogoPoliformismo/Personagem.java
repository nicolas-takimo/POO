public abstract class Personagem {
    private float altura;
    private float peso;
    private String corPele;
    private String corCabelo;
    private int idade;
    private String cidadeOrigem;
    private String raca;

    public Personagem(float altura, float peso, String corPele, String corCabelo, int idade, String cidadeOrigem, String raca) {
        this.altura = altura;
        this.peso = peso;
        this.corPele = corPele;
        this.corCabelo = corCabelo;
        this.idade = idade;
        this.cidadeOrigem = cidadeOrigem;
        this.raca = raca;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    


    
}