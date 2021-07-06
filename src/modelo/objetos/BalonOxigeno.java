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
public class BalonOxigeno {
    // ATRIBUTOS DE CLASE
    private String codigo_balon;
    private float capacidad;

    // CONSTRUCTOR
    public BalonOxigeno(String codigo_balon, float capacidad) {
        this.codigo_balon = codigo_balon;
        this.capacidad = capacidad;
    }

    // SETTERS AND GETTERS
    public String getCodigo_balon() {
        return codigo_balon;
    }

    public void setCodigo_balon(String codigo_balon) {
        this.codigo_balon = codigo_balon;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
}
