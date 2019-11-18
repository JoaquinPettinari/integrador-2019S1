package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;

public class AgenciaDeViajes {

    private List<PaquetesDeViaje> paquetesDeViajeList;

    public AgenciaDeViajes(List<PaquetesDeViaje> paquetesDeViajeList) {
        this.paquetesDeViajeList = paquetesDeViajeList;
    }

    public void catalogoDePaquetes() {
        paquetesDeViajeList.forEach(paquetesDeViaje -> paquetesDeViaje.imprimirItinerario());
    }

}
