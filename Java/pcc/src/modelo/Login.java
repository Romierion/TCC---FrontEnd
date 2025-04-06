package modelo;

public class Login {
	private String email;
	private String senha;
	
	public Login() {
		
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	@Override
	public String toString() {
		return "E-mail: " + getEmail() + "\n" + "Senha: " + getSenha();
	}
}