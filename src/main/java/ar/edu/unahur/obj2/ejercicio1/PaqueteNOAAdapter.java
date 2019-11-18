package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteNOAAdapter implements PaquetesDeViaje {

    private PaqueteNOA paqueteNOA;

    public PaqueteNOAAdapter(PaqueteNOA paqueteNOA) {
        this.paqueteNOA = paqueteNOA;
    }

    @Override
    public void imprimirItinerario() {
        paqueteNOA.itinerario();
    }
}
