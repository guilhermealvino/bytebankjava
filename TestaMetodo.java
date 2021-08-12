package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);		
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiRetirar = contaDoPaulo.saca(20);
		System.out.println("O saldo agora é: " +contaDoPaulo.saldo);
		
		System.out.println(conseguiRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(3000, contaDoPaulo)) {
			System.out.println("transferencia feita com sucesso");
		} else {
			System.out.println("faltou dinheiro!");
		}
		
		System.out.println("Saldo da conta da Marcela: " +contaDaMarcela.saldo);
		System.out.println("Saldo da conta do Paulo: " +contaDoPaulo.saldo);
	}

}
