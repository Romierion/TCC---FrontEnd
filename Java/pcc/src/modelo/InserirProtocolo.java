package modelo;

public class InserirProtocolo {

    private String protocolo;

    public InserirProtocolo() {

    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public String toString() {
        return "Protocolo: " + getProtocolo();
    }
}