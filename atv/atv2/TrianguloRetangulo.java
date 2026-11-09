package atv2;


public class TrianguloRetangulo {

    double h, c1, c2;

    public double calculaHipotenusa() {

        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

        return h;
    }

    public double calculaArea() {

        double area;

        area = (c1 * c2) / 2;

        return area;
    }

    public void definirCatetos(double c1, double c2) {

        this.c1 = c1;
        this.c2 = c2;
    }
}
