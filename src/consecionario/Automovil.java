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
public class Automovil {
    
    
   
    private String marca;
    private String modelo;
    private Integer nPuertas;
    private Motor motor=new Motor(100,5);
    private Chasis chasis=new Chasis(54,"China");
    

    public Automovil() {
    }

    public Automovil( String marca, String modelo, Integer nPuertas) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.nPuertas = nPuertas;
    }

    

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    

    

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(Integer nPuertas) {
        this.nPuertas = nPuertas;
    }
    
    public void actualizar(String marca, String modelo, Integer nPuertas){
        this.marca=marca;
        this.modelo=modelo;
        this.nPuertas=nPuertas;
        
        System.out.println("LAS VARIABLES SE HAN ACTIALIZADO");
        System.out.println("Marca: "+this.marca+"\n Modelo: "+this.modelo+"\n Numero de Puertas: "+this.nPuertas);
    
    }
    
    
}
