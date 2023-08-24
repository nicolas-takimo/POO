public class PersonagemClasse extends Personagem implements PersonagemArmadura, PersonagemArma{
    private String classe;
    private String tipoArmadura;
    private float pesoArmadura;
    private String tipoArma;
    private float pesoArma;

    public PersonagemClasse(float altura, float peso, String corPele, String corCabelo, int idade, String cidadeOrigem,
            String raca,String classe) {
        super(altura, peso, corPele, corCabelo, idade, cidadeOrigem, raca);
        this.classe = classe;
    }
    

    @Override
    public void tipoArmadura(String tipo){
        this.tipoArmadura = tipo;
    }

    @Override
    public void pesoArmadura(float peso){
        this.pesoArmadura= peso;
    }

    @Override
    public void pesoArma(float peso){
        this.pesoArma= peso;
    }

    @Override 
    public void tipoArma(String tipo) {
        this.tipoArma= tipo;

    }


    public String getClasse() {
        return classe;
    }


    public void setClasse(String classe) {
        this.classe = classe;
    }


    public String getTipoArmadura() {
        return tipoArmadura;
    }


    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }


    public float getPesoArmadura() {
        return pesoArmadura;
    }


    public void setPesoArmadura(float pesoArmadura) {
        this.pesoArmadura = pesoArmadura;
    }


    public String getTipoArma() {
        return tipoArma;
    }


    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }


    public float getPesoArma() {
        return pesoArma;
    }


    public void setPesoArma(float pesoArma) {
        this.pesoArma = pesoArma;
    }

    

}