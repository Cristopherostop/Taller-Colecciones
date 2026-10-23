/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.app;

/**
 *
 * @author Hp
 */
import parqueadero.modelo.Parqueadero;

public class Main {
    public static void main(String[] args) {
        Parqueadero central = new Parqueadero("Centro", 2);
        Parqueadero norteEstacion = new Parqueadero("Norte", 3);

        central.ingresar("ABC123");
        central.ingresar("ABC123");
        central.ingresar("XYZ789");
        central.ingresar("JKL456");

        System.out.println(central.salir("ABC123"));
        central.ingresar("JKL456");
        norteEstacion.ingresar("MNO321");

        System.out.println(central.puestosLibres());
        System.out.println(norteEstacion.puestosLibres());
        System.out.println(Parqueadero.getIngresosTotales());
    }
}