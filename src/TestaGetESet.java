
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(3377);
		System.out.println(conta.getNumero());
	
	Cliente diego = new Cliente();
	diego.setNome("Diego Barcellos");
	
	conta.setTitular(diego);
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
	// Agora em duas linhas:
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
	
	System.out.println(titularDaConta);
	System.out.println(diego);
	System.out.println(conta.getTitular());
	
	}

}
