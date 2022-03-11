
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //referencia para o mesmo objeto
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) { // == compara a referencia e não o objeto
			System.out.println("Sao a mesmissima conta");
		}
		System.out.println(primeiraConta);// imprime o valor do endereço de memoria da referencia
		System.out.println(segundaConta);
	}
}
