package one.dio.com;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

       // Vendedor vendedor_ = (Vendedor) new Funcionario();

        System.out.println(gerente);

    }
}
