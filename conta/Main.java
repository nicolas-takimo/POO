public class Main {

    public static void main(String[] args) {
 
        Cliente joao = new Cliente("João Silva", "123.456.789-00");

       
        Conta contaJoao = new Conta(1001, joao);

        System.out.println("Titular: " + contaJoao.getTitular().getNome());
        System.out.println("CPF: " + contaJoao.getTitular().getCpf());
        System.out.println("Número da Conta: " + contaJoao.getNumero());
        System.out.println("Saldo Inicial: R$" + contaJoao.getSaldo());

        contaJoao.depositar(500.0);
        System.out.println("Saldo após depósito: R$" + contaJoao.getSaldo());

        if (contaJoao.sacar(200.0)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque não realizado.");
        }
        System.out.println("Saldo após saque: R$" + contaJoao.getSaldo());

        if (contaJoao.sacar(500.0)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
        System.out.println("Saldo final: R$" + contaJoao.getSaldo());
    }
}
