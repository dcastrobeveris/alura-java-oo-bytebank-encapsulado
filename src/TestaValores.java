
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(3377, 24227);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1234);
		
		Conta conta2 = new Conta(3377, 25213);
		Conta conta3 = new Conta(3377, 24313);
		
		System.out.println(Conta.getTotal());
	}

}
