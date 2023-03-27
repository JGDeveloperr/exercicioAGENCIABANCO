package banco;

import java.util.ArrayList;

public class contaPoupanca {

	public contaPoupanca() {}
	
	//-------------------------------------------------------------------------------//

	
	ArrayList<Conta> clientes_CP = new ArrayList<Conta>(); 
	

	//-------------------------------------------------------------------------------//
	
	//metodo cria e salva conta poupança;
	
	public void salva_CP(String cpf) {
		int j = 0;
		
		for (int cont = 0; cont < this.clientes_CP.size(); cont++) {
			
			if(cpf.equals(this.clientes_CP.get(cont).Cpf)){
				j = 1;//se a conta já existir vai receber 1 na variavel;
				break;
			}
			j = 0;
		}
		
		if(j == 0) {
			Conta conta = new Conta();	
			conta.numero = clientes_CP.size() +1;
			conta.tipo = "Conta Poupanca";
			conta.saldo = 0;
			conta.Cpf = cpf;
				
			clientes_CP.add(conta);
			System.out.println("--- Sua conta foi criada com sucesso! ---");
		}
		if(j==1) {
			System.out.println("--- Esse cliente ja possui conta ---");
		}
		
}
	
	//-------------------------------------------------------------------------------//
	
	public void imprime_todas_CP() {
		
		for(int cont=0; cont< this.clientes_CP.size(); cont++) {
			
			System.out.println(" ");
			System.out.println("Cpf do Cliente: " + this.clientes_CP.get(cont).Cpf);
			System.out.println("Tipo da Conta: "+ this.clientes_CP.get(cont).tipo);
			System.out.println("Numero da Conta: "+ this.clientes_CP.get(cont).numero);
			System.out.println("Saldo Atual: "+ this.clientes_CP.get(cont).saldo);
			
			System.out.println("");
        
		
		}
	}
	
	//-------------------------------------------------------------------------------//

	public void depositarCP(String cpf, double valor) {
		
		int j =0;
		
		for (int cont = 0; cont < this.clientes_CP.size(); cont++) {
			
			
			if(cpf.equals(this.clientes_CP.get(cont).Cpf)){
				
				
				
				this.clientes_CP.get(cont).saldo = this.clientes_CP.get(cont).saldo + valor;
				System.out.print("\nDepositado com sucesso !!\n");
				System.out.printf("\nSaldo atual Conta corrente: %.2f", this.clientes_CP.get(cont).saldo);
				
				
				break;
			
			}
			j=1;	
		}
		if(j ==1) {
			System.out.print("\ndeposito nao realizado..!!\n");
			System.out.print("\nCliente nao existente..!!\n");
		}
		
		
	
	}
	
	//-------------------------------------------------------------------------------//
	
	public void sacarCP(String cpf, double valor) {
		
		int l = 1;
		
		for (int cont = 0; cont < this.clientes_CP.size(); cont++) {
			
			
			
			if(cpf.equals(this.clientes_CP.get(cont).Cpf)){
				
				if(this.clientes_CP.get(cont).saldo >= valor) {
					
				
					this.clientes_CP.get(cont).saldo = this.clientes_CP.get(cont).saldo -valor;
					System.out.println("Saque realizado com sucesso !!");
					System.out.printf("Saldo atual Conta corrente: %.2f", this.clientes_CP.get(cont).saldo);
					System.out.println();
					l=0;
					break;
				}
				if(this.clientes_CP.get(cont).saldo < valor) {
				
					System.out.print("\nSaque nao realizado!!\n");
					System.out.print("\nValor do saque maior que o saldo!!\n");
					System.out.printf("\nSaldo atual Conta corrente: %.2f", this.clientes_CP.get(cont).saldo);
					System.out.println();
					l=0;
				break;
				}
				
			}
			
				
			}
			
			
		if(l == 1) {
			System.out.println("\nCliente nao possui conta corrente..!!\n");
		}
	}
	
	//-------------------------------------------------------------------------------//
	
	public  double saldo_total_CP() {
				
		double soma = 0;
				
		for(int cont=0; cont< this.clientes_CP.size(); cont++) {
			soma = soma + this.clientes_CP.get(cont).saldo;
					
		}
		return soma;
	}
	
	//-------------------------------------------------------------------------------//
	
}//fim classe

	
	
	

