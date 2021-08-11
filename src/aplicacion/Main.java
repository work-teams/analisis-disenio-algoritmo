/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import controlador.ControladorVistas;
import javax.swing.UIManager;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Look and Feel según el sistema operativo.
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        // Instancia ventana principal
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();

        // Instancias de paneles
        PanelRegistrarPedido miPanelRegistrarPedido = new PanelRegistrarPedido();
        PanelColaEspera miPanelColaEspera = new PanelColaEspera();
        PanelColaLlenado miPanelColaLlenado = new PanelColaLlenado();
        PanelPedidosRechazados miPanelPedidosRechazados = new PanelPedidosRechazados();
        PanelHistorialPedidos miPanelHistorialPedidos = new PanelHistorialPedidos();

        // Conectando controlador vistas a vistas (ventana, paneles)
        ControladorVistas miControladorVistas = new ControladorVistas();
        miControladorVistas.setVentanaPrincipal(miVentanaPrincipal);
        miControladorVistas.setPanelRegistrarPedido(miPanelRegistrarPedido);
        miControladorVistas.setPanelColaEspera(miPanelColaEspera);
        miControladorVistas.setPanelColaLlenado(miPanelColaLlenado);
        miControladorVistas.setPanelPedidosRechazados(miPanelPedidosRechazados);
        miControladorVistas.setPanelHistorialPedidos(miPanelHistorialPedidos);

        // Conectando ventana principal a controlador vistas
        miVentanaPrincipal.setControladorVistas(miControladorVistas);
    }

}