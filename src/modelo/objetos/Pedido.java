/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author krypt97
 */
public class Pedido {
    private int id_pedido;
    private Date fecha_pedido;
    private Cliente miCliente;
    private ArrayList<BalonOxigeno> miBalonOxigeno;
    private boolean valido = false;
    private boolean despachado = false;

    public Pedido(int id_pedido, Date fecha_pedido, Cliente miCliente, ArrayList<BalonOxigeno> miBalonOxigeno) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.miCliente = miCliente;
        this.miBalonOxigeno = miBalonOxigeno;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Cliente getMiCliente() {
        return miCliente;
    }

    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }

    public ArrayList<BalonOxigeno> getMiBalonOxigeno() {
        return miBalonOxigeno;
    }

    public void setMiBalonOxigeno(ArrayList<BalonOxigeno> miBalonOxigeno) {
        this.miBalonOxigeno = miBalonOxigeno;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public boolean isDespachado() {
        return despachado;
    }

    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }
    
}
