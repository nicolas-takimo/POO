public class HotelCuiaba {

    public static void main(String[] args) {
        Cafeteira cafeteira1 = new Cafeteira(1000, 500);
        Cafeteira cafeteira2 = new Cafeteira(100, 50);
        Cafeteira cafeteira3 = new Cafeteira(50, 10);
        Cafeteira cafeteira4 = new Cafeteira(1000, 500);

        try {
            System.out.println("Cafeteira 1:");
            cafeteira1.expresso();

            System.out.println("\nCafeteira 2:");
            cafeteira2.expresso();

            System.out.println("\nCafeteira 3:");
            cafeteira3.expresso();

            System.out.println("\nCafeteira 4:");
            cafeteira4.expresso();
        } catch (InterruptedException e) {
            System.out.println("Erro ao tentar fazer o café expresso.");
        }

        try {
            System.out.println("\nCafeteira 1:");
            cafeteira1.coado();

            System.out.println("\nCafeteira 2:");
            cafeteira2.coado();

            System.out.println("\nCafeteira 3:");
            cafeteira3.coado();

            System.out.println("\nCafeteira 4:");
            cafeteira4.coado();
        } catch (InterruptedException e) {
            System.out.println("Erro ao tentar fazer o café coado.");
        }

        System.out.println("\nRecarregando as cafeteiras:");
        cafeteira1.setAgua(1500);
        cafeteira1.setCafe(700);

        cafeteira2.setAgua(1500);
        cafeteira2.setCafe(700);

        cafeteira3.setAgua(1500);
        cafeteira3.setCafe(700);

        cafeteira4.setAgua(1500);
        cafeteira4.setCafe(700);
    }
}
