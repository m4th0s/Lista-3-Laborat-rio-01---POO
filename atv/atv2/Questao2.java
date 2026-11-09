package atv2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TrianguloRetangulo triangulo = new TrianguloRetangulo();

        double c1, c2;
        double hipotenusa, area;

        System.out.println("Digite o primeiro cateto:");
        c1 = sc.nextDouble();

        System.out.println("Digite o segundo cateto:");
        c2 = sc.nextDouble();

        triangulo.definirCatetos(c1, c2);

        hipotenusa = triangulo.calculaHipotenusa();

        area = triangulo.calculaArea();

        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Area do triangulo: " + area);

        sc.close();
    }
}
