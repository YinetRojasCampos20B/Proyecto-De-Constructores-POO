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
    
    
    }
    
}
