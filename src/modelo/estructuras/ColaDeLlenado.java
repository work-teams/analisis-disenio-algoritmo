/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.estructuras;

import modelo.objetos.Pedido;

/**
 *
 * @author krypt97
 */
public class ColaDeLlenado implements Cola {

    // ATRIBUTOS DE CLASE
    protected Nodo cabeza, ultimo;

    // CLASE INTERNA NODO
    public class Nodo {

        public Pedido pedido;
        public Nodo siguiente;

        public Nodo(Pedido miPedido) {
            this.pedido = miPedido;
        }

    }

    // MÉTODOS DE CLASE
    @Override
    public void encolar(Pedido pedido) {
        Nodo nuevoNodo = new Nodo(pedido);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
        }
        ultimo = nuevoNodo;
    }

    @Override
    public void desencolar() {
        if (cabeza != null) {
            Nodo eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;
            if (cabeza == null) {
                ultimo = null;
            }
        }
    }

    @Override
    public Pedido obtener() {
        if (cabeza == null) {
            return null;
        } else {
            return cabeza.pedido;
        }
    }

}
