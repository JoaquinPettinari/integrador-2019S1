package ar.edu.unahur.obj2.ejercicio3;

public class Experto implements TipoDeVendedor {

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.40;
    }
}
