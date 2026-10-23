/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.app;

/**
 *
 * @author Hp
 */
import musica.modelo.Cancion;
import musica.modelo.Playlist;

public class Reproductor {
    public static void main(String[] args) {
        Cancion song1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion song2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion song3 = new Cancion("Noche en Chipre", "Nevado", 185);
        Cancion song4 = new Cancion("Río Chinchiná", "Nevado", 230);

        Playlist favs = new Playlist("Favoritas");
        System.out.println(favs.agregar(song1));
        System.out.println(favs.agregar(song2));
        System.out.println(favs.agregar(song3));
        System.out.println(favs.agregar(song1));
        
        favs.mostrar();
        System.out.println(favs.duracionTotal());

        Playlist roadTrip = new Playlist("Viaje");
        roadTrip.agregar(song1);
        roadTrip.agregar(song2);

        System.out.println(favs.eliminarArtista("Nevado"));
        favs.mostrar();
        roadTrip.mostrar();

        System.out.println(favs.buscar("bajo el guadual").getArtista());
        System.out.println(favs.buscar("Lluvia en Manizales"));

        System.out.println(roadTrip.agregar(song3));
        System.out.println(roadTrip.agregar(song4));
        System.out.println(Cancion.getTotalCanciones());
        System.out.println(Playlist.MAX_CANCIONES);
    }
}