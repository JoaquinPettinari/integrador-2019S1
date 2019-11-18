package ar.edu.unahur.obj2.ejercicio1;

public class PaquetePatagoniaAdapter implements PaquetesDeViaje {

    private PaquetePatagonia paquetePatagonia;

    public PaquetePatagoniaAdapter(PaquetePatagonia paquetePatagonia) {
        this.paquetePatagonia = paquetePatagonia;
    }

    @Override
    public void imprimirItinerario() {
        paquetePatagonia.getItinerario();
    }
}
