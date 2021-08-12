/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.estructuras.ColaDeEspera;
import vista.PanelColaEspera;
import vista.PanelColaLlenado;
import vista.PanelHistorialPedidos;
import vista.PanelPedidosRechazados;
import vista.PanelRegistrarPedido;
import vista.VentanaPrincipal;

/**
 *
 * @author krypt97
 */
public class ControladorVistas {

    // Atributos de clase
    private VentanaPrincipal miVentanaPrincipal;
    private PanelRegistrarPedido miPanelRegistrarPedido;
    private PanelColaEspera miPanelColaEspera;
    private PanelColaLlenado miPanelColaLlenado;
    private PanelPedidosRechazados miPanelPedidosRechazados;
    private PanelHistorialPedidos miPanelHistorialPedidos;
    private ColaDeEspera miColaDeEspera;

    // Enlace a ventana principal
    public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.setSize(800, 930); // barra superior + area de diseño
        this.miVentanaPrincipal.setVisible(true);

    }

    // Enlace a panel registrar pedido
    public void setPanelRegistrarPedido(PanelRegistrarPedido miPanelRegistrarPedido) {
        this.miPanelRegistrarPedido = miPanelRegistrarPedido;
        this.miPanelRegistrarPedido.setSize(800, 780);
        this.miVentanaPrincipal.jPanel3.add(miPanelRegistrarPedido);
        this.miPanelRegistrarPedido.setVisible(false);
    }

    // Enlace a panel cola de espera
    public void setPanelColaEspera(PanelColaEspera miPanelColaEspera) {
        this.miPanelColaEspera = miPanelColaEspera;
        this.miPanelColaEspera.setSize(800, 780);
        this.miVentanaPrincipal.jPanel3.add(miPanelColaEspera);
        this.miPanelColaEspera.setVisible(false);
    }

    // Enlace a panel cola de llenado
    public void setPanelColaLlenado(PanelColaLlenado miPanelColaLlenado) {
        this.miPanelColaLlenado = miPanelColaLlenado;
        this.miPanelColaLlenado.setSize(800, 780);
        this.miVentanaPrincipal.jPanel3.add(miPanelColaLlenado);
        this.miPanelColaLlenado.setVisible(false);
    }

    // Enlace a panel pedidos rechazados
    public void setPanelPedidosRechazados(PanelPedidosRechazados miPanelPedidosRechazados) {
        this.miPanelPedidosRechazados = miPanelPedidosRechazados;
        this.miPanelPedidosRechazados.setSize(800, 780);
        miVentanaPrincipal.jPanel3.add(miPanelPedidosRechazados);
        this.miPanelPedidosRechazados.setVisible(false);
    }

    // Enlace a panel historial de pedidos
    public void setPanelHistorialPedidos(PanelHistorialPedidos miPanelHistorialPedidos) {
        this.miPanelHistorialPedidos = miPanelHistorialPedidos;
        this.miPanelHistorialPedidos.setSize(800, 780);
        miVentanaPrincipal.jPanel3.add(miPanelHistorialPedidos);
        this.miPanelHistorialPedidos.setVisible(false);
    }

    // Enlace a cola de espera
    public void setColaDeEspera(ColaDeEspera miColaDeEspera) {
        this.miColaDeEspera = miColaDeEspera;
    }

    // Métodos de clase controlador
    public void mostrarPanelRegistrarPedido() {
        this.miPanelColaEspera.setVisible(false);
        this.miPanelColaLlenado.setVisible(false);
        this.miPanelPedidosRechazados.setVisible(false);
        this.miPanelHistorialPedidos.setVisible(false);

        this.miPanelRegistrarPedido.setVisible(true);

    }

    public void mostrarPanelColaEspera() {
        this.miPanelRegistrarPedido.setVisible(false);
        this.miPanelColaLlenado.setVisible(false);
        this.miPanelPedidosRechazados.setVisible(false);
        this.miPanelHistorialPedidos.setVisible(false);

        this.miPanelColaEspera.setVisible(true);
        
        // Si la cola no esta vacia, carga las tablas
        if (miColaDeEspera.obtener() != null) {
            this.miColaDeEspera.ordenarPrioridad();
            this.miPanelColaEspera.setTblColaEspera(miColaDeEspera.getCola());
            this.miPanelColaEspera.setFormularioCliente(miColaDeEspera.obtener());
            this.miPanelColaEspera.setTblBalonesOxigeno(miColaDeEspera.obtener().getBalones());
        }
    }

    public void mostrarPanelColaLlenado() {
        this.miPanelRegistrarPedido.setVisible(false);
        this.miPanelColaEspera.setVisible(false);
        this.miPanelPedidosRechazados.setVisible(false);
        this.miPanelHistorialPedidos.setVisible(false);

        this.miPanelColaLlenado.setVisible(true);
    }

    public void mostrarPanelPedidosRechazados() {
        this.miPanelRegistrarPedido.setVisible(false);
        this.miPanelColaEspera.setVisible(false);
        this.miPanelColaLlenado.setVisible(false);
        this.miPanelHistorialPedidos.setVisible(false);

        this.miPanelPedidosRechazados.setVisible(true);
    }

    public void mostrarPanelHistorialPedidos() {
        this.miPanelRegistrarPedido.setVisible(false);
        this.miPanelColaEspera.setVisible(false);
        this.miPanelColaLlenado.setVisible(false);
        this.miPanelPedidosRechazados.setVisible(false);

        this.miPanelHistorialPedidos.setVisible(true);
    }
}
