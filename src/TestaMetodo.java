
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		conta1.deposita(50);
		System.out.println(conta1.saldo);
		
		boolean consegiuRetirar = conta1.saca(20);
		System.out.println(conta1.saldo);
		System.out.println(consegiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if(conta2.transfere(300, conta1)) {
			System.out.println("Tranferencia com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
		conta1.titular = "Fulano da Silva";
		System.out.println(conta1.titular);
		
	}
}
