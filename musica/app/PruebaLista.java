/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.app;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;

public class PruebaLista {
    public static void main(String[] args) {
        ArrayList<String> generosMusicales = new ArrayList<>();
        generosMusicales.add("Rock");
        generosMusicales.add("Salsa");
        generosMusicales.add("Vallenato");
        
        System.out.println(generosMusicales.size());
        System.out.println(generosMusicales.get(1));
        
        generosMusicales.set(1, "Merengue");
        generosMusicales.add(0, "Pop");
        System.out.println(generosMusicales);
        
        generosMusicales.remove("Rock");
        System.out.println(generosMusicales.contains("Rock"));
        System.out.println(generosMusicales.indexOf("Vallenato"));
        
        for (int i = 0; i < generosMusicales.size(); i++) {
            System.out.println(generosMusicales.get(i).toUpperCase());
        }
    }
}