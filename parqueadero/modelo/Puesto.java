/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.modelo;

/**
 *
 * @author Hp
 */
public class Puesto {
    private int id;
    private String matricula;

    Puesto(int id) {
        this.id = id;
        this.matricula = null;
    }

    public int getNumero() {
        return id;
    }

    public String getPlaca() {
        return matricula;
    }

    public boolean estaLibre() {
        return matricula == null;
    }

    public void ocupar(String textPlaca) {
        this.matricula = textPlaca;
    }

    public void liberar() {
        this.matricula = null;
    }
}