package banco;
import java.util.Scanner;


public class main {
	
	public static void menu() {
		System.out.println();
		System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem vindos a nossa Agencia---------------");

        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operacao que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opcao 1 - Criar conta   			|");
        System.out.println("|   Opcao 2 - Depositar     			|");
        System.out.println("|   Opcao 3 - Sacar         			|");
        System.out.println("|   Opcao 4 - Capital do Banco    			|");
        System.out.println("|   Opcao 5 - Listar todas contas       |");
        System.out.println("|   Opcao 6 - Sair          			|");
        
        System.out.println();
	}

	public static void main(String[] args) {
				
				
				
				//-----------------------------------------------------------;
				
				
				
				Scanner teclado = new Scanner(System.in);
				
				
				contaCorrente novaCC = new contaCorrente();
				contaPoupanca novaCP = new contaPoupanca();
				
				
				
				//-----------------------------------------------------------;
				//criando nova conta CC ou CP;
				 
				int opcao=-1;
				
				
		        while(opcao != 6) {
		        	
		        	menu();
		        	
		        	System.out.print("Digite opcao: ");	
		        	opcao = teclado.nextInt();teclado.nextLine();
				
				
		        	if(opcao == 1) {
					
					
		        		System.out.print("Digite o nome do cliente: ");
		        		String nome = teclado.nextLine();
					
		        		System.out.print("Digite o cpf do cliente: ");
		        		String cpf = teclado.nextLine();
					
		        		System.out.print("Digite o email do cliente: ");
		        		String email = teclado.nextLine();
					
					
		        		Cliente novocliente = new Cliente(cpf, nome, email);
		        		novocliente.ArrayList(novocliente);
		        		
		        		System.out.println();
		        		System.out.println("Selecione qual tipo de conta deseja ter ");
		        		System.out.println("1 -> Corrente | 2 ->  poupanca ");
		        		System.out.print("Digite: ");
		        		Integer input = teclado.nextInt();teclado.nextLine();
		        		
		        		switch (input) {
					
							case 1:
								novaCC.salva_CC(cpf);
								
							
								break;
							case 2:
								novaCP.salva_CP(cpf);
								
								
								break;
							default:
								System.out.println("Opcao inválida!");
							
							}
		        		}
					
					
					
		        	if(opcao == 2) {
					
		        		System.out.print("Digite o cpf: ");
		        		String cpf1 = teclado.nextLine();
					
		        		System.out.print("Digite o valor que deseja depositar: ");
		        		Double valor = teclado.nextDouble();teclado.nextLine();
					
		        		novaCC.depositarCC(cpf1, valor);
		        		novaCP.depositarCP(cpf1, valor);
					
					
		        	}
		        	
		        	if(opcao == 3){
		        		
		        		System.out.print("Digite o cpf: ");
		        		String cpf2 = teclado.nextLine();
					
		        		System.out.print("Digite o valor que deseja sacar: ");
		        		Double valor1 = teclado.nextDouble();teclado.nextLine();
					
		        		novaCC.sacarCC(cpf2, valor1);
		        		novaCP.sacarCP(cpf2, valor1);
		        		
		        	}
		        	
		        	if(opcao == 4) {
		        		double saldo = novaCC.saldo_total_CC() + novaCP.saldo_total_CP();
		        		System.out.printf("\nSaldo total do banco: %.2f", saldo);
		        		
		        	}
				
		        	if(opcao == 5) {
					
		        		novaCP.imprime_todas_CP();
		        		novaCC.imprime_todas_CC();
					
		        	}
				
		        	if(opcao == 6) {
					
		        		System.out.println("Obriado por nos escolher!");
		        		System.exit(0); 
		        	}
				
		        	if(opcao > 6 || opcao <= 0) {
					
		        		System.out.println("Opção inválida!");
	                
		        	}  
				
				
				//-----------------------------------------------------------;
		        }}}

		        		
			




