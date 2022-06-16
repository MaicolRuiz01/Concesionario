/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Cliente {

    private String documento;
    private String nombre;
    private String apellido;
    private String direccion;
    private Character genero;
    private ArrayList<Automovil> automoviles;

    public Cliente(String documento, String nombre, String apellido, String direccion, Character genero) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
        automoviles = new ArrayList<>();
    }

    public Cliente() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public void contar() {
        int m = 0;
        int h = 0;
        if (genero == 'm') {
            m++;

        }
        if (genero == 'h') {
            h++;

            System.out.println("El numero de hombres es " + h);
        }

    }

    public void comprarAutomovil(Automovil auto) {
        automoviles.add(auto);

        System.out.println("Cliente :" + nombre + " Documento: " + documento + " Genero: " + genero);
        System.out.println("Modelo: " + auto.getModelo() + " Marca: " + auto.getMarca() + " # puerta: " + auto.getnPuertas());
        System.out.println("Capacidad del motor " + auto.getMotor().getCapacidad());
        System.out.println("Procedencia del chasis: " + auto.getChasis().getProicedencia());

//        for (int i = 0; i < automoviles.size(); i++) {
//            System.out.println("--->" + automoviles.toString());
//
//        }
    }
}
