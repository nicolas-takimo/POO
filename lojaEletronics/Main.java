public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Televisão", 12345, 2000.50f, 1, 2);
        estoque.nome("Televisão Nova");
        estoque.dataEntrada("2023-08-29");
        estoque.codigo("TV2023");

        ProdutoEletrico produtoEletrico = new ProdutoEletrico("Notebook", 67890, 3500.75f, "220V", "Dell");

        System.out.println("Produto em estoque: " + estoque.nome(""));
        System.out.println("Data de entrada: " + estoque.dataEntrada(""));
        System.out.println("Código do produto: " + estoque.codigo(""));
    }
}