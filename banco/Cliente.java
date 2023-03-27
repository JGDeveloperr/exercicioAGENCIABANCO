package banco;

import java.util.ArrayList;


public class Cliente {
	public String cpf;
	public String nome;
	public String email;
	
	//-----------------------------------------------------------;
	
	ArrayList<Cliente>Clientes = new ArrayList<>();
	
	//-----------------------------------------------------------;
	
	
	public Cliente() {}


	public Cliente(String cpf, String nome, String email){
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	//-----------------------------------------------------------;	
		
		
	public void retorna_nome_cliente(String Cpf) {
		
		
		
		for(int cont=0; cont< this.Clientes.size(); cont++) {
			
			if(this.Clientes == null) {
				System.out.println("Cliente não existente");
				break;
			}
			
			if(Cpf.equals(this.Clientes.get(cont).cpf)) {
				
				System.out.printf("Nome do Cliente : %s", this.Clientes.get(cont).nome);
				
				break;
			}
			
			
			
		}
		
		
	}
	
	//-----------------------------------------------------------;
		
	
	public void ArrayList(Cliente objeto) {
		
		int j =0;
		
		for(int cont = 0; cont < this.Clientes.size(); cont++) {
			
			if(objeto.cpf.equals(this.Clientes.get(cont).cpf)) {
				j = 1;//registra 1 caso for duplicar cliente e descarta dados;
			}
		}
		
		if(j==0) {
			
			this.Clientes.add(objeto);
		}
	}
}




