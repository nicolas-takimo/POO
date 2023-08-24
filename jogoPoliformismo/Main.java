public class Main {
    public static void main(String[] args) {
        // Criando o primeiro objeto PersonagemClasse
        PersonagemClasse personagem1 = new PersonagemClasse(1.80f, 75.0f, "Branca", "Preto", 25, "Gotham", "Humano", "Guerreiro");
        personagem1.setTipoArma("Espada");
        personagem1.setPesoArma(5.0f);
        personagem1.setTipoArmadura("Placa");
        personagem1.setPesoArmadura(15.0f);

        // Criando o segundo objeto PersonagemClasse
        PersonagemClasse personagem2 = new PersonagemClasse(1.65f, 60.0f, "Morena", "Castanho", 23, "Metropolis", "Elfo", "Arqueiro");
        personagem2.setTipoArma("Arco e Flecha");
        personagem2.setPesoArma(3.0f);
        personagem2.setTipoArmadura("Couro");
        personagem2.setPesoArmadura(8.0f);

        // Imprimindo informações dos personagens
        System.out.println("Personagem 1:");
        System.out.println("Classe: " + personagem1.getClasse());
        System.out.println("Tipo de Arma: " + personagem1.getTipoArma());
        System.out.println("Peso da Arma: " + personagem1.getPesoArma());
        System.out.println("Tipo de Armadura: " + personagem1.getTipoArmadura());
        System.out.println("Peso da Armadura: " + personagem1.getPesoArmadura());

        System.out.println("\nPersonagem 2:");
        System.out.println("Classe: " + personagem2.getClasse());
        System.out.println("Tipo de Arma: " + personagem2.getTipoArma());
        System.out.println("Peso da Arma: " + personagem2.getPesoArma());
        System.out.println("Tipo de Armadura: " + personagem2.getTipoArmadura());
        System.out.println("Peso da Armadura: " + personagem2.getPesoArmadura());
    }
}
