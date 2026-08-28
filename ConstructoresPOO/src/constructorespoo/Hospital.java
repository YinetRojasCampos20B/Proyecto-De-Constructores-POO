/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorespoo;

/**
 *
 * @author rojas
 */
public class Hospital extends Lugar {
    
    // Atributos de la clase hija Hospital

    private char nivelComplejidad;
    private String especializacion;
    private boolean tieneHelipuerto;
    
    // Constructores de la clase hija Hospital
    public Hospital(String nombre, String direccion, int valoracion, char nivelComplejidad, String especializacion, boolean tieneHelipuerto) {
        super(nombre, direccion, valoracion);
        this.nivelComplejidad = nivelComplejidad;
        this.especializacion = especializacion;
        this.tieneHelipuerto = tieneHelipuerto;
    }

    public Hospital(String nombre, int valoracion, char nivelComplejidad) {
        super(nombre, valoracion);
        this.nivelComplejidad = nivelComplejidad;
    }

    public Hospital(String direccion, String nombre, char nivelComplejidad, String especializacion) {
        super(direccion, nombre);
        this.nivelComplejidad = nivelComplejidad;
        this.especializacion = especializacion;
    }

    public Hospital(String nombre, char nivelComplejidad, boolean tieneHelipuerto) {
        super(nombre);
        this.nivelComplejidad = nivelComplejidad;
        this.tieneHelipuerto = tieneHelipuerto;
    }

    public Hospital(String nombre, boolean tieneHelipuerto) {
        super(nombre);
        this.tieneHelipuerto = tieneHelipuerto;
    }
    
}
