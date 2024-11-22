
package lab.pkg3.pkg3.pkg1.lpoo;

public class Rectangulo extends Figura implements Dibujable, Escalable {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de base " + base + " y altura " + altura);
    }

    @Override
    public void escalar(double factor) {
        base *= factor;
        altura *= factor;
        System.out.println("El rectángulo ha sido escalado con un factor de " + factor);
    }
}
