package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.agencia = 146;
		
		System.out.println("Primeira conta tem: " + primeiraConta);
		System.out.println("Segunda conta tem: " + segundaConta);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Sao a mesmissima conta");
		} else {
			System.out.println("Conta diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
