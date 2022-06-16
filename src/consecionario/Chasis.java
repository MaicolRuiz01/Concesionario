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
public class Chasis {
    
    private Integer numero;
    private String proicedencia;

    public Chasis(Integer numero, String proicedencia) {
        this.numero = numero;
        this.proicedencia = proicedencia;
    }

    public Chasis() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProicedencia() {
        return proicedencia;
    }

    public void setProicedencia(String proicedencia) {
        this.proicedencia = proicedencia;
    }
    
    
    
}
