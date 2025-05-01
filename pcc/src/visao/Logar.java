package visao;

import java.util.Scanner;
import modelo.Login;

public class Logar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login l = new Login();
		
		System.out.println("E-mail: ");
		l.setEmail(sc.nextLine());
		System.out.println("Senha: ");
		l.setEmail(sc.nextLine());
		System.out.println("\n" + l);
		sc.close();
	}

}
