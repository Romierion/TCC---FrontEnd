package modelo;

public class Configuracoes {
    private String nomeInstituicao, endereco, email, senha, cnpj, telefone;
	
	public Configuracoes() {
		
	}
	
	public final void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
	public final String getNomeInstituicao() {
		return this.nomeInstituicao;
	}
	
	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public final String getEndereco() {
		return this.endereco;
	}
	
	public final void setEmail(String email) {
		this.email = email;
	}
	
	public final String getEmail() {
		return this.email;
	}
	
	public final void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public final String getCnpj() {
		return this.cnpj;
	}
	
	public final void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public final String getTelefone() {
		return this.telefone;
	}
	
	public final void setSenha(String senha) {
		this.senha = senha;
	}
	
	public final String getSenha() {
		return this.senha;
	}
	
	@Override
	public final String toString() {
		return "Nome da instituicao: " + this.getNomeInstituicao() + "\n" + "CNPJ: " + this.getCnpj() + "\n" + "Telefone: " + this.getTelefone() + "\n" + "Endereço: " + this.getEndereco() + "\n" + "E-mail: " + this.getEmail() + "\n" + "Senha: " + this.getSenha();	
	}
}
