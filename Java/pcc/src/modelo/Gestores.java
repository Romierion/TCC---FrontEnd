package modelo;

public class Gestores {
	private String nomeMae;
	private String nomePai;
	private String nomeCrianca;
	private String tipagemMae;
	private String tipagemPai;

	public Gestores() {

	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeCrianca() {
		return nomeCrianca;
	}

	public void setNomeCrianca(String nomeCrianca) {
		this.nomeCrianca = nomeCrianca;
	}

	public String getTipagemMae() {
		return tipagemMae;
	}

	public void setTipagemMae(String tipagemMae) {
		this.tipagemMae = tipagemMae;
	}

	public String getTipagemPai() {
		return tipagemPai;
	}

	public void setTipagemPai(String tipagemPai) {
		this.tipagemPai = tipagemPai;
	}

	@Override
	public String toString() {
		return "Nome da mãe: " + getNomeMae() + "\nTipagem da mãe: " + getTipagemMae() + "\nNome do pai: " + getNomePai() +"\ntipagem do pai: " + getTipagemPai() + "\nNome da criança: " + getNomeCrianca();
	}
}
