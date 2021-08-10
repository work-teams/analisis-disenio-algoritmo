/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.estructuras;

import java.util.LinkedList;
import modelo.objetos.Pedido;

/**
 *
 * @author krypt97
 */
public class Lista {

    // Atributos de clase
    Nodo cabeza;
    Nodo ultimo;
    int tamanio = 0;

    // Atributos a conectar
    private ColaDeEspera miColaDeEspera;
    private ColaDeLlenado miColaDeLlenado;
    private ColaDeEspera miColaDeRechazados;

    // Constructor
    public Lista(ColaDeEspera miColaDeEspera, ColaDeLlenado miColaDeLlenado, ColaDeEspera miColaDeRechazados) {
        this.miColaDeEspera = miColaDeEspera;
        this.miColaDeLlenado = miColaDeLlenado;
        this.miColaDeRechazados = miColaDeRechazados;
    }

    public Lista() {
    }

    // Métodos de clase
    public void agregarPedido(Pedido miPedido) {
        Nodo nuevoNodo = new Nodo(miPedido);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
        }
        ultimo = nuevoNodo;
        tamanio++;
    }

    public LinkedList<Pedido> obtenerLista() {
        LinkedList<Pedido> misPedidos = new LinkedList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            misPedidos.add(actual.pedido);
            actual = actual.siguiente;
        }
        return misPedidos;
    }

    public void recorrerLista() { // Método de prueba
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.pedido.getEstado());
            actual = actual.siguiente;
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void modificarEstado(int idPedido, int nuevoEstado) {
        // Siempre existe el elemento a modificar
        if (cabeza != null) {
            Nodo actual = cabeza;
            while (actual.pedido.getId() != idPedido) {
                actual = actual.siguiente;
            }
            actual.pedido.setEstado(nuevoEstado);
        }
    }

    public void rellenarColas() {
        if (cabeza != null) {
            Nodo actual = cabeza;
            while (actual != null) {
                switch (actual.pedido.getEstado()) {
                    case 1:
                        miColaDeEspera.encolar(actual.pedido);
                        break;
                    case 2:
                        miColaDeLlenado.encolar(actual.pedido);
                        break;
                    case 3:
                        miColaDeRechazados.encolar(actual.pedido);
                }
                actual = actual.siguiente;
            }
            miColaDeEspera.ordenarPrioridad();
            miColaDeRechazados.ordenarPrioridad();
        }
    }
}
