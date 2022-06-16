/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionario;

/**
 *
 * @author estudiante
 */
public class Motor {
    private Integer capacidad;
    private Integer numSerie;

    public Motor() {
    }

    public Motor(Integer capacidad, Integer numSerie) {
        this.capacidad = capacidad;
        this.numSerie = numSerie;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(Integer numSerie) {
        this.numSerie = numSerie;
    }
    
    
    
}
