
package baralhoc;
import java.util.Scanner;

public class BaralhoC {

public static void main(String[] args) {
        BaralhoC baralho = new BaralhoC();
        int saida = 0;

        while (saida == 0) {
            System.out.println("Informe a opção desejada");
            System.out.println("========================");
            System.out.println("                        ");
            System.out.println("1 - Montar Baralho");
            System.out.println("2 - Embaralhar ");
            System.out.println("3 - Exibir o Baralho ");
            System.out.println("4 - Sair ");
            Scanner s = new Scanner(System.in);
            int op = s.nextInt();
            switch (op) {
                case 1:
                    montarBaralho();
                    break;
                case 2:
                    metEmbaralhar();
                    break;
                case 3:
                    metMostrar();
                    break;
                case 4:
                    System.out.println("Saindo-----");
                    saida = 1;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

    }
    

}
}
}

        


