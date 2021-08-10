/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import modelo.estructuras.ColaDeEspera;
import modelo.estructuras.ColaDeLlenado;
import modelo.estructuras.Lista;
import modelo.objetos.BalonOxigeno;
import modelo.objetos.Cliente;
import modelo.objetos.Pedido;

/**
 *
 * @author krypt97
 */
public class TestColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaDeLlenado miColaDeLlenado = new ColaDeLlenado();
        ColaDeEspera miColaDeEspera = new ColaDeEspera();
        ColaDeEspera miColaDeRechazados = new ColaDeEspera();
        Lista miLista = new Lista(miColaDeEspera, miColaDeLlenado, miColaDeRechazados);

        Cliente miCliente1 = new Cliente("111", "111", "111", 3);
        Cliente miCliente2 = new Cliente("222", "222", "222", 2);
        Cliente miCliente3 = new Cliente("333", "333", "333", 2);
        Cliente miCliente4 = new Cliente("444", "444", "444", 1);
        Cliente miCliente5 = new Cliente("555", "555", "555", 2);
        Cliente miCliente6 = new Cliente("666", "666", "666", 3);

        Pedido miPedido1 = new Pedido(1, null, miCliente1, null);
        Pedido miPedido2 = new Pedido(2, null, miCliente2, null);
        Pedido miPedido3 = new Pedido(3, null, miCliente3, null);
        Pedido miPedido4 = new Pedido(4, null, miCliente4, null);
        Pedido miPedido5 = new Pedido(5, null, miCliente5, null);
        Pedido miPedido6 = new Pedido(6, null, miCliente6, null);

        miLista.agregarPedido(miPedido1);
        miLista.agregarPedido(miPedido2);
        miLista.agregarPedido(miPedido3);
        miLista.agregarPedido(miPedido4);
        miLista.agregarPedido(miPedido5);
        miLista.agregarPedido(miPedido6);

        // 1=(Por defecto)Espera , 2=Llenado, 3=Rechazado , 4=EliminadoLogico
        miLista.modificarEstado(2, 2);
        miLista.modificarEstado(3, 2);
        miLista.modificarEstado(4, 3);
        miLista.modificarEstado(5, 3);
        miLista.modificarEstado(6, 4);

        miLista.rellenarColas();
        
        System.out.println(miColaDeEspera.getTamanio()); // Muestra cantidad de pedidos en espera
        System.out.println(miColaDeLlenado.getTamanio()); // Muestra cantidad de pedidos por llenar
        System.out.println(miColaDeRechazados.getTamanio()); // Muestra cantidad de pedidos rechazados
        System.out.println(miLista.getTamanio()); // Muestra cantidad total de pedidos (Historial)
    }
}
