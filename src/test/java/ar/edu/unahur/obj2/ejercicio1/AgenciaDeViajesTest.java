package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class AgenciaDeViajesTest {

    private PaquetePatagoniaAdapter paquetePatagonia;
    private PaqueteCuyoAdapter paqueteCuyo;
    private PaqueteNOAAdapter paqueteNOA;
    private AgenciaDeViajes agenciaDeViajes;


    @BeforeTest
    public void setup() {
        paquetePatagonia = new PaquetePatagoniaAdapter(new PaquetePatagonia());
        paqueteCuyo = new PaqueteCuyoAdapter(new PaqueteCuyo());
        paqueteNOA = new PaqueteNOAAdapter(new PaqueteNOA());
        agenciaDeViajes = new AgenciaDeViajes(Stream.of(paqueteCuyo,paquetePatagonia,paqueteNOA).collect(Collectors.toList()));
    }

    @org.testng.annotations.Test
    public void testCatalogoDePaquetes() {
        agenciaDeViajes.catalogoDePaquetes();
    }
}