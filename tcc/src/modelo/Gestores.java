package modelo;

public class Gestores {
	private String nomeMae;
	private String nomePai;
	private String nomeCrianca;
	private String tipagemMae;
	private String tipagemPai;
	private String fatorRhMae;
	private String fatorRhPai;

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

	public String getFatorRhMae() {
		return fatorRhMae;
	}

	public void setFatorRhMae(String fatorRhMae) {
		this.fatorRhMae = fatorRhMae;
	}

	public String getTipagemPai() {
		return tipagemPai;
	}

	public void setTipagemPai(String tipagemPai) {
		this.tipagemPai = tipagemPai;
	}

	public String getFatorRhPai() {
		return fatorRhPai;
	}

	public void setFatorRhPai(String fatorRhPai) {
		this.fatorRhPai = fatorRhPai;
	}

	@Override
	public String toString() {
		return "Nome da mãe: " + getNomeMae() + "\n" + "Tipagem da mãe: " + getTipagemMae() + "\n" + "FatorRH da mãe: " + getFatorRhMae() + "\n" + "\n" +
		"Nome do pai: " + getNomePai() +"\n" + "tipagem do pai: " + getTipagemPai() + "\n" + "Fator RH do pai: " + getFatorRhPai() + "\n" + "\n" +
		"Nome da criança: " + getNomeCrianca();
	}
}