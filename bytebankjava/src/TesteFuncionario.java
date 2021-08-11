
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Guilherme Alvino");
		f.setCpf("22335564-9");
		f.setSalario(2600.00);
		
		System.out.println(f.getNome());
		System.out.println(f.getBonificacao());

	}

}
