/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.objetos;

/**
 *
 * @author krypt97
 */
public class Cliente {
    // ATRIBUTOS DE CLASE
    private String dni;
    private String nombre;
    private String apellido;
    private int estado_paciente; // 0=GRAVE, 1=MODERADO, 2=LEVE
    
    // CONSTRUCTOR
    public Cliente(String dni, String nombre, String apellido, int estado_paciente) {
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

    public int getEstado_paciente() {
        return estado_paciente;
    }

    public void setEstado_paciente(int estado_paciente) {
        this.estado_paciente = estado_paciente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", estado_paciente=" + estado_paciente + '}';
    }
    
}
