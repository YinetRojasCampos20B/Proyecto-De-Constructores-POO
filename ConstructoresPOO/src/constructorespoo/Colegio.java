/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorespoo;

/**
 *
 * @author rojas
 */
public class Colegio extends Lugar {
    
     // Atributos de la clase hija Colegio

    private char calendario;
    private String tipoColegio;
    private boolean tieneConvenioSENA;
    
    // Constructores de la clase Colegio
    
    public Colegio(String nombre, String direccion, int valoracion, char calendario, String tipoColegio, boolean tieneConvenioSENA) {
        super(nombre, direccion, valoracion);
        this.calendario = calendario;
        this.tipoColegio = tipoColegio;
        this.tieneConvenioSENA = tieneConvenioSENA;
    }
    
    public Colegio(String direccion, int valoracion, char calendario, boolean tieneConvenioSENA) {
        super(direccion, valoracion);
        this.calendario = calendario;
        this.tieneConvenioSENA = tieneConvenioSENA;
    }

    public Colegio(int valoracion, char calendario, String tipoColegio) {
        super(valoracion);
        this.calendario = calendario;
        this.tipoColegio = tipoColegio;
    }
    
}
