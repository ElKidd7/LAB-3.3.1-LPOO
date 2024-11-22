
package lab.pkg3.pkg3.pkg1.lpoo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 5, 3);

        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        rectangulo.dibujar();
        rectangulo.escalar(2);

        System.out.println("Nueva área: " + rectangulo.calcularArea());
        System.out.println("Nuevo perímetro: " + rectangulo.calcularPerimetro());
    }
}
