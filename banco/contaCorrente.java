package banco;

import java.util.ArrayList;

public class contaCorrente {


		//-------------------------------------------------------------------------------//
		
		ArrayList<Conta> clientes_CC = new ArrayList<Conta>(); 
		
		//-------------------------------------------------------------------------------//
		
		//metodo cria e salva conta corrente;
		
		public void salva_CC(String cpf) {
			
			int j =0;
			
			for (int cont = 0; cont < this.clientes_CC.size(); cont++) {
				
				if(cpf.equals(this.clientes_CC.get(cont).Cpf)){
					j = 1;//se a conta já existir vai receber 1 na variavel;
					break;
				}
				j = 0;
			}
			
			if(j == 0) {
				Conta conta = new Conta();	
				conta.numero = clientes_CC.size() +1;
				conta.tipo = "Conta Corrente";
				conta.saldo = 0;
				conta.Cpf = cpf;
					
				clientes_CC.add(conta);
				System.out.print("\n--- Sua conta foi criada com sucesso! ---\n");
			}
			
			if(j==1) {
				System.out.print("\n--- Esse cliente ja possui conta ---\n");
			}
			
		}
		
		//-------------------------------------------------------------------------------//	
		
		public void imprime_todas_CC() {
			
			
			for(int cont=0; cont< this.clientes_CC.size(); cont++) {
				
				
				
				System.out.println(" ");
				System.out.println("Cpf do Cliente: " + this.clientes_CC.get(cont).Cpf);
				System.out.println("Tipo da Conta: "+ this.clientes_CC.get(cont).tipo);
				System.out.println("Numero da Conta: "+ this.clientes_CC.get(cont).numero);
				System.out.println("Saldo Atual: "+ this.clientes_CC.get(cont).saldo);
				
				System.out.println("");
	        
			
			}
			
			//-------------------------------------------------------------------------------//
		}
		
		
		//-------------------------------------------------------------------------------//	
		
		public void depositarCC(String cpf, double valor) {
			
			
			int j =0;
			for (int cont = 0; cont < this.clientes_CC.size(); cont++) {
				
				
				
				if(cpf.equals(this.clientes_CC.get(cont).Cpf)){
					
					
					this.clientes_CC.get(cont).saldo = this.clientes_CC.get(cont).saldo + valor;
					System.out.print("\nDepositado com sucesso !!\n");
					System.out.printf("Saldo atual Conta corrente: %.2f", this.clientes_CC.get(cont).saldo);
					
					
					break;
				}
			j =1;
			}
			if(j ==1) {
				System.out.print("\ndeposito nao realizado..!!\n");
				System.out.print("\nCliente nao existente..!!\n");
			}
		}
		//-------------------------------------------------------------------------------//		
		
		public void sacarCC(String cpf, double valor) {
			
			int l = 0;
			
			for (int cont = 0; cont < this.clientes_CC.size(); cont++) {
				
				
				
				if(cpf.equals(this.clientes_CC.get(cont).Cpf)){
					
					if(this.clientes_CC.get(cont).saldo >= valor) {
						
					
						this.clientes_CC.get(cont).saldo = this.clientes_CC.get(cont).saldo -valor;
						System.out.print("\nSaque realizado com sucesso !!");
						System.out.printf("\nSaldo atual Conta corrente: %.2f", this.clientes_CC.get(cont).saldo);
						System.out.println();
						l=0;
						break;
					}
					if(this.clientes_CC.get(cont).saldo < valor) {
					
						System.out.print("\nSaque nao realizado!!");
						System.out.print("\nValor do saque maior que o saldo!!");
						System.out.printf("\nSaldo atual Conta corrente: %.2f", this.clientes_CC.get(cont).saldo);
						System.out.println();
						l=0;
					break;
					}
					
				}
				l = -1;
					
				}
				
				
			if(l == -1) {
				System.out.println("Cliente nao possui conta corrente..!!");
			}
			//-------------------------------------------------------------------------------//			
		}
		
		//-------------------------------------------------------------------------------//
		public  double saldo_total_CC() {
			
			double soma = 0;
			
			for(int cont=0; cont< this.clientes_CC.size(); cont++) {
				soma = soma + this.clientes_CC.get(cont).saldo;
				
			}
			return soma;
		}
		//-------------------------------------------------------------------------------//
		
	}//fim classe;
	
	

