/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consecionario;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args) {

       Consecionario con =new Consecionario();
        Automovil auto1 = new Automovil("TOYOTA", "2022", 4);
        Automovil auto2 = new Automovil("NISAN", "2011", 4);
        Automovil auto3 = new Automovil("CHEVROLET", "2009", 2);
        Automovil auto4 = new Automovil("AUDI", "2018", 4);

        Cliente cli1 = new Cliente("10029834", "pepe", "Perez", "Cucuta", 'M');
        Cliente cli2 = new Cliente("9823232", "Jorge", "Ramirez", "Medellin", 'M');
        Cliente cli3 = new Cliente("1034545", "Sara", "Lopez", "Bogota", 'F');
        Cliente cli4 = new Cliente("372443", "Susan", "Caseres", "Barranquilla", 'F');

        con.addCliente(cli1);
        con.addCliente(cli2);
        con.addCliente(cli3);
        con.addCliente(cli4);

        cli1.comprarAutomovil(auto1);
        cli1.comprarAutomovil(auto2);
        cli3.comprarAutomovil(auto3);
        cli4.comprarAutomovil(auto4);
        
        con.tipoGenero();
        
        auto1.actualizar("Ferrari", "2022", 2);
        auto2.actualizar("Tesla", "2020", 4);
        auto2.actualizar("Lamborgini", "2021", 4);
        auto2.actualizar("Ford", "2020", 2);

    }
}
