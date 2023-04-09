public class Main {
    public static void main(String[] args) {

        double precio = precioConIva(23000);

        System.out.println("El precio + IVA es: $"+precio+" COP");
    }

    static double precioConIva(double precio) {
        return precio * 1.19;
    }
}
