public class Main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1000, 200, 1234, "João", 5678, 123456789, 500);
        ContaCorrente cc2 = new ContaCorrente(1500, 250, 1235, "Maria", 5679, 987654321, 600);

        ContaPoupanca cp1 = new ContaPoupanca(2000, 100, 1236, 5680, "Pedro", 112233445);
        ContaPoupanca cp2 = new ContaPoupanca(2500, 150, 1237, 5681, "Ana", 556677889);

        System.out.println("Detalhes da  ContaCorrente 1:");
        System.out.println("Nome: " + cc1.getNome());
        System.out.println("CPF: " + cc1.getCpf());
        System.out.println("Deposito: " + cc1.getDeposito());
        System.out.println("Saques: " + cc1.getSaques());
        System.out.println("Agencia: " + cc1.getAgencia());
        System.out.println("NumConta: " + cc1.getNumConta());
        System.out.println("Limite Especial: " + cc1.getLimiteEspecial());
        System.out.println();

        System.out.println("Detalhes da  ContaCorrente 2:");
        System.out.println("Nome: " + cc2.getNome());
        System.out.println("CPF: " + cc2.getCpf());
        System.out.println("Deposito: " + cc2.getDeposito());
        System.out.println("Saques: " + cc2.getSaques());
        System.out.println("Agencia: " + cc2.getAgencia());
        System.out.println("NumConta: " + cc2.getNumConta());
        System.out.println("Limite Especial: " + cc2.getLimiteEspecial());
        System.out.println();


        System.out.println("Detalhes Conta Poupança  1:");
        System.out.println("Nome: " + cp1.getNome());
        System.out.println("CPF: " + cp1.getCpf());
        System.out.println("Deposito: " + cp1.getDeposito());
        System.out.println("Saques: " + cp1.getSaques());
        System.out.println("Agencia: " + cp1.getAgencia());
        System.out.println("NumConta: " + cp1.getNumConta());
        System.out.println();

        System.out.println("Detalhes Conta Poupança  1:");
        System.out.println("Nome: " + cp2.getNome());
        System.out.println("CPF: " + cp2.getCpf());
        System.out.println("Deposito: " + cp2.getDeposito());
        System.out.println("Saques: " + cp2.getSaques());
        System.out.println("Agencia: " + cp2.getAgencia());
        System.out.println("NumConta: " + cp2.getNumConta());
        System.out.println();

    }

}