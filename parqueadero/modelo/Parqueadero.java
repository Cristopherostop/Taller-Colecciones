/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.modelo;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;

public class Parqueadero {
    private String nombreParqueadero;
    private ArrayList<Puesto> espacios;
    private static int totalIngresos = 0;

    public Parqueadero(String nombre, int capacidad) {
        this.nombreParqueadero = nombre;
        this.espacios = new ArrayList<>();
        int idx = 1;
        while(idx <= capacidad) {
            espacios.add(new Puesto(idx));
            idx++;
        }
    }

    public static int getIngresosTotales() {
        return totalIngresos;
    }

    public void ingresar(String autoPlaca) {
        for (Puesto p : espacios) {
            if (!p.estaLibre() && p.getPlaca().equalsIgnoreCase(autoPlaca)) {
                System.out.println(autoPlaca + " ya está adentro");
                return;
            }
        }

        for (int i = 0; i < espacios.size(); i++) {
            Puesto p = espacios.get(i);
            if (p.estaLibre()) {
                p.ocupar(autoPlaca);
                totalIngresos++;
                System.out.println(autoPlaca + " en puesto " + p.getNumero());
                return;
            }
        }

        System.out.println(autoPlaca + ": parqueadero lleno");
    }

    public boolean salir(String autoPlaca) {
        for (Puesto p : espacios) {
            if (!p.estaLibre() && p.getPlaca().equalsIgnoreCase(autoPlaca)) {
                p.liberar();
                return true;
            }
        }
        return false;
    }

    public int puestosLibres() {
        int countLibres = 0;
        for (Puesto p : espacios) {
            if (p.estaLibre()) {
                countLibres++;
            }
        }
        return countLibres;
    }
}