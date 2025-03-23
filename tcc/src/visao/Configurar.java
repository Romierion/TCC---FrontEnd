package visao;

import java.util.Scanner;
import modelo.Configuracoes;

public class Configurar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Configuracoes c = new Configuracoes();
	
		boolean loop = false;
		do {
			System.out.println("Nome da instituição: ");
			String nome = sc.nextLine().trim();
			if(!nome.equals("")) {
				c.setNomeInstituicao(nome);
				loop = true;
			} else {
				System.out.println("Digite o nome da instituição.");
				loop = false;
			}
		} while (loop == false);
			
		do {
			System.out.println("CNPJ: ");
			String cnpj = sc.nextLine().trim();
			if(!cnpj.equals("")) {
				c.setCnpj(cnpj);
				loop = true;
			} else {
				System.out.println("DIgite o cnpj.");
				loop = false;
			}
		} while (loop ==false);
		
		do {
			System.out.println("Telefone: ");
			String telefone = sc.nextLine().trim();
			if(!telefone.equals("")) {
				c.setTelefone(telefone);
				loop = true;
			} else {
				System.out.println("Digite o número de telefone.");
				loop = false;
			}
		} while (loop == false);
		
		do {
			System.out.println("Endereço: ");
			String endereco = sc.nextLine().trim();
			if(!endereco.equals("")) {
				c.setEndereco(endereco);
				loop = true;
			} else {
				System.out.println("Digite o endereço.");
				loop = false;
			}
		} while (loop == false);
		
		do {
			System.out.println("E-mail: ");
			String email = sc.nextLine().trim();
			if(!email.equals("")) {
				c.setEmail(email);
				loop = true;
			} else {
				System.out.println("Digite um email.");
				loop = false;
			}
		} while (loop == false);
		
		do {
			System.out.println("Senha: ");
			String senha = sc.nextLine();
			if(!senha.equals("")) {
				c.setSenha(senha);
				loop = true;
			} else {
				System.out.println("Digite uma senha de 5 a 15 caracteres.");
				loop = false;
			}
		} while (loop == false);
				
		System.out.println("\n" + c);
		sc.close();
	}
}