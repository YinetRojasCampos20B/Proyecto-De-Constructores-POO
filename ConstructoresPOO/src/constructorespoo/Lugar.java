/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorespoo;

/**
 *
 * @author rojas
 */
public class Lugar {
    
    // Atributos de la clase Lugar
    
    private String nombre;
    private String direccion;
    private int valoracion;
    
    // Constructores de la clase Lugar
    public Lugar(String nombre, String direccion, int valoracion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.valoracion = valoracion;
    }

    public Lugar(String direccion, int valoracion) {
        this.direccion = direccion;
        this.valoracion = valoracion;
    }

    public Lugar(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Lugar(String direccion) {
        this.direccion = direccion;
    }

    public Lugar(int valoracion) {
        this.valoracion = valoracion;
    }
    
}
