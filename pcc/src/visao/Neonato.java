package visao;

import java.util.Scanner;
import controle.Probabilidade;
import modelo.Gestores;

public class Neonato {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gestores g = new Gestores();
		
		boolean loop = false;
		do {
			System.out.println("\nNome da mãe: ");
			String nomeMae = sc.nextLine().trim();
			if (!nomeMae.equals("")) {
				g.setNomeMae(nomeMae);
				loop = true;
			} else {
				System.out.println("Digite o nome da mãe.");
				loop = false;
			}
		} while (loop == false);

		
		do {
			System.out.println("Tipagem Sanguínea da Mãe: ");
			String tipagem = sc.nextLine().trim().toUpperCase(); // .trim() remove espaços extras; .toUpperCase() torna todas as Strings em caixa alta
			if (tipagem.matches("^(A|O|B|AB)$")) { // Verifica se o usuário digitou as letras reconhecidas (A, O, B e AB)
				g.setTipagemMae(tipagem); // Seta a tipagem de acordo com a variável definida acima
				loop = true;
			} else {
				System.out.println("Erro: Tipagem sanguãnea invãlida! Use apenas A, O, B ou AB.");
				loop = false;
			}
		} while (loop == false); // Forma mais legível de manter o loop

		do {
			System.out.println("Fator RH da mãe: ");
			String fatorRh = sc.nextLine().trim();
			if (fatorRh.matches("^[+-]$")) {
				g.setFatorRhMae(fatorRh);
				loop = true;
			} else {
				System.out.println("Erro: Fator RH inválido! Use apenas + ou -.");
				loop = false;
			}
		} while (loop == false);

		do {
			System.out.println("Nome de pai: ");
			String nomePai = sc.nextLine().trim();
			if (!nomePai.equals("")) {
				g.setNomePai(nomePai);
				loop = true;
			} else {
				System.out.println("Digite o nome do pai.");
				loop = false;
			}
		} while (loop == false);

		do {
			System.out.println("Tipagem Sanguínea do Pai: ");
			String tipagem = sc.nextLine().trim().toUpperCase(); // .trim() remove espaços extras; .toUpperCase() torna todas as Strings em caixa alta
			if (tipagem.matches("^(A|O|B|AB)$")) { // Verifica se o usuário digitou as letras reconhecidas (A, O, B e AB)
				g.setTipagemPai(tipagem); // Seta a tipagem de acordo com a variável definida acima
				loop = true;
			} else {
				System.out.println("Erro: Tipagem sanguínea inválida! Use apenas A, O, B ou AB.");
				loop = false;
			}

		} while (loop == false); // Forma mais legível de manter o loop

		do {
			System.out.println("Fator RH do pai: ");
			String fatorRh = sc.nextLine().trim();
			if (fatorRh.matches("^[+-]$")) {
				g.setFatorRhPai(fatorRh);
				loop = true;
			} else {
				System.out.println("Erro: Fator RH inválido! Use apenas + ou -.");
				loop = false;
			}
		} while (loop == false);

		System.out.println("Nome da criança: ");
		String nomeCrianca = sc.nextLine().trim();
		g.setNomeCrianca(nomeCrianca);
		
		
		System.out.println("\n\n" + g);
		Probabilidade.calcularTipagemCrianca(g.getTipagemMae(), g.getTipagemPai());
		Probabilidade.calcularFatorRhCrianca(g.getFatorRhMae(), g.getFatorRhPai());
		Probabilidade.transfusaoCrianca(g.getTipagemMae(), g.getTipagemPai(), g.getFatorRhMae(), g.getFatorRhPai());

		
		sc.close();
	}
}