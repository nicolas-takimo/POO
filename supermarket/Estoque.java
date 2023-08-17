import java.util.ArrayList;

public class Estoque {
    private ArrayList<Object> produtos ;
   
    public Estoque(){
        this.produtos = new ArrayList<Object>();
    }

    public ArrayList<Object> getProdutos() {
        return produtos;
    }
}
