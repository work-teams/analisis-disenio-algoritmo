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
public interface ColaLlenado {
    // METODOS A IMPLEMENTAR
    public void encolar(Pedido miPedido);
    public void desencolar();
    public Pedido obtener();
}
