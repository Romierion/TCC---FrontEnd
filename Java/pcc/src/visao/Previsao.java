package visao;

import java.util.Scanner;
import modelo.Parto;

public class Previsao {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Parto p = new Parto();
        
        System.out.println("Dia da última menstruação: ");
        p.setDia(sc.nextInt());

        System.out.println("Mês da última menstruação: ");
        p.setMes(sc.nextInt());

        System.out.println("Ano da última menstruação: ");
        p.setAno(sc.nextInt());

        int dia = p.getDia();
        int mes = p.getMes(); 
        int ano = p.getAno(); 
        
        dia += 7;
        if (dia > 31) {
            dia -= 31;
            mes++;
        }

        if (mes >= 4) {
            mes -= 12;
            ano++;
        }

        if (mes <= 3) {
            mes += 9;
            if (mes > 12) {
                mes -= 12;
                ano++;
            }
        }

        System.out.println("\nA data prevista do parto é para o dia: " + dia + "/" + mes + "/" + ano);
        sc.close();
    }
}