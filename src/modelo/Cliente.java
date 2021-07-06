/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author krypt97
 */
public class Cliente {
    // ATRIBUTS DE CLASE
    private String dni;
    private String nombre;
    private String apellido;
    private String estado_paciente;
    
    // CONSTRUCTOR
    public Cliente(String dni, String nombre, String apellido, String estado_paciente) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado_paciente = estado_paciente;
    }

    // SETTERS AND GETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getEstado_paciente() {
        return estado_paciente;
    }

    public void setEstado_paciente(String estado_paciente) {
        this.estado_paciente = estado_paciente;
    }
    
}
