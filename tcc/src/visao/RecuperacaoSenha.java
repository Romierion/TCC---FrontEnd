package visao;

import java.util.Scanner;
import modelo.RecuperarSenha;

public class RecuperacaoSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecuperarSenha r = new RecuperarSenha();
		
		System.out.println("Digite o e-mail de reuperação de senha: ");
		r.setEmail(sc.nextLine());
		System.out.println("\n" + r);
		sc.close();
	}
}
