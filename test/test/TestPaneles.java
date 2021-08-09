/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
public class TestPaneles {

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
        // No colocar absolute layout al JFrame (solo a sus componenetes) sino, no agrega los paneles
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        miVentanaPrincipal.setSize(800, 930); // No sé, porque no cuadra el 900 high del diseño

        // Instancias de paneles
        PanelRegistrarPedido miRegistrarPedido = new PanelRegistrarPedido();
        miRegistrarPedido.setSize(800, 780);

        PanelColaEspera miColaEspera = new PanelColaEspera();
        miColaEspera.setSize(800, 780);

        PanelColaLlenado miColaLlenado = new PanelColaLlenado();
        miColaLlenado.setSize(800, 780);

        PanelPedidosRechazados misPedidosRechazados = new PanelPedidosRechazados();
        misPedidosRechazados.setSize(800, 780);

        PanelHistorialPedidos miHistorialPedidos = new PanelHistorialPedidos();
        miHistorialPedidos.setSize(800, 780);

        // Agregando paneles a ventana principal
        miVentanaPrincipal.jPanel3.add(miRegistrarPedido);
        miVentanaPrincipal.jPanel3.add(miColaEspera);
        miVentanaPrincipal.jPanel3.add(miColaLlenado);
        miVentanaPrincipal.jPanel3.add(misPedidosRechazados);
        miVentanaPrincipal.jPanel3.add(miHistorialPedidos);
        miVentanaPrincipal.jPanel3.add(miHistorialPedidos);

        // Mostrando ventana principal
        miVentanaPrincipal.setVisible(true);

        // Monstrando paneles
        miRegistrarPedido.setVisible(true);
//        miRegistrarPedido.setVisible(false);

//        miColaEspera.setVisible(true);
        miColaEspera.setVisible(false);

//        miColaLlenado.setVisible(true);
        miColaLlenado.setVisible(false);

//        misPedidosRechazados.setVisible(true);
        misPedidosRechazados.setVisible(false);

//        miHistorialPedidos.setVisible(true);
        miHistorialPedidos.setVisible(false);
    }

}
