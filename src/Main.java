
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Alison");
		
Conta cc = new ContaCorrente(cliente1);
Conta poupanca = new ContaPoupanca(cliente1);

cc.depositar(200);
cc.transferir(100, poupanca);


cc.imprimirExtrato();
poupanca.imprimirExtrato();
		
	}

}
