package visao;

import java.util.Scanner;
import controle.Probabilidade;
import modelo.Gestores;

public class Neonato {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gestores g = new Gestores();
		
		System.out.println("Nome da mãe: ");
		String nomeMae = sc.nextLine().trim();
		g.setNomeMae(nomeMae);		
	
		System.out.println("Tipagem Sanguínea da Mãe: ");
		String tipagemMae = sc.nextLine().trim().toUpperCase(); // .trim() remove espaços extras; .toUpperCase() torna todas as Strings em caixa alta
		g.setTipagemMae(tipagemMae); // Seta a tipagem de acordo com a variável definida acima
			
		System.out.println("Nome de pai: ");
		String nomePai = sc.nextLine().trim();
		g.setNomePai(nomePai);
		
		System.out.println("Tipagem Sanguínea do Pai: ");
		String tipagemPai = sc.nextLine().trim().toUpperCase(); // .trim() remove espaços extras; .toUpperCase() torna todas as Strings em caixa alta
		g.setTipagemPai(tipagemPai); // Seta a tipagem de acordo com a variável definida acima

		System.out.println("Nome da criança: ");
		String nomeCrianca = sc.nextLine().trim();
		g.setNomeCrianca(nomeCrianca);
		
		
		System.out.println("\n\n" + g);
		Probabilidade.calcularTipagemCrianca(g.getTipagemMae(), g.getTipagemPai());
		Probabilidade.transfusaoCrianca(g.getTipagemMae(), g.getTipagemPai());

		
		sc.close();
	}
}
