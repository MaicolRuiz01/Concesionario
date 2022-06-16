/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionario;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Consecionario {

    private ArrayList<Cliente> clientes;

    public Consecionario() {
        clientes = new ArrayList<>();
    }
    
     public void addCliente(Cliente cliente) {

        clientes.add(cliente);
    }

    public void tipoGenero() {
        int contM = 0;
        int contF = 0;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getGenero() == 'M') {
                contM++;
            } else if (clientes.get(i).getGenero() == 'F') {
                contF++;
            }

        }
        System.out.println("EL Numero de Hombres en el Consecionario es de : " + contM + 
                "\nEl numero de Mujeres en el Consecionario es de: " + contF);

    }

    

   

}
