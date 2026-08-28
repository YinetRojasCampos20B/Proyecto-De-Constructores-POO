/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorespoo;

/**
 *
 * @author rojas
 */
public class Hotel extends Lugar {
    
    // Atributos de la clase hija Hotel
    
    private String ponderacion;
    private boolean tieneWifi;
    
    // Constructores de la clase hija Hotel
    public Hotel(String ponderacion, boolean tieneWifi, String nombre, String direccion, int valoracion) {
        super(nombre, direccion, valoracion);
        this.ponderacion = ponderacion;
        this.tieneWifi = tieneWifi;
    }

    public Hotel(String nombre, String ponderacion, int valoracion, boolean tieneWifi) {
        super(nombre, valoracion);
        this.tieneWifi = tieneWifi;
        this.ponderacion = ponderacion;
    }

    public Hotel(String nombre, String ponderacion, boolean tieneWifi) {
        super(nombre);
        this.tieneWifi = tieneWifi;
        this.ponderacion = ponderacion;
    }

    public Hotel(String nombre, String ponderacion) {
        super(nombre);
        this.ponderacion = ponderacion;
    }
    
}
