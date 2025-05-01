package modelo;

public class Parto {
	public static int contador = 0;
	private int dia;
	private int mes;
	private int ano; 

    public Parto() { 
		
    }
    
    public int getDia(){
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

    @Override
    public String toString(){
        return "Dia da última menstruação: " + getDia() + "\n" + "Mês da última menstruação: " + getMes() + "\n" + "Ano da última menstruação: " + getAno();
    }

	public static void incrementar() {
		contador++;
	}
}