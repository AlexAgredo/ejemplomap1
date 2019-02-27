/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexander.agredo
 */
public class Cliente {

    private String nombre;

    private String idcliente;

    private String empresa;

    public Cliente() {
    }

    public Cliente(String nombre, String idcliente, String empresa) {
        this.nombre = nombre;
        this.idcliente = idcliente;
        this.empresa = empresa;
    }

    /**
     * Get the value of empresa
     *
     * @return the value of empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Set the value of empresa
     *
     * @param empresa new value of empresa
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Get the value of idcliente
     *
     * @return the value of idcliente
     */
    public String getIdcliente() {
        return idcliente;
    }

    /**
     * Set the value of idcliente
     *
     * @param idcliente new value of idcliente
     */
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre + "," + idcliente + "," + empresa;
    }

    
    
    
    
}
