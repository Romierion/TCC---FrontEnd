package modelo;

public class RecuperarSenha {
	private String email;
	
		public RecuperarSenha() {
			
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getEmail() {
			return email;
		}
		
		@Override
		public String toString() {
			return "Link de recuperação enviado para o e-mail de recuperação: " + getEmail();
		}
}
