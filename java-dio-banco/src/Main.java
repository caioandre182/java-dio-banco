import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente caio = new Cliente("Caio");
        Conta cc = new ContaCorrente(1,2, 500.0);
        caio.setConta(cc);

        Cliente dudu = new Cliente("Dudu");
        Conta pp = new ContaPoupanca(2, 2, 400.0);
        dudu.setConta(pp);


        caio.getConta().transferencia(dudu.getConta(), caio.getConta(), 200);

        caio.getConta().verificaSaque(caio.getConta());
        dudu.getConta().verificaSaque(dudu.getConta());



    }
}