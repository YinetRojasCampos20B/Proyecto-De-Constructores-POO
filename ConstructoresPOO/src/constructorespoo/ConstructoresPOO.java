/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorespoo;

/**
 *
 * @author rojas
 */
public class ConstructoresPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa principal

        /**
         * OBJETOS DE LA CLASE HIJA HOTEL
         *
         */
        // Método #1
        Hotel miHotel = new Hotel("5 estrellas", true, "Hotel Dann Carlton", "Calle 199 #24-23", 3);
        Hotel hotelLina = new Hotel("5 estrellas", true, "Hotel Tequendama", "Calle 27 #33-53", 4);

        // Método #2
        Hotel hotelA = new Hotel("Hotel Chía", "3 estrellas", 2, false);
        Hotel hotelB = new Hotel("Hotel Pyongyang", "4 estrellas", 5, true);

        // Método #3
        Hotel hotelC = new Hotel("Hotel Caracas S.A.", "2 estrellas", true);
        Hotel hotelD = new Hotel("The Windstone Hotel", "4 estrellas", false);

        // Método #4
        Hotel hotelE = new Hotel("Hotel Caracas S.A.", "5 estrellas");
        Hotel hotelF = new Hotel("The Windstone Hotel", "1 estrella");
    
        /**
         * OBJETOS DE LA CLASE HIJA HOSPITAL
         *
         */
        // Método #1
        Hospital miHospital = new Hospital("Hospital de Usme", "Kr 5a Este #111c-05 Sur", 3, '3', "Consulta externa", true);
        Hospital hospitalLina = new Hospital("Hospital de la Misericordia", "Av. Caracas #1-07 Sur", 4, '2', "Pediatría hospitalaria", false);

        // Método #2
        Hospital hospitalA = new Hospital("Hospital de Muy Muy Lejano", 5, '2');
        Hospital hospitalB = new Hospital("Fundación Hospitalaria Hermanos de la Fe", 3, '4');

        // Método #3
        Hospital hospitalC = new Hospital("Calle 9 #10-1232", "MiSalud Hospital", '2', "Cirugía maxilofacial");
        Hospital hospitalD = new Hospital("Avenida 3ra #1-1", "Medplus Centro de Salud", '4', "Lobotomía");

        // Método #4
        Hospital hospitalE = new Hospital("Fundación Clínica del Dolor", '4', true);
        Hospital hospitalF = new Hospital("Krakenhaus Compañía de Jesús", '3', false);

        // Método #5
        Hospital hospitalG = new Hospital("Nazukasokotsune Healthcare", true);
        Hospital hospitalH = new Hospital("SENAgoga Hospital", false);
        
        /**
         * OBJETOS DE LA CLASE HIJA COLEGIO
         *
         */
        // Método #1
        Colegio miColegioLegendario = new Colegio("Colegio Westernfall City", "Calle 13 #200-2", 5, 'B', "Privado", true);
        Colegio colegioLina = new Colegio("Random Kristweil Duale Schule", "Carrera 2213 #200-2", 5, 'A', "Público", false);

        // Método #2
        Colegio colegioA = new Colegio("Carrera 200 #23-32", 4, 'A', false);
        Colegio colegioB = new Colegio("Transversal 80 #221-23", 3, 'B', true);

        // Método #3
        Colegio colegioC = new Colegio(4, 'B', "Privado");
        Colegio colegioD = new Colegio(3, 'A', "Público");
    
    }
    
}
