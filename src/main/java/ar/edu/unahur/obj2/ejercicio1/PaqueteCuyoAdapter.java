package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteCuyoAdapter implements PaquetesDeViaje {

    private PaqueteCuyo paqueteCuyo;

    public PaqueteCuyoAdapter(PaqueteCuyo paqueteCuyo) {
        this.paqueteCuyo = paqueteCuyo;
    }

    @Override
    public void imprimirItinerario() {
        paqueteCuyo.imprimirItinerario();
    }
}
