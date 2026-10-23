/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.modelo;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;

public class Playlist {
    private String nombrePlaylist;
    private ArrayList<Cancion> listaCanciones;
    public static final int MAX_CANCIONES = 3;

    public Playlist(String nombre) {
        this.nombrePlaylist = nombre;
        this.listaCanciones = new ArrayList<>();
    }

    public boolean agregar(Cancion item) {
        if (item == null || listaCanciones.size() >= MAX_CANCIONES) {
            return false;
        }
        for (int i = 0; i < listaCanciones.size(); i++) {
            if (listaCanciones.get(i).getTitulo().equalsIgnoreCase(item.getTitulo())) {
                return false;
            }
        }
        listaCanciones.add(item);
        return true;
    }

    public void mostrar() {
        System.out.println(nombrePlaylist + ":");
        int pos = 1;
        for (Cancion cancion : listaCanciones) {
            System.out.println(pos + ". " + cancion.getTitulo() + " " + cancion.getArtista() + " (" + cancion.getDuracion() + " s)");
            pos++;
        }
    }

    public int duracionTotal() {
        int acumulado = 0;
        for (int i = 0; i < listaCanciones.size(); i++) {
            acumulado += listaCanciones.get(i).getDuracion();
        }
        return acumulado;
    }

    public Cancion buscar(String tit) {
        for (Cancion cancion : listaCanciones) {
            if (cancion.getTitulo().equalsIgnoreCase(tit)) {
                return cancion;
            }
        }
        return null;
    }

    public int eliminarArtista(String art) {
        int borradas = 0;
        for (int i = listaCanciones.size() - 1; i >= 0; i--) {
            if (listaCanciones.get(i).getArtista().equalsIgnoreCase(art)) {
                listaCanciones.remove(i);
                borradas++;
            }
        }
        return borradas;
    }
}