import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList<Object>estoque = new ArrayList<>();

        ProdutoAlimenticio p1 = new ProdutoAlimenticio("arroz",5.f,"Cumbuca",455552589,"Alimenticia","10/10/2002","10°");
        ProdutoAlimenticio p2=  new ProdutoAlimenticio("feijao",5.f,"Cumbuca",453552589,"Alimenticia","10/10/2002","10°");
        ProdutoAlimenticio p3 = new ProdutoAlimenticio("cerveja",5.f,"Skol",45542589,"Alimenticia","10/10/2002","10°");
        ProdutoAlimenticio p4 = new ProdutoAlimenticio("suco",5.f,"del valle",42552589,"Alimenticia","10/10/2002","10°");
        ProdutoAlimenticio p5 = new ProdutoAlimenticio("picanha",5.f,"fri boi",45652589,"Alimenticia","10/10/2002","10°");
        
        estoque.add(p1);
        estoque.add(p2);
        estoque.add(p3);
        estoque.add(p4);
        estoque.add(p5);
        
    }



    
}
