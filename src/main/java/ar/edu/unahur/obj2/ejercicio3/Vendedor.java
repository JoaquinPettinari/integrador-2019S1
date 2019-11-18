package ar.edu.unahur.obj2.ejercicio3;

public class Vendedor {

    private TipoDeVendedor tipoDeVendedor;

    public Vendedor(TipoDeVendedor tipoDeVendedor) {
        this.tipoDeVendedor = tipoDeVendedor;
    }

    public double comision(double montoVenta) {
        return tipoDeVendedor.calcularComision(montoVenta);
    }
}
