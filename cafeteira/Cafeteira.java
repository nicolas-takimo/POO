public class Cafeteira{
    private float agua;
    private float cafe;

    public Cafeteira(float agua, float cafe){
        this.agua = agua;
        this.cafe = cafe;
    }

    public boolean expresso() throws InterruptedException{
        if (this.agua >= 100 && this.cafe >= 50){
            System.out.println("Expreso em preparo");
            System.out.println("...........");
            Thread.sleep(5000);
            System.out.println("Café pronto !!!");
            return true;
        }else{
            System.out.println("Falta recurso por favor recarregue a cafeteria");
            System.out.println("No momento elá está com "+getAgua()+" ml de agua Recarregue");
            System.out.println("No momento elá está com "+getCafe()+" mg de cafe Recarregue");
            return false;
        }
        
    }
    public boolean coado () throws InterruptedException{
        if (this.agua >= 100 && this.cafe >= 20){
            System.out.println("Coado  em preparo");
            System.out.println("...........");
            Thread.sleep(5000);
            System.out.println("Café pronto !!!");
            return true;
        }else{
            System.out.println("Falta recurso por favor recarregue a cafeteria");
            System.out.println("No momento elá está com "+getAgua()+" ml de agua Recarregue");
            System.out.println("No momento elá está com "+getCafe()+" mg de cafe Recarregue");
            return false;
        }
        
    }

    public float getAgua() {
        return agua;
    }
    public float getCafe() {
        return cafe;
    }
    public void setAgua(float agua) {
        if (agua > 1000){
            System.out.println("Você deve recarregar com no minimo 1000 ml de agua");
        }else{
        this.agua = agua;
            System.out.println("Recarregado com sucesso ");
        }
    }
    public void setCafe(float cafe) {
           if (agua > 1000){
            System.out.println("Você deve recarregar com no minimo 500 mg  de café");
        }else{
        this.cafe = cafe;
            System.out.println("Recarregado com sucesso ");
        }
    }



}