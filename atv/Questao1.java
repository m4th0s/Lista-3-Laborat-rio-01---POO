
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Equacao equacao = new Equacao();

        double a, b, c;
        double delta, x1, x2;

        System.out.println("Digite o valor de A:");
        a = sc.nextDouble();

        System.out.println("Digite o valor de B:");
        b = sc.nextDouble();

        System.out.println("Digite o valor de C:");
        c = sc.nextDouble();

        if (a != 0) {

            equacao.definirValores(a, b, c);

            delta = equacao.calculaDelta();

            if (delta > 0) {

                x1 = equacao.calculaX1();
                x2 = equacao.calculaX2();

                System.out.println("Delta: " + delta);
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);

            } else if (delta == 0) {

                x1 = equacao.calculaX1();

                System.out.println("Delta: " + delta);
                System.out.println("Existe apenas uma raiz: " + x1);

            } else {

                System.out.println("Nao existem raizes reais.");

            }

        } else {

            System.out.println("O valor de A nao pode ser zero.");

        }

        sc.close();
    }
}
