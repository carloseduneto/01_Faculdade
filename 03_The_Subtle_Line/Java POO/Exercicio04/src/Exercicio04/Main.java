package Exercicio04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta novaConta = new Conta();
		
		novaConta.deposito(100);
		novaConta.saque(1);
		System.out.println("Saldo de " + novaConta.dono + " R$" + novaConta.verificaSaldo());
		
		
	}

}
