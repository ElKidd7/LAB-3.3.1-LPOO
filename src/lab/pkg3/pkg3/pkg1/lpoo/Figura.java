
package lab.pkg3.pkg3.pkg1.lpoo;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
