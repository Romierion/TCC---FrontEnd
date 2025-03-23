package visao;

import java.util.Scanner;
import modelo.InserirProtocolo;

public class Protocolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InserirProtocolo p = new InserirProtocolo();

        System.out.println("Digite o número de protocolo: ");
        String protocolo = sc.next();
        p.setProtocolo(protocolo);

        System.out.println("\n" + p);
        sc.close();
    }
}
